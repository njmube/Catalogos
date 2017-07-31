package com.cubetech.facturador.catalogo.application.impl;


import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.MetodoPagoService;
import com.cubetech.facturador.catalogo.domain.metodopago.MetodoPago;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.MetodoPagoDTO;
@Service
public class MetodoPagoServiceImpl extends CatalogoServiceImpl<MetodoPago, MetodoPagoDTO> 
																	 implements MetodoPagoService {



}
