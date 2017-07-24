package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class RegimenFiscalDTO extends CatalogoDTO {
	
	private boolean fisico;
	private boolean moral;
}
