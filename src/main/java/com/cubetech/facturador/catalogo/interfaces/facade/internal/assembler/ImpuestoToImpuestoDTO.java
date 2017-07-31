package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.impuesto.Impuesto;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.ImpuestoDTO;

public class ImpuestoToImpuestoDTO extends PropertyMap<Impuesto, ImpuestoDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
