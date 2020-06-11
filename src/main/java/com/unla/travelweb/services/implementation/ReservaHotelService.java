package com.unla.travelweb.services.implementation;

import com.unla.travelweb.converters.ReservaHotelConverter;
import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.ReservaHotel;
import com.unla.travelweb.models.ReservaHotelModel;
import com.unla.travelweb.repositories.IReservaHotelRepository;
import com.unla.travelweb.services.IReservaHotelService;
import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reservaHotelService")
public class ReservaHotelService implements IReservaHotelService {
	
	@Autowired
	@Qualifier("reservaHotelRepository")
    private IReservaHotelRepository reservahotelRepository;
	
	@Autowired
    @Qualifier("reservaHotelConverter")
    private ReservaHotelConverter reservaHotelConverter;
	
	@Autowired
	@Qualifier("tipoAlojamientoService")
	private ITipoAlojamientoService tipoAlojamientoService;
	
	@Qualifier("tipoHabitacionService")
	private ITipoHabitacionService tipoHabitacionService;
	@Autowired
	@Qualifier("tipoServicioService")
	private ITipoServicioService tipoServicioService;
	@Autowired
	@Qualifier("tipoRegimenService")
	private ITipoRegimenService tipoRegimenService;
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

    @Override
    public List<ReservaHotel> getAll(){
        return reservahotelRepository.findAll();
    }

    @Override
    public ReservaHotelModel insert(ReservaHotelModel reservaHotelModel) {
//    	reservaHotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(reservaHotelModel.getTipoAlojamiento().getId()));
//    	hotelModel.setTipoHabitacion(tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId()));
//    	hotelModel.setTipoRegimen(tipoRegimenService.findById(hotelModel.getTipoRegimen().getId()));

    	ReservaHotel hotel = reservahotelRepository.save(reservaHotelConverter.modelToEntity(reservaHotelModel));
        return reservaHotelConverter.entityToModel(hotel);

    }

    @Override
    public ReservaHotelModel update(ReservaHotelModel hotelModel) {

    	hotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(hotelModel.getTipoAlojamiento().getId()));
    	hotelModel.setTipoHabitacion(tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId()));
    	hotelModel.setTipoRegimen(tipoRegimenService.findById(hotelModel.getTipoRegimen().getId()));
    	
    	ReservaHotel hotel = reservahotelRepository.save(reservaHotelConverter.modelToEntity(hotelModel));
        return reservaHotelConverter.entityToModel(hotel);
    }

    @Override
    public boolean remove(long id){
        try{
            reservahotelRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public ReservaHotelModel findById(long id) {
        return reservaHotelConverter.entityToModel(reservahotelRepository.findById(id));
    }

	@Override
	public ReservaHotelModel findByNombre(String nombre) {
		return reservaHotelConverter.entityToModel(reservahotelRepository.findByNombre(nombre));
	}

	
}
