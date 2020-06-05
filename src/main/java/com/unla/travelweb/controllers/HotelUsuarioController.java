package com.unla.travelweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.services.IHotelService;

@Controller
@RequestMapping("/hotelUsuario")
public class HotelUsuarioController {

	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_USUARIO);
        mAV.addObject("hotel1", hotelService.getAll().get(0));
        mAV.addObject("hotel2", hotelService.getAll().get(1));
        mAV.addObject("hotel3", hotelService.getAll().get(2));
        mAV.addObject("hotel4", hotelService.getAll().get(3));
        mAV.addObject("hotel5", hotelService.getAll().get(4));
        mAV.addObject("hotel6", hotelService.getAll().get(5));
        return mAV;
    }
	
	
}
