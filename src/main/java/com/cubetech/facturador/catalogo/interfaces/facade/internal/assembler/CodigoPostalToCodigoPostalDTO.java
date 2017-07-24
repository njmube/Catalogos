package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.codigopostal.CodigoPostal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CodigoPostalDTO;

public class CodigoPostalToCodigoPostalDTO extends PropertyMap<CodigoPostal, CodigoPostalDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	} 

}
