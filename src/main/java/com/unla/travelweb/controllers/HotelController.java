package com.unla.travelweb.controllers;


import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.services.IHotelService;

import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	
	@Autowired
	@Qualifier("tipoAlojamientoService")
	private ITipoAlojamientoService tipoAlojamientoService;
	
	@Qualifier("tipoHabitacionService")
	private ITipoHabitacionService tipoHabitacionService;
	@Autowired
	@Qualifier("tipoServicioService")
	private ITipoServicioService tipoServicioService;
	@Autowired
	@Qualifier("tipoRegimenService")
	private ITipoRegimenService tipoRegimenService;
	@Autowired
	@Qualifier("tipoAlojamientoConverter")
	private TipoAlojamientoConverter tipoAlojamientoConverter;
	@Autowired
	@Qualifier("tipoHabitacionConverter")
	private TipoHabitacionConverter tipoHabitacionConverter;
	@Autowired
	@Qualifier("tipoRegimenConverter")
	private TipoRegimenConverter tipoRegimenConverter;
	
	@Autowired
	@Qualifier("tipoServicioConverter")
	private TipoServicioConverter tipoServicioConverter;
	
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_INDEX);
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_NEW);
        mAV.addObject("tipoAlojamientos", tipoAlojamientoService.getAll());
        mAV.addObject("hotel", new HotelModel());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("hotel") HotelModel hotelModel) {
		hotelModel.setTipoServicio(pasarServicios(tipoServicioService.getAll()));
		hotelModel.setImgPath("/assets/img/hoteles/"+hotelModel.getImgPath());
        hotelService.insert(hotelModel);
        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
    }
	
	 @GetMapping("/{id}")
	    public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_UPDATE);
	        mAV.addObject("hotel", hotelService.findById(id));
	        mAV.addObject("tipoAlojamientos", tipoAlojamientoService.getAll());
	        return mAV;
	    }
	 
	 @PostMapping("/update")
	    public RedirectView update(@ModelAttribute("hotel") HotelModel hotelModel) {
			hotelModel.setTipoServicio(pasarServicios(tipoServicioService.getAll()));
		 	System.out.println(hotelModel.getImgPath());
	        hotelService.update(hotelModel);
	        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
	    }

	    @PostMapping("/delete/{id}")
	    public RedirectView delete(@PathVariable("id") long id) {
	        hotelService.remove(id);
	        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
	    }
	    
	public List<TipoServicioModel> pasarServicios(List<TipoServicio> set){
		
		List<TipoServicioModel> lista = new ArrayList<TipoServicioModel>();
		for(TipoServicio t : set) {
			TipoServicioModel ts = tipoServicioConverter.entityToModel(t);
			lista.add(ts);
		}
		return lista;
	}
}
