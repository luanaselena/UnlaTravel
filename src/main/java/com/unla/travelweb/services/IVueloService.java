package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Vuelo;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.VueloModel;

public interface IVueloService {
	public List<Vuelo> getAll();
    public VueloModel findById(long idVuelo);
//    public VueloModel findByDestino(DestinoModel destino);
//    public VueloModel findByOrigen(DestinoModel origen);
    public VueloModel insert(VueloModel vueloModel);
    public VueloModel update(VueloModel vueloModel);
    public boolean remove(long id);
    public float calcularDistancia(DestinoModel origen, DestinoModel destino);
    public double calcularPrecio(int constante, DestinoModel origen, DestinoModel destino, ClaseModel clase);
}
