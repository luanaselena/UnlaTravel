package com.unla.travelweb.controllers;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.IDestinoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/actividad")
public class ActividadController {
	
	@Autowired
	@Qualifier ("actividadService")
	private IActividadService actividadService;
	
	@Autowired
	@Qualifier ("destinoService")
	private IDestinoService destinoService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_INDEX);
        mAV.addObject("actividades", actividadService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_NEW);
        mAV.addObject("actividad", new ActividadModel());
        mAV.addObject("destinos", destinoService.getAll());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("actividad") ActividadModel actividadModel) {
        actividadService.insert(actividadModel);
        return new RedirectView(ViewRouteHelper.ACTIVIDAD_ROOT);
    }
	
	 @GetMapping("/{id}")
	    public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_UPDATE);
	        mAV.addObject("actividad", actividadService.findById(id));
			mAV.addObject("destinos", destinoService.getAll());
	        return mAV;
	    }
	 
	 @PostMapping("/update")
	    public RedirectView update(@ModelAttribute("actividad") ActividadModel actividadModel) {
		 	DestinoModel d = destinoService.findById(actividadModel.getDestino().getId());
		 	actividadModel.setDestino(d);
	        actividadService.update(actividadModel);
	        return new RedirectView(ViewRouteHelper.ACTIVIDAD_ROOT);
	    }

	    @PostMapping("/delete/{id}")
	    public RedirectView delete(@PathVariable("id") long id) {
	        actividadService.remove(id);
	        return new RedirectView(ViewRouteHelper.ACTIVIDAD_ROOT);
	    }
}