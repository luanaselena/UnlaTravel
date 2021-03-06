package com.unla.travelweb.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.travelweb.converters.ActividadConverter;
import com.unla.travelweb.converters.AerolineaConverter;
import com.unla.travelweb.converters.ClaseConverter;

import com.unla.travelweb.converters.DestinoConverter;
import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.converters.PaqueteConverter;
import com.unla.travelweb.converters.ReservaActividadConverter;
import com.unla.travelweb.converters.ReservaHotelConverter;
import com.unla.travelweb.converters.ReservaVueloConverter;
import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.converters.UsuarioConverter;
import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.ListaUsuariosModel;
import com.unla.travelweb.models.PaqueteModel;
import com.unla.travelweb.models.ReservaActividadModel;
import com.unla.travelweb.models.ReservaHotelModel;
import com.unla.travelweb.models.ReservaVueloModel;
import com.unla.travelweb.models.TipoHabitacionModel;
import com.unla.travelweb.models.TipoRegimenModel;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.models.UsuarioModel;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.repositories.IActividadRepository;
import com.unla.travelweb.repositories.IUserRepository;

import com.unla.travelweb.services.IActividadService;
import com.unla.travelweb.services.IAerolineaService;
import com.unla.travelweb.services.ICalificacionAerolineaService;

import com.unla.travelweb.services.IClaseService;
import com.unla.travelweb.services.IDestinoService;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.IPaqueteService;
import com.unla.travelweb.services.IReservaActividadService;
import com.unla.travelweb.services.IReservaHotelService;
import com.unla.travelweb.services.IReservaVueloService;
import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;
import com.unla.travelweb.services.IUsuarioService;
import com.unla.travelweb.services.IVueloService;

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
	@Qualifier("reservaActividadConverter")
	private ReservaActividadConverter reservaActividadConverter;
	
	@Autowired
	@Qualifier("reservaActividadService")
	private IReservaActividadService reservaActividadService;
	
	@Autowired
	@Qualifier("paqueteConverter")
	private PaqueteConverter paqueteConverter;
	
	@Autowired
	@Qualifier ("destinoService")
	private IDestinoService destinoService;

	
	@Autowired
	@Qualifier ("actividadService")
	private IActividadService actividadService;
	
	@Autowired
	@Qualifier ("actividadRepository")
	private IActividadRepository actividadRepository;
	
	
	@Autowired
	@Qualifier ("actividadConverter")
	private ActividadConverter actividadConverter;
	
	@Autowired
	@Qualifier ("vueloService")
	private IVueloService vueloService;
	
	@Autowired
	@Qualifier ("claseService")
	private IClaseService claseService;
	
	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	@Autowired
	@Qualifier("aerolineaService")
	private IAerolineaService aerolineaService;
	
	@Autowired
	@Qualifier("calificacionAerolineaService")
	private ICalificacionAerolineaService calificacionAerolineaService;
	
	@Autowired
	@Qualifier("usuarioConverter")
	private UsuarioConverter usuarioConverter;
	
	@Autowired
	@Qualifier("usuarioService")
	private IUsuarioService usuarioService;
	
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
        mAV.addObject("aerolineas", aerolineaService.getAll());
        mAV.addObject("clases", claseService.getAll());

        List<Actividad> lista = new ArrayList<Actividad>();
        
        PaqueteModel p = paqueteService.findById(id);
        
        for(Actividad a : actividadService.getAll()) {
        	for(Paquete pa : a.getListaPaquetes()) {
        		if(pa.getId()==p.getId()) {
        			lista.add(a);
        		}
        	}
        }
        
        mAV.addObject("actividades",  lista);
        return mAV;
    }
	
	@GetMapping ("/paqueteReservaPersonalizada")
	public ModelAndView reservaPersonalizada() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.PAQUETE_RESERVAPERSONALIZADA);
        PaqueteModel paquete = new PaqueteModel();
        for(int i = 0 ; i < 5 ; i++) {
        	paquete.getActividades().add(new ActividadModel());
        }
        mAV.addObject("paquete", paquete);
        mAV.addObject("hoteles", hotelService.getAll());
        mAV.addObject("habitaciones", tipoHabitacionService.getAll());
        mAV.addObject("regimenes", tipoRegimenService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        mAV.addObject("destinos", destinoService.getAll());
        mAV.addObject("aerolineas", aerolineaService.getAll());
        mAV.addObject("clases", claseService.getAll());
        mAV.addObject("servicios", tipoServicioService.getAll());
        mAV.addObject("actividades1", actividadService.getAll());
        return mAV;
    }


	@PostMapping("/create")
    public ModelAndView create(@ModelAttribute("paquete") PaqueteModel paqueteModel,@AuthenticationPrincipal UserDetails currentUser, Model model) {
		HotelModel hotelModel = paqueteModel.getHotel();
		VueloModel vueloModel = paqueteModel.getVuelo();
		System.out.println(paqueteModel.getActividades().size());
		
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
		
		DestinoModel de = destinoService.findById(vueloModel.getDestino().getId());
		
		DestinoModel or = destinoService.findById(vueloModel.getOrigen().getId());

		ClaseModel c = claseService.findById(vueloModel.getClase().getId());
		
		double precio = Math.round((vueloService.calcularPrecio(4, or, de, c, vueloModel.getCantPersonas())));
		if(vueloModel.getFechaVuelta()==null) {
			precio/=2;
		}
		
		ReservaVueloModel rv = new ReservaVueloModel(rh.getFechaInicio(),rh.getFechaFin(),vueloModel.getAerolinea(), vueloModel.getClase(), vueloModel.isEscalaIncluida(), vueloModel.getOrigen(), vueloModel.getDestino(), precio, rh.getCantPersonas());
		
		rh.setTipoServicio(pasarServicios(tipoServicioService.getAll()));
		
        List<Actividad> lista = new ArrayList<Actividad>();
        
        for(Actividad a : actividadService.getAll()) {
        	for(Paquete pa : a.getListaPaquetes()) {
        		if(pa.getId()==paqueteModel.getId()) {
        			lista.add(a);
        		}
        	}
        };
        
		for(int i = 0 ; i < lista.size();i++) {
			
			ReservaActividadModel ra = new ReservaActividadModel(lista.get(i).getNombre(), 
					randomDate(rv.getFechaIda(), rv.getFechaVuelta()), lista.get(i).getValoracion(), lista.get(i).isAccesibilidad(), 
					destinoConverter.entityToModel(lista.get(i).getDestino()), lista.get(i).getPrecio(), lista.get(i).getImgPath());
			
			user.getCarrito().getActividades().add(reservaActividadConverter.modelToEntity(ra));

		}
		

		user.getCarrito().getHoteles().add(reservaHotelConverter.modelToEntity(rh));
		user.getCarrito().getVuelos().add(reservaVueloConverter.modelToEntity(rv));
        
		
        reservaHotelService.insert(rh);
        reservaVueloService.insert(rv);
        
        if(rv.getCantPersonas()>=1) {
            ModelAndView mAV2= new ModelAndView(ViewRouteHelper.PAQUETE_FORMULARIO);

            ListaUsuariosModel listaUs = new ListaUsuariosModel(1);

            for(int i = 1 ; i <= rv.getCantPersonas(); i++) {
            	listaUs.getListaU().add(new UsuarioModel());
            }
            System.out.println("Tamaño de la lista:" + listaUs.getListaU().size());
            mAV2.addObject("listaUs", listaUs);
            
            model.addAttribute("listaUs", listaUs);
            
            return mAV2;
        }
        
        return new ModelAndView("redirect:/paqueteUsuario");
    }
	
	@PostMapping("/createPersonalizado")
    public ModelAndView createPersonalizado(@ModelAttribute("paquete") PaqueteModel paqueteModel,@AuthenticationPrincipal UserDetails currentUser, Model model) {
		HotelModel aux = hotelService.findById(paqueteModel.getHotel().getId());
		HotelModel hotelModel = paqueteModel.getHotel();
		VueloModel vueloModel = paqueteModel.getVuelo();

		
		TipoHabitacionModel t = tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId());
		TipoRegimenModel r = tipoRegimenService.findById(hotelModel.getTipoRegimen().getId());
		
		User user = (User) userRepository.findByUsernameAndFetchUserRolesEagerly(currentUser.getUsername());

		for(ActividadModel actAux: paqueteModel.getActividades()) {
			ActividadModel actEncontrada = actividadService.findById(actAux.getId());
			if(actAux.getFecha()!=null) {
				actEncontrada.setFecha(actAux.getFecha());
			}
			if(actEncontrada.getFecha()!=null) {
//				Actividad actividadFinal = actividadConverter.modelToEntity(actEncontrada);
//				Paquete paqueteFinal = paqueteConverter.modelToEntity(paqueteModel);
//				
//				actividadFinal.getListaPaquetes().add(paqueteFinal);
//				paqueteFinal.getActividades().add(actividadFinal);
//				
//				actividadRepository.save(actividadFinal);
				
				DestinoModel destinoFinal = destinoService.findById(actEncontrada.getDestino().getId());
				
				ReservaActividadModel ra = new ReservaActividadModel(actEncontrada.getNombre(), actEncontrada.getFecha(), actEncontrada.getValoracion(), 
				actEncontrada.isAccesibilidad(), destinoFinal, actEncontrada.getPrecio(), actEncontrada.getImgPath()); 
				
				reservaActividadService.insert(ra);
				user.getCarrito().getActividades().add(reservaActividadConverter.modelToEntity(ra));
			}
		}
				
	    int dias=(int) ((hotelModel.getFechaFin().getTime()-hotelModel.getFechaInicio().getTime())/86400000);

		double precioTotal = aux.getPrecio();
		double ph = precioTotal*t.getPorcentajeAumento();
		double pr = precioTotal*r.getPorcentajeAumento();
		precioTotal+=ph+pr;
		precioTotal*=dias;

		if(hotelModel.getCantPersonas()>4) {
			precioTotal*=Math.round(hotelModel.getCantPersonas()/4)+1;
		}
		
		hotelModel.getTipoAlojamiento().setTipo(aux.getTipoAlojamiento().getTipo());
		
		ReservaHotelModel rh = new ReservaHotelModel(aux.getNombre(), aux.getCantEstrellas(), hotelModel.getTipoAlojamiento(),
				t,r, aux.isAccesibilidad(), aux.getCantPersonas(),precioTotal, hotelModel.getImgPath(), hotelModel.getFechaInicio(), hotelModel.getFechaFin());
		
		DestinoModel de = destinoService.findById(vueloModel.getDestino().getId());
		
		DestinoModel or = destinoService.findById(vueloModel.getOrigen().getId());

		ClaseModel c = claseService.findById(vueloModel.getClase().getId());
		
		double precio = Math.round((vueloService.calcularPrecio(4, or, de, c, vueloModel.getCantPersonas())));
		if(vueloModel.getFechaVuelta()==null) {
			precio/=2;
		}
		
		ReservaVueloModel rv = new ReservaVueloModel(vueloModel.getFechaIda(),vueloModel.getFechaVuelta(),vueloModel.getAerolinea(), vueloModel.getClase(), vueloModel.isEscalaIncluida(), vueloModel.getOrigen(), vueloModel.getDestino(), precio, rh.getCantPersonas());
		
		rh.setTipoServicio(pasarServicios(tipoServicioService.getAll()));

		user.getCarrito().getHoteles().add(reservaHotelConverter.modelToEntity(rh));
		user.getCarrito().getVuelos().add(reservaVueloConverter.modelToEntity(rv));
        
		
        reservaHotelService.insert(rh);
        reservaVueloService.insert(rv);
        
        
        if(rv.getCantPersonas()>=1) {
            ModelAndView mAV2= new ModelAndView(ViewRouteHelper.PAQUETE_FORMULARIO);

            ListaUsuariosModel listaUs = new ListaUsuariosModel(1);

            for(int i = 1 ; i <= rv.getCantPersonas(); i++) {
            	listaUs.getListaU().add(new UsuarioModel());
            }
            System.out.println("Tamaño de la lista:" + listaUs.getListaU().size());
            mAV2.addObject("listaUs", listaUs);
            
            model.addAttribute("listaUs", listaUs);
            
            return mAV2;
        }
        return new ModelAndView("redirect:/paqueteUsuario");
    }
	
	@PostMapping("/formulariosOk")
	public ModelAndView formularios(@ModelAttribute("lista") ListaUsuariosModel lista) {
		
		ReservaVueloModel rv = reservaVueloService.findById(reservaVueloService.getAll().get(reservaVueloService.getAll().size() - 1).getId());

		//agregar usuarios con save/insert y setear lista
		for(int i = 0 ; i < lista.getListaU().size(); i++) {
			//Usuario u = usuarioConverter.modelToEntity(lista.getLista().get(i));
			UsuarioModel us = lista.getListaU().get(i);
			us.setReservaVuelo(reservaVueloService.findById(reservaVueloService.getAll().get(reservaVueloService.getAll().size() - 1).getId()));
			usuarioService.insert(us);
		}
		rv.setListaU(lista.getListaU());
		
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
	
	
	public static Date randomDate(Date inicio, Date fin) {
		int startyear = inicio.toLocalDate().getYear();
		int endyear = fin.toLocalDate().getYear();
		int startmonth = inicio.toLocalDate().getMonthValue(); 
		int endmonth = fin.toLocalDate().getMonthValue(); 
		int startday = inicio.toLocalDate().getDayOfMonth(); 
		int endday = fin.toLocalDate().getDayOfMonth();
		
		int year = (int)(Math.random()*(endyear-startyear+1))+startyear;	
		
		int month= (int)(Math.random()*(endmonth-startmonth+1))+startmonth;
		
		Calendar c = Calendar.getInstance();				
		c.set(year, month, 0);								
		//18-2+1
		int day = (int)(Math.random()*(endday-startday+1))+startday;	
		Date fecha=Date.valueOf(year+"-"+month+"-"+day);	
		
		return fecha;
	}
	
	@InitBinder     
    public void initBinder(WebDataBinder binder){
         binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
    }
	
}
