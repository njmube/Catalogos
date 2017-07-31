package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.PaisService;
import com.cubetech.facturador.catalogo.domain.pais.Pais;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.PaisDTO;

@Service
public class PaisServiceImpl extends CatalogoServiceImpl<Pais, PaisDTO> implements PaisService {



}
