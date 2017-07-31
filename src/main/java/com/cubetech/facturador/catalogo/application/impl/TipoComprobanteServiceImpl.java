package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.TipoComprobanteService;
import com.cubetech.facturador.catalogo.domain.tipocomprobante.TipoComprobante;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoComprobanteDTO;

@Service
public class TipoComprobanteServiceImpl extends CatalogoServiceImpl<TipoComprobante, TipoComprobanteDTO>
		implements TipoComprobanteService {

}
