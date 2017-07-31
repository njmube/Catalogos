package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.metodopago.MetodoPago;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.MetodoPagoDTO;

public class MetodoPagoToMetodoPagoDTO extends PropertyMap<MetodoPago, MetodoPagoDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
