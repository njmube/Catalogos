package com.cubetech.facturador.catalogo.application.impl;


import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.UsoService;
import com.cubetech.facturador.catalogo.domain.uso.Uso;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.UsoDTO;

@Service
public class UsoServiceImpl extends CatalogoServiceImpl<Uso, UsoDTO> implements UsoService {



}
