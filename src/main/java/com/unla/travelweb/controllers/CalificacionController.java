package com.unla.travelweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.CalificacionActividadModel;
import com.unla.travelweb.models.CalificacionAerolineaModel;
import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.ICalificacionActividadService;
import com.unla.travelweb.services.ICalificacionAerolineaService;
import com.unla.travelweb.services.implementation.ActividadService;
import com.unla.travelweb.services.implementation.AerolineaService;

@Controller
@RequestMapping("/calificar")
public class CalificacionController {

	@Autowired
	@Qualifier("aerolineaService")
	private AerolineaService aerolineaService;
	
	@Autowired
	@Qualifier("actividadService")
	private IActividadService actividadService;
	
	@Autowired
	@Qualifier("calificacionActividadService")
	private ICalificacionActividadService calificacionActividadService;
	
	@Autowired
	@Qualifier("calificacionAerolineaService")
	private ICalificacionAerolineaService calificacionAerolineaService;
	
	
	
	@GetMapping("")
    public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CALIFICAR_INDEX);
        return mAV;
    }

    @GetMapping("/new_act")
    public ModelAndView createCalificacionActividad() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CALIFICAR_ACTIVIDAD);
        mAV.addObject("actividades", actividadService.getAll());
        mAV.addObject("calificacionActividad", new CalificacionActividadModel());
        return mAV;
    }
    
    @GetMapping("/new_aero")
    public ModelAndView createCalificacionAerolinea() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CALIFICAR_AEROLINEA);
        mAV.addObject("aerolineas", aerolineaService.getAll());
        mAV.addObject("calificacionAerolinea", new CalificacionAerolineaModel());
        
        return mAV;
    }

    @PostMapping("/create_act")
    public RedirectView createCalificacionAct(@ModelAttribute("calificacionActividad") CalificacionActividadModel calificacionActividad, RedirectAttributes redirectAttrs){
    	calificacionActividad.setActividad(actividadService.findById(calificacionActividad.getActividad().getId()));
        calificacionActividadService.insert(calificacionActividad);
		redirectAttrs.addFlashAttribute("mensaje", "Su calificacion fue enviada exitosamente.");
		redirectAttrs.addFlashAttribute("clase", "success");
        return new RedirectView("redirect:/home/index");
    }
    
    @PostMapping("/create_aero")
    public RedirectView createCalificacionAero(@ModelAttribute("calificacionAerolinea") CalificacionAerolineaModel calificacionAerolinea, RedirectAttributes redirectAttrs) {
    	calificacionAerolinea.setAerolinea(aerolineaService.findById(calificacionAerolinea.getAerolinea().getId()));
    	calificacionAerolineaService.insert(calificacionAerolinea);
		redirectAttrs.addFlashAttribute("mensaje", "Su calificacion fue enviada exitosamente.");
		redirectAttrs.addFlashAttribute("clase", "success");
        return new RedirectView("redirect:/home/index");
    }
    
    
    
    
}
