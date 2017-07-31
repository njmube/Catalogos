package com.cubetech.facturador.catalogo.application.impl;


import org.springframework.stereotype.Service;
import com.cubetech.facturador.catalogo.application.UnidadService;
import com.cubetech.facturador.catalogo.domain.unidad.Unidad;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.UnidadDTO;

@Service
public class UnidadServiceImpl extends CatalogoServiceImpl<Unidad, UnidadDTO> implements UnidadService {


}
