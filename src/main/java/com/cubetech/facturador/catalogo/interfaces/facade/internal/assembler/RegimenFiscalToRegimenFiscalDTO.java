package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;
import com.cubetech.facturador.catalogo.domain.regimen.RegimenFiscal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.RegimenFiscalDTO;

public class RegimenFiscalToRegimenFiscalDTO extends PropertyMap<RegimenFiscal, RegimenFiscalDTO> {

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
