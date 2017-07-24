package com.cubetech.facturador.catalogo.application;

import java.util.List;


import com.cubetech.facturador.catalogo.domain.regimen.RegimenFiscal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.RegimenFiscalDTO;


public interface RegimenFiscalService extends CatalogoService<RegimenFiscal, RegimenFiscalDTO> {
	public List<RegimenFiscalDTO> consultaVigentesFisica();
	public List<RegimenFiscalDTO> consultaVigentesMoral();
}
