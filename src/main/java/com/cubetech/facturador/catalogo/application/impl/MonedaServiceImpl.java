package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.MonedaService;
import com.cubetech.facturador.catalogo.domain.moneda.Moneda;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.MonedaDTO;

@Service
public class MonedaServiceImpl extends CatalogoServiceImpl<Moneda, MonedaDTO> implements MonedaService {

}
