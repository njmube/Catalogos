package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.tipofactor.TipoFactor;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoFactorDTO;

public class TipoFactorToTipoFactorDTO extends PropertyMap<TipoFactor, TipoFactorDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
