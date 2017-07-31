package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class ImpuestoDTO extends CatalogoDTO{
	
	private boolean retencion;
	private boolean traslado;
	private String impuestoTipo;
	private String entidad;
	
}
