package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.ImpuestoService;
import com.cubetech.facturador.catalogo.domain.impuesto.Impuesto;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.ImpuestoDTO;

@Service
public class ImpuestoServiceImpl extends CatalogoServiceImpl<Impuesto, ImpuestoDTO> implements ImpuestoService {
	
}
