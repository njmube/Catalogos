package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public abstract class CatalogoDTO implements Serializable {
	
	private String claveSat;
	private String descripcion;
	private boolean vigente;

}
