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
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.IHotelService;

@Controller
@RequestMapping("/actividadUsuario")
public class ActividadUsuario {

	@Autowired
	@Qualifier ("actividadService")
	private IActividadService actividadService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_USUARIO);
        mAV.addObject("actividades", actividadService.getAll());
        return mAV;
    }
	
	@GetMapping ("/actividadReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") int id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_RESERVA);
        mAV.addObject("act", actividadService.getAll().get(id-1));
        return mAV;
    }
	
	//Aca iria la logica para insertar en el carrito al confirmar la reserva
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("act") ActividadModel actividadModel) {
        actividadService.insert(actividadModel);
        return new RedirectView(ViewRouteHelper.ACTIVIDAD_USUARIO);
    }
	
	
}
