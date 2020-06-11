package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.AerolineaConverter;
import com.unla.travelweb.converters.ClaseConverter;
import com.unla.travelweb.converters.DestinoConverter;
import com.unla.travelweb.converters.ReservaVueloConverter;
import com.unla.travelweb.entities.Destino;
import com.unla.travelweb.entities.ReservaVuelo;
import com.unla.travelweb.models.AerolineaModel;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.ReservaVueloModel;
import com.unla.travelweb.repositories.IAerolineaRepository;
import com.unla.travelweb.repositories.IClaseRepository;
import com.unla.travelweb.repositories.IDestinoRepository;
import com.unla.travelweb.repositories.IReservaVueloRepository;
import com.unla.travelweb.services.IReservaVueloService;

@Service("reservaVueloService")
public class ReservaVueloService implements IReservaVueloService{

	@Autowired
	@Qualifier("reservaVueloRepository")
	private IReservaVueloRepository reservaVueloRepository;
	
	@Autowired
	@Qualifier("reservaVueloConverter")
	private ReservaVueloConverter reservaVueloConverter;
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	@Autowired
	@Qualifier("destinoRepository")
	private IDestinoRepository destinoRepository;
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@Autowired
	@Qualifier("claseRepository")
	private IClaseRepository claseRepository;
	
	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;
	
	@Autowired
	@Qualifier("aerolineaRepository")
	private IAerolineaRepository aerolineaRepository;
	
	
	@Override
	public List<ReservaVuelo> getAll() {
		return reservaVueloRepository.findAll();
	}

	@Override
	public ReservaVueloModel findById(long id) {
		return reservaVueloConverter.entityToModel(reservaVueloRepository.findById(id));
	}

	@Override
	public ReservaVueloModel insert(ReservaVueloModel vueloModel) {
		
		ReservaVuelo vuelo = reservaVueloRepository.save(reservaVueloConverter.modelToEntity(vueloModel));
		return reservaVueloConverter.entityToModel(vuelo);
	}

	@Override
	public ReservaVueloModel update(ReservaVueloModel vueloModel) {
		ReservaVuelo vuelo = reservaVueloRepository.save(reservaVueloConverter.modelToEntity(vueloModel));
		return reservaVueloConverter.entityToModel(vuelo);
	}

	@Override
	public boolean remove(long id) {
		try {
			reservaVueloRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public float calcularDistancia(DestinoModel origen, DestinoModel destino) {
		
		double radioTierra = 6371; //en kilómetros
		double dLat = Math.toRadians(destino.getLatitud() - origen.getLatitud());
		double dLng = Math.toRadians(destino.getLongitud() - origen.getLongitud());
		double sindLat = Math.sin(dLat / 2);
		double sindLng = Math.sin(dLng / 2);
		double va1 = Math.pow(sindLat, 2)
		+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(origen.getLatitud())) * Math.cos(Math.toRadians(destino.getLatitud()));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		return (float) (radioTierra * va2);
	}

	@Override
	public double calcularPrecio(int constante, DestinoModel origen, DestinoModel destino, ClaseModel clase, int cantPersonas) {
		double precio = this.calcularDistancia(origen, destino)*constante;
		double aumento = clase.getPorcentajeAumento()*precio;
		return (double) (precio+aumento)*cantPersonas;
	}
	
}