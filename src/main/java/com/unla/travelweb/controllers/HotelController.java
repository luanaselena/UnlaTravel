package com.unla.travelweb.controllers;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.services.IHotelService;
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
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_INDEX);
        mAV.addObject("hoteles", hotelService.getAll());
        return mAV;
    }
	
	@GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_NEW);
        mAV.addObject("hotel", new HotelModel());
        return mAV;
    }
	
	@PostMapping("/create")
    public RedirectView create(@ModelAttribute("hotel") HotelModel hotelModel) {
        hotelService.insert(hotelModel);
        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
    }
	
	 @GetMapping("/{id}")
	    public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_UPDATE);
	        mAV.addObject("hotel", hotelService.findById(id));
	        return mAV;
	    }
	 
	 @PostMapping("/update")
	    public RedirectView update(@ModelAttribute("hotel") HotelModel hotelModel) {
	        hotelService.update(hotelModel);
	        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
	    }

	    @PostMapping("/delete/{id}")
	    public RedirectView delete(@PathVariable("id") long id) {
	        hotelService.remove(id);
	        return new RedirectView(ViewRouteHelper.HOTEL_ROOT);
	    }
}
