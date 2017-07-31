package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.uso.Uso;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.UsoDTO;

public class UsoTOUsoDTO extends PropertyMap<Uso,UsoDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}
}
