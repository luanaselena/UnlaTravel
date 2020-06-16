package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuariosModel {

	private List<UsuarioModel> listaU = new ArrayList<UsuarioModel>();

	private long id;
	
	public ListaUsuariosModel(long id) {
		this.id=id;
	}
	
	
	public ListaUsuariosModel() {
	}
	
	public List<UsuarioModel> getListaU() {
		return listaU;
	}

	public void setListaU(List<UsuarioModel> lista) {
		this.listaU = lista;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	
	
}
