package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class CodigoPostalDTO extends CatalogoDTO {
	
	private String estado;
	private String municipio;
	private String localidad;
	
}
