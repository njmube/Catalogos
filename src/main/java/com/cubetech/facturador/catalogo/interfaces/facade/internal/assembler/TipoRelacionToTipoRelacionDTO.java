package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;

import com.cubetech.facturador.catalogo.domain.tiporelacion.TipoRelacion;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoRelacionDTO;

public class TipoRelacionToTipoRelacionDTO extends PropertyMap<TipoRelacion, TipoRelacionDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
		
	}

}
