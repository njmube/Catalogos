package com.cubetech.facturador.catalogo.application.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.RegimenFiscalService;
import com.cubetech.facturador.catalogo.domain.regimen.RegimenFiscal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.RegimenFiscalDTO;

@Service
public class RegimenFiscalServiceImpl extends CatalogoServiceImpl<RegimenFiscal, RegimenFiscalDTO> 
																			implements RegimenFiscalService {

	@Override
	public List<RegimenFiscalDTO> consultaVigentesFisica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegimenFiscalDTO> consultaVigentesMoral() {
		// TODO Auto-generated method stub
		return null;
	}

}
