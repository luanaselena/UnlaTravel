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
import com.unla.travelweb.models.CarritoModel;
import com.unla.travelweb.services.ICarritoService;

@Controller
@RequestMapping("/carrito")
public class CarritoController {
	@Autowired
	@Qualifier ("carritoService")
	private ICarritoService carritoService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO_INDEX);
        mAV.addObject("carritos", carritoService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO_NEW);
        mAV.addObject("carrito", new CarritoModel());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("carrito") CarritoModel carritoModel) {
        carritoService.insert(carritoModel);
        return new RedirectView(ViewRouteHelper.CARRITO_ROOT);
    }
	
	@GetMapping("/{id}")
    public ModelAndView get(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO_UPDATE);
        mAV.addObject("carrito", carritoService.findById(id));
        return mAV;
    }
	
	@PostMapping("/update")
    public RedirectView update(@ModelAttribute("carrito") CarritoModel carritoModel) {
        carritoService.update(carritoModel);
        return new RedirectView(ViewRouteHelper.CARRITO_ROOT);
    }
	
	@PostMapping("/delete/{id}")
    public RedirectView delete(@PathVariable("id") long id) {
        carritoService.remove(id);
        return new RedirectView(ViewRouteHelper.CARRITO_ROOT);
    }

}
