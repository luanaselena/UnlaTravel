package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

import com.unla.travelweb.entities.Usuario;

public class ListaUsuarios {
	
	private long id;
	private List<UsuarioModel> listaU = new ArrayList<UsuarioModel>();
	
	public ListaUsuarios() {}

	public ListaUsuarios(long id) {
		this.id = id;
	}
	
	public List<UsuarioModel> getListaU() {
		return listaU;
	}

	public void setListaU(List<UsuarioModel> listaU) {
		this.listaU = listaU;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	};
	
	
}
