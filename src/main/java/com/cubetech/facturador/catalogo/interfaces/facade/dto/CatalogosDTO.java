package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CatalogosDTO implements Serializable{
	
	private String nombre;
	List<CatalogoDTO> datos;
	
	public CatalogosDTO(String nombre){
		this.nombre = nombre;
		datos = new ArrayList<CatalogoDTO>();
	}

}
