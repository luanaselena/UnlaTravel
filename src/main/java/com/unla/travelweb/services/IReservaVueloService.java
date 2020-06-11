package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.ReservaVuelo;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.ReservaVueloModel;

public interface IReservaVueloService {
	public List<ReservaVuelo> getAll();
    public ReservaVueloModel findById(long idVuelo);
//    public VueloModel findByDestino(DestinoModel destino);
//    public VueloModel findByOrigen(DestinoModel origen);
    public ReservaVueloModel insert(ReservaVueloModel vueloModel);
    public ReservaVueloModel update(ReservaVueloModel vueloModel);
    public boolean remove(long id);
    public float calcularDistancia(DestinoModel origen, DestinoModel destino);
    public double calcularPrecio(int constante, DestinoModel origen, DestinoModel destino, ClaseModel clase, int cantPersonas);
}
