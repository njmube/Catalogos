package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class UsoDTO extends CatalogoDTO {
	private boolean fisica;
	private boolean moral;

}
