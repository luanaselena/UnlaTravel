package com.unla.travelweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.travelweb.converters.ReservaVueloConverter;
import com.unla.travelweb.converters.DestinoConverter;
import com.unla.travelweb.converters.ClaseConverter;
import com.unla.travelweb.converters.AerolineaConverter;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.AerolineaModel;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.ReservaVueloModel;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.services.IAerolineaService;
import com.unla.travelweb.services.ICalificacionAerolineaService;
import com.unla.travelweb.services.IClaseService;
import com.unla.travelweb.services.IDestinoService;
import com.unla.travelweb.services.IVueloService;

import com.unla.travelweb.services.IReservaVueloService;

@Controller
@RequestMapping("/vueloUsuario")
public class VueloUsuarioController {
	
	@Autowired
	@Qualifier ("vueloService")
	private IVueloService vueloService;
	
	@Autowired
	@Qualifier ("reservaVueloService")
	private IReservaVueloService reservaVueloService;
	
	@Autowired
	@Qualifier ("claseService")
	private IClaseService claseService;
	
	@Autowired
	@Qualifier ("destinoService")
	private IDestinoService destinoService;
	
	@Autowired
	@Qualifier("aerolineaService")
	private IAerolineaService aerolineaService;
	
	@Autowired
	@Qualifier("calificacionAerolineaService")
	private ICalificacionAerolineaService calificacionAerolineaService;
	
	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	
	@Autowired
	@Qualifier("reservaVueloConverter")
	private ReservaVueloConverter reservaVueloConverter;
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.VUELO_USUARIO);
        mAV.addObject("vuelos", vueloService.getAll());
        return mAV;
    }
	
	@GetMapping ("/vueloReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.VUELO_RESERVA);
        mAV.addObject("vuelo", vueloService.findById(id));
        mAV.addObject("clases", claseService.getAll());
        return mAV;
    }
	
	@PostMapping("/create")
    public ModelAndView create(@ModelAttribute("vuelo") VueloModel vueloModel,@AuthenticationPrincipal UserDetails currentUser) {

		vueloModel.setClase(claseService.findById(vueloModel.getClase().getId()));
		
		vueloModel.setAerolinea(aerolineaService.findById(vueloModel.getAerolinea().getId()));
		
		vueloModel.setOrigen(destinoService.findById(vueloModel.getOrigen().getId()));
		
		vueloModel.setDestino(destinoService.findById(vueloModel.getDestino().getId()));
		
		User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());
		
		vueloModel.setPrecio(Math.round((vueloService.calcularPrecio(4, vueloModel.getOrigen(), vueloModel.getDestino(), vueloModel.getClase(),vueloModel.getCantPersonas()))));
		
		ReservaVueloModel rv = new ReservaVueloModel(vueloModel.getFechaIda(), vueloModel.getFechaVuelta(), vueloModel.getAerolinea(), vueloModel.getClase(),
				vueloModel.isEscalaIncluida(),vueloModel.getOrigen(), vueloModel.getDestino(), vueloModel.getPrecio(),vueloModel.getCantPersonas());
		

		user.getCarrito().getVuelos().add(reservaVueloConverter.modelToEntity(rv));
        
		
        reservaVueloService.insert(rv);
        
        
        return new ModelAndView("redirect:/vueloUsuario");
    }
	

}