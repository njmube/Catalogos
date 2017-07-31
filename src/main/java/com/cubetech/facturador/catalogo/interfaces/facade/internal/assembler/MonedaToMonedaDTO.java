package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.moneda.Moneda;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.MonedaDTO;

public class MonedaToMonedaDTO extends PropertyMap<Moneda,MonedaDTO>{

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
