package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class MonedaDTO extends CatalogoDTO {
	int decimales;
	double variacion;
}
