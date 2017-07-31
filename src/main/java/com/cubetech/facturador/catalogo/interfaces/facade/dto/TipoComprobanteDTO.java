package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class TipoComprobanteDTO extends CatalogoDTO {
	private double valorMaximoImporte;
	String ValorMaximoClasificacion;
}
