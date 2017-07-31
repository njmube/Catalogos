package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.unidad.Unidad;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.UnidadDTO;


public class UnidadToUnidadDTO extends PropertyMap<Unidad,UnidadDTO>{

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}
}
