package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.FormaPagoService;
import com.cubetech.facturador.catalogo.domain.formapago.FormaPago;

import com.cubetech.facturador.catalogo.interfaces.facade.dto.FormaPagoDTO;

@Service
public class FormaPagoServiceImpl extends CatalogoServiceImpl<FormaPago, FormaPagoDTO>  
																			implements FormaPagoService {


}
