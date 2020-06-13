package com.unla.travelweb.controllers;

import java.util.ArrayList;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.converters.PaqueteConverter;
import com.unla.travelweb.converters.ReservaHotelConverter;
import com.unla.travelweb.converters.ReservaVueloConverter;
import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.PaqueteModel;
import com.unla.travelweb.models.ReservaHotelModel;
import com.unla.travelweb.models.ReservaVueloModel;
import com.unla.travelweb.models.TipoHabitacionModel;
import com.unla.travelweb.models.TipoRegimenModel;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.IPaqueteService;
import com.unla.travelweb.services.IReservaHotelService;
import com.unla.travelweb.services.IReservaVueloService;
import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

@Controller
@RequestMapping("/paqueteUsuario")
public class PaqueteUsuarioController {

	@Autowired
	@Qualifier ("hotelService")
	private IHotelService hotelService;
	@Autowired
	@Qualifier ("paqueteService")
	private IPaqueteService paqueteService;
	@Autowired
	@Qualifier ("reservaHotelService")
	private IReservaHotelService reservaHotelService;
	@Autowired
	@Qualifier ("reservaVueloService")
	private IReservaVueloService reservaVueloService;
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
	
	@Autowired
	@Qualifier("reservaVueloConverter")
	private ReservaVueloConverter reservaVueloConverter;
	
	@Autowired
	@Qualifier("paqueteConverter")
	private PaqueteConverter paqueteConverter;
	
	
	@GetMapping ("")
	public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_USUARIO);
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        mAV.addObject("paquetes", paqueteService.getAll());
        return mAV;
    }
	
	@GetMapping ("/paqueteReserva/{id}")
	public ModelAndView reservar(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_RESERVA);
        mAV.addObject("paquete", paqueteService.findById(id));
        mAV.addObject("habitaciones", tipoHabitacionService.getAll());
        mAV.addObject("regimenes", tipoRegimenService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());

        return mAV;
    }
	
	//Aca iria la logica para insertar en el carrito al confirmar la reserva
	@PostMapping("/create")
    public ModelAndView create(@ModelAttribute("paquete") PaqueteModel paqueteModel,@AuthenticationPrincipal UserDetails currentUser) {
		HotelModel hotelModel = paqueteModel.getHotel();
		VueloModel vueloModel = paqueteModel.getVuelo();
		
		TipoHabitacionModel t = tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId());
		TipoRegimenModel r = tipoRegimenService.findById(hotelModel.getTipoRegimen().getId());
		
		User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());
		
	    int dias=(int) ((hotelModel.getFechaFin().getTime()-hotelModel.getFechaInicio().getTime())/86400000);

		double precioTotal = hotelModel.getPrecio();
		double ph = precioTotal*t.getPorcentajeAumento();
		double pr = precioTotal*r.getPorcentajeAumento();
		precioTotal+=ph+pr;
		precioTotal*=dias;

		if(hotelModel.getCantPersonas()>4) {
			precioTotal*=Math.round(hotelModel.getCantPersonas()/4)+1;
		}
		
		ReservaHotelModel rh = new ReservaHotelModel(hotelModel.getNombre(), hotelModel.getCantEstrellas(), hotelModel.getTipoAlojamiento(),
				t,r, hotelModel.isAccesibilidad(), hotelModel.getCantPersonas(),precioTotal, hotelModel.getImgPath(), hotelModel.getFechaInicio(), hotelModel.getFechaFin());
		
		ReservaVueloModel rv = new ReservaVueloModel(vueloModel.getFechaIda(), vueloModel.getFechaVuelta(), vueloModel.getAerolinea(), vueloModel.getClase(), vueloModel.isEscalaIncluida(), vueloModel.getOrigen(), vueloModel.getDestino(), vueloModel.getPrecio(), vueloModel.getCantPersonas());
		
		rh.setTipoServicio(pasarServicios(tipoServicioService.getAll()));
		
		user.getCarrito().getHoteles().add(reservaHotelConverter.modelToEntity(rh));
		user.getCarrito().getVuelos().add(reservaVueloConverter.modelToEntity(rv));
        
		
        reservaHotelService.insert(rh);
        reservaVueloService.insert(rv);
        return new ModelAndView("redirect:/paqueteUsuario");
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
