package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CatalogoDTO;

public class CatalogoToCatalogoDTO extends PropertyMap<Catalogo, CatalogoDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
