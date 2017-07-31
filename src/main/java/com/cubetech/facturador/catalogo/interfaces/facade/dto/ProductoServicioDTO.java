package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class ProductoServicioDTO extends CatalogoDTO {

	String trasladoIva;
	String trasladoIeps;
	String complementoRequerido;
	String complementoSeleccion;

}
