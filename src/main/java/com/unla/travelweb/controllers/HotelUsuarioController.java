package com.unla.travelweb.controllers;

import java.util.ArrayList;
import java.util.List;

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

import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.converters.ReservaHotelConverter;
import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.ReservaHotel;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.ReservaHotelModel;
import com.unla.travelweb.models.TipoHabitacionModel;
import com.unla.travelweb.models.TipoRegimenModel;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.IReservaHotelService;
import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

@Controller
@RequestMapping("/hotelUsuario")
public class HotelUsuarioController {

	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	@Autowired
	@Qualifier ("reservaHotelService")
	private IReservaHotelService reservaHotelService;
	@Autowired
	@Qualifier("tipoHabitacionService")
	private ITipoHabitacionService tipoHabitacionService;
	@Autowired
	@Qualifier("tipoServicioService")
	private ITipoServicioService tipoServicioService;
	@Autowired
	@Qualifier("tipoRegimenService")
	private ITipoRegimenService tipoRegimenService;
	@Autowired
	@Qualifier("tipoAlojamientoService")
	private ITipoAlojamientoService tipoAlojamientoService;
	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	@Autowired
	@Qualifier ("hotelConverter")
	private HotelConverter hotelConverter;
	@Autowired
	@Qualifier("tipoAlojamientoConverter")
	private TipoAlojamientoConverter tipoAlojamientoConverter;
	@Autowired
	@Qualifier("tipoHabitacionConverter")
	private TipoHabitacionConverter tipoHabitacionConverter;
	@Autowired
	@Qualifier("tipoRegimenConverter")
	private TipoRegimenConverter tipoRegimenConverter;
	
	@Autowired
	@Qualifier("tipoServicioConverter")
	private TipoServicioConverter tipoServicioConverter;
	
	@Autowired
	@Qualifier("reservaHotelConverter")
	private ReservaHotelConverter reservaHotelConverter;
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_USUARIO);
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        return mAV;
    }
	
	@GetMapping ("/hotelReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOTEL_RESERVA);
        mAV.addObject("hotel", hotelService.findById(id));
        mAV.addObject("habitaciones", tipoHabitacionService.getAll());
        mAV.addObject("regimenes", tipoRegimenService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        return mAV;
    }
	
	//Aca iria la logica para insertar en el carrito al confirmar la reserva
	@PostMapping("/create")
    public ModelAndView create(@ModelAttribute("hotel") HotelModel hotelModel,@AuthenticationPrincipal UserDetails currentUser) {

		TipoHabitacionModel t = tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId());
		TipoRegimenModel r = tipoRegimenService.findById(hotelModel.getTipoRegimen().getId());
		
		User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());
		
		ReservaHotelModel rh = new ReservaHotelModel(hotelModel.getNombre(), hotelModel.getCantEstrellas(), hotelModel.getTipoAlojamiento(), 
				t,r, hotelModel.isAccesibilidad(), hotelModel.getCantPersonas(),hotelModel.getPrecio(), hotelModel.getImgPath());
		
		rh.setTipoServicio(pasarServicios(tipoServicioService.getAll()));
		user.getCarrito().getHoteles().add(reservaHotelConverter.modelToEntity(rh));
        
		
        reservaHotelService.insert(rh);
        return new ModelAndView("redirect:/hotelUsuario");
    }
	
	
	public List<TipoServicioModel> pasarServicios(List<TipoServicio> set){
		
		List<TipoServicioModel> lista = new ArrayList<TipoServicioModel>();
		for(TipoServicio t : set) {
			TipoServicioModel ts = tipoServicioConverter.entityToModel(t);
			lista.add(ts);
		}
		return lista;
	}
	
}
