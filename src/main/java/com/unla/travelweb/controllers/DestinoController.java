package com.unla.travelweb.controllers;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.services.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/destino")
public class DestinoController {
	
	@Autowired
	@Qualifier ("destinoService")
	private IDestinoService destinoService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.DESTINO_INDEX);
        mAV.addObject("destinos", destinoService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.DESTINO_NEW);
        mAV.addObject("destino", new DestinoModel());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("destino") DestinoModel destinoModel) {
        destinoService.insert(destinoModel);
        return new RedirectView(ViewRouteHelper.DESTINO_ROOT);
    }
	
	 @GetMapping("/{id}")
	    public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.DESTINO_UPDATE);
	        mAV.addObject("destino", destinoService.findById(id));
	        return mAV;
	    }
	 
	 @PostMapping("/update")
	    public RedirectView update(@ModelAttribute("destino") DestinoModel destinoModel) {
	        destinoService.update(destinoModel);
	        return new RedirectView(ViewRouteHelper.DESTINO_ROOT);
	    }

	    @PostMapping("/delete/{id}")
	    public RedirectView delete(@PathVariable("id") long id) {
	        destinoService.remove(id);
	        return new RedirectView(ViewRouteHelper.DESTINO_ROOT);
	    }
}