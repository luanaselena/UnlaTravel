package com.unla.travelweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.CarritoModel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.services.ICarritoService;
import com.unla.travelweb.services.IHotelService;

@Controller
@RequestMapping("/carrito")
public class CarritoController {
	@Autowired
	@Qualifier ("carritoService")
	private ICarritoService carritoService;
	
	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	@Autowired
	@Qualifier ("hotelConverter")
	private HotelConverter hotelConverter;
	
	
//	@GetMapping ("")
//	public ModelAndView index() {
//        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO_INDEX);
//        mAV.addObject("carritos", carritoService.getAll());
//        return mAV;
//    }
	
	@RequestMapping ("")
	public ModelAndView index(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO_INDEX);
        User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());
        model.addAttribute("currentUser", user);
        model.addAttribute("hoteles", user.getCarrito().getHoteles());
        model.addAttribute("actividades", user.getCarrito().getActividades());
        model.addAttribute("vuelos", user.getCarrito().getVuelos());

        return mAV;
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
