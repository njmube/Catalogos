package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;
import com.cubetech.facturador.catalogo.domain.formapago.FormaPago;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.FormaPagoDTO;

public class FormaPagoToFormaPagoDTO extends PropertyMap<FormaPago, FormaPagoDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}
	
}


