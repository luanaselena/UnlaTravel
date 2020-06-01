package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.TipoRegimen;
import com.unla.travelweb.models.TipoRegimenModel;

public interface ITipoRegimenService {
	public List<TipoRegimen> getAll();
	public TipoRegimenModel findById(long idRegimen);
	public TipoRegimenModel findByTipo(String tipo);
	public TipoRegimenModel insert(TipoRegimenModel regimen);
	public TipoRegimenModel update(TipoRegimenModel regimen);
	public boolean remove(long id);
}
