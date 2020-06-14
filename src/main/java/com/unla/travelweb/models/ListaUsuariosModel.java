package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuariosModel {

	private Long id;
	private List<UsuarioModel> lista = new ArrayList<UsuarioModel>();

	public ListaUsuariosModel(long id) {
		this.id = id;
	}
	
	public List<UsuarioModel> getLista() {
		return lista;
	}

	public void setLista(List<UsuarioModel> lista) {
		this.lista = lista;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
