package com.unla.travelweb.services.implementation;

import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.models.HotelModel;

import com.unla.travelweb.repositories.IHotelRepository;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.ITipoAlojamientoService;
import com.unla.travelweb.services.ITipoHabitacionService;
import com.unla.travelweb.services.ITipoRegimenService;
import com.unla.travelweb.services.ITipoServicioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hotelService")
public class HotelService implements IHotelService {
	
	@Autowired
	@Qualifier("hotelRepository")
    private IHotelRepository hotelRepository;
	
	@Autowired
    @Qualifier("hotelConverter")
    private HotelConverter hotelConverter;
	
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
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    @Override
    public HotelModel insert(HotelModel hotelModel) {
    	hotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(hotelModel.getTipoAlojamiento().getId()));
//    	hotelModel.setTipoHabitacion(tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId()));
//    	hotelModel.setTipoRegimen(tipoRegimenService.findById(hotelModel.getTipoRegimen().getId()));

    	Hotel hotel = hotelRepository.save(hotelConverter.modelToEntity(hotelModel));
        return hotelConverter.entityToModel(hotel);

    }

    @Override
    public HotelModel update(HotelModel hotelModel) {

    	hotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(hotelModel.getTipoAlojamiento().getId()));
//    	hotelModel.setTipoHabitacion(tipoHabitacionService.findById(hotelModel.getTipoHabitacion().getId()));
//    	hotelModel.setTipoRegimen(tipoRegimenService.findById(hotelModel.getTipoRegimen().getId()));
    	
    	Hotel hotel = hotelRepository.save(hotelConverter.modelToEntity(hotelModel));
        return hotelConverter.entityToModel(hotel);
    }

    @Override
    public boolean remove(long id){
        try{
            hotelRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public HotelModel findById(long id) {
        return hotelConverter.entityToModel(hotelRepository.findById(id));
    }

	@Override
	public HotelModel findByNombre(String nombre) {
		return hotelConverter.entityToModel(hotelRepository.findByNombre(nombre));
	}
}
