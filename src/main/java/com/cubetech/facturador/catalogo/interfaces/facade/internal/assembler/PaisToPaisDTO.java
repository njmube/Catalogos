package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.pais.Pais;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.PaisDTO;

public class PaisToPaisDTO extends PropertyMap<Pais, PaisDTO>{

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}
}
