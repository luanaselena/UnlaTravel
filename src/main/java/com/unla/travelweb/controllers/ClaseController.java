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

import com.unla.travelweb.models.ClaseModel;

import com.unla.travelweb.services.IClaseService;

@Controller
@RequestMapping("/clase")
public class ClaseController {

	@Autowired
	@Qualifier("claseService")
	private IClaseService claseService;

	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLASE_INDEX);

		mAV.addObject("clases", claseService.getAll());
		return mAV;
	}

	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLASE_NEW);
		mAV.addObject("clase", new ClaseModel());
		return mAV;
	}

	@PostMapping("/create")
	public ModelAndView create(@ModelAttribute("clase") ClaseModel claseModel) {
		claseService.insert(claseModel);
		return new ModelAndView("redirect:/clase");
	}

	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLASE_UPDATE);
	        mAV.addObject("clase", claseService.findById(id));
	        return mAV;
	}

	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("clase") ClaseModel claseModel) {
		claseService.update(claseModel);
		return new RedirectView(ViewRouteHelper.CLASE_ROOT);
	}

	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") long id) {
		claseService.remove(id);
		return new RedirectView(ViewRouteHelper.CLASE_ROOT);
	}

	

}
