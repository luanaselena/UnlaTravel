package com.unla.travelweb.controllers;

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

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

@Controller
@RequestMapping("/hotelUsuario")
public class HotelUsuarioController {

	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	@Autowired
	@Qualifier("tipoHabitacionService")
	private ITipoHabitacionService tipoHabitacionService;
	@Autowired
	@Qualifier("tipoServicioService")
	private ITipoServicioService tipoServicioService;
	@Autowired
	@Qualifier("tipoRegimenService")
	private ITipoRegimenService tipoRegimenService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_USUARIO);
        mAV.addObject("hoteles", hotelService.getAll());
        return mAV;
    }
	
	@GetMapping ("/hotelReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") int id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_RESERVA);
        mAV.addObject("hotel", hotelService.getAll().get(id-1));
        mAV.addObject("habitaciones", tipoHabitacionService.getAll());
        mAV.addObject("regimenes", tipoRegimenService.getAll());
        return mAV;
    }
	
	//Aca iria la logica para insertar en el carrito al confirmar la reserva
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("hotel") HotelModel hotelModel) {
        hotelService.insert(hotelModel);
        return new RedirectView(ViewRouteHelper.HOTEL_USUARIO);
    }
	
	
}
