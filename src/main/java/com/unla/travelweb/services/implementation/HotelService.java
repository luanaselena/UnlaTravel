package com.unla.travelweb.services.implementation;

import com.unla.travelweb.converters.HotelConverter;
import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.entities.TipoAlojamiento;
import com.unla.travelweb.models.TipoAlojamientoModel;
import com.unla.travelweb.repositories.IHotelRepository;
import com.unla.travelweb.services.IHotelService;
import com.unla.travelweb.services.ITipoAlojamientoService;
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

    @Override
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    @Override
    public HotelModel insert(HotelModel hotelModel) {
    	hotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(hotelModel.getTipoAlojamiento().getId()));
    	Hotel hotel = hotelRepository.save(hotelConverter.modelToEntity(hotelModel));
        return hotelConverter.entityToModel(hotel);

    }

    @Override
    public HotelModel update(HotelModel hotelModel) {

    	hotelModel.setTipoAlojamiento(tipoAlojamientoService.findById(hotelModel.getTipoAlojamiento().getId()));
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
