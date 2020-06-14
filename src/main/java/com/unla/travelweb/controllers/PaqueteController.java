package com.unla.travelweb.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.travelweb.converters.ActividadConverter;
import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.PaqueteModel;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.IPaqueteService;
import com.unla.travelweb.services.IVueloService;

@Controller
@RequestMapping("/paquete")
public class PaqueteController {
	
	@Autowired
	@Qualifier("paqueteService")
	private IPaqueteService paqueteService;
	
	@Autowired
	@Qualifier("hotelService")
	private IHotelService hotelService;
	
	@Autowired
	@Qualifier("vueloService")
	private IVueloService vueloService;
	
	@Autowired
	@Qualifier("actividadService")
	private IActividadService actividadService;
	
	@Autowired
	@Qualifier("actividadConverter")
	private ActividadConverter actividadConverter;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_INDEX);
        mAV.addObject("paquetes", paqueteService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_NEW);
        mAV.addObject("paquete", new PaqueteModel());
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("vuelos", vueloService.getAll());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("paquete") PaqueteModel paqueteModel) {
		HotelModel h = hotelService.findById(paqueteModel.getHotel().getId());
	 	VueloModel v = vueloService.findById(paqueteModel.getVuelo().getId());

	 	paqueteModel.setVuelo(v);
	 	paqueteModel.setHotel(h);
        paqueteService.insert(paqueteModel);
        return new RedirectView(ViewRouteHelper.PAQUETE_ROOT);
    }
	
	@GetMapping("/addActividad/{id}")
    public ModelAndView agregarAct(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_ACT);
        mAV.addObject("paquete", paqueteService.findById(id));
        mAV.addObject("actividades", actividadService.getAll());
        mAV.addObject("actividad", new ActividadModel());
        return mAV;
    }
	
	@PostMapping("/addAct")
    public RedirectView addAct(@ModelAttribute("paquete") PaqueteModel paqueteModel, @ModelAttribute("actividad") ActividadModel act) {

		ActividadModel a = actividadService.findById(act.getId());
		System.out.println(a.getNombre());
		
		
//		PaqueteModel paquete = paqueteService.findById(paqueteModel.getId());
//	 	HotelModel h = hotelService.findById(paqueteModel.getHotel().getId());
//	 	VueloModel v = vueloService.findById(paqueteModel.getVuelo().getId());
//	 	paquete.setVuelo(v);
//	 	paquete.setHotel(h);
//		
//
//		ActividadModel a = actividadService.findById(act.getId());
//		System.out.println(paquete.getActividades().get(0).getNombre());
//		paquete.getActividades().add(a);
		
		
//		a.getListaHoteles().add(paqueteModel);
//		actividadService.insert(a);
		
//		List<ActividadModel> lista = new ArrayList<ActividadModel>();
        
//		for(PaqueteModel paq : a.getListaHoteles()) {
//			if(paq.getId()==paqueteModel.getId()) {
//				System.out.println("entro");
//				paqueteModel.getActividades().add(a);
//				System.out.println(paqueteModel.getActividades().size());
//			}
//		}
//		
//        for(Actividad ac : actividadService.getAll()) {
//        	
//        	for(Paquete pa : ac.getListaPaquetes()) {
//        		System.out.println(ac.getNombre());
//        		System.out.println(pa.getId());
//        		if(pa.getId()==paqueteModel.getId()) {
//        			lista.add(actividadConverter.entityToModel(ac));
//        		}
//        	}
//        }
//		System.out.println(lista.size());
//		paqueteModel.setActividades(lista);
//		

//		paqueteService.update(paqueteModel);
		return new RedirectView(ViewRouteHelper.PAQUETE_ROOT);
    }
	
	@GetMapping("/{id}")
    public ModelAndView get(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_UPDATE);
        mAV.addObject("paquete", paqueteService.findById(id));
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("vuelos", vueloService.getAll());
        return mAV;
    }
	 
	@PostMapping("/update")
    public RedirectView update(@ModelAttribute("paquete") PaqueteModel paqueteModel) {
	 	HotelModel h = hotelService.findById(paqueteModel.getHotel().getId());
	 	VueloModel v = vueloService.findById(paqueteModel.getVuelo().getId());
	 	paqueteModel.setVuelo(v);
	 	paqueteModel.setHotel(h);
        paqueteService.update(paqueteModel);
        return new RedirectView(ViewRouteHelper.PAQUETE_ROOT);
    }

    @PostMapping("/delete/{id}")
    public RedirectView delete(@PathVariable("id") long id) {
        paqueteService.remove(id);
        return new RedirectView(ViewRouteHelper.PAQUETE_ROOT);
    }
	    
	    
	public List<ActividadModel> pasarServicios(List<Actividad> set){
		
		List<ActividadModel> lista = new ArrayList<ActividadModel>();
		for(Actividad a : set) {
			ActividadModel am = actividadConverter.entityToModel(a);
			lista.add(am);
		}
		return lista;
	}
}
