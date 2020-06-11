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
import org.springframework.web.servlet.view.RedirectView;

import com.unla.travelweb.converters.ReservaActividadConverter;
import com.unla.travelweb.entities.ReservaActividad;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.ReservaActividadModel;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.IDestinoService;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.IReservaActividadService;

@Controller
@RequestMapping("/actividadUsuario")
public class ActividadUsuario {

	@Autowired
	@Qualifier ("actividadService")
	private IActividadService actividadService;
	
	@Autowired
	@Qualifier ("destinoService")
	private IDestinoService destinoService;
	
	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	
	@Autowired
	@Qualifier("reservaActividadService")
	private IReservaActividadService reservaActividadService;
	
	@Autowired
	@Qualifier("reservaActividadConverter")
	private ReservaActividadConverter reservaActividadConverter;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_USUARIO);
        mAV.addObject("actividades", actividadService.getAll());
        return mAV;
    }
	
	@GetMapping ("/actividadReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.ACTIVIDAD_RESERVA);
        mAV.addObject("actividad", actividadService.findById(id));
        return mAV;
    }
	
	//Aca iria la logica para insertar en el carrito al confirmar la reserva
	@PostMapping("/create")
    public ModelAndView create(@ModelAttribute("actividad") ActividadModel actividadModel,@AuthenticationPrincipal UserDetails currentUser) {
		
		User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());
		
		DestinoModel d = destinoService.findById(actividadModel.getId());
		System.out.println(d.getPais());
		ReservaActividadModel ra = new ReservaActividadModel(actividadModel.getNombre(), actividadModel.getFecha(), actividadModel.getValoracion(), actividadModel.isAccesibilidad(), 
				d, actividadModel.getPrecio(), actividadModel.getImgPath());
		
		user.getCarrito().getActividades().add(reservaActividadConverter.modelToEntity(ra));
		System.out.println(user.getCarrito().getActividades().size());
        reservaActividadService.insert(ra);
        return new ModelAndView("redirect:/actividadUsuario");
    }
	
	
}
