package com.cubetech.facturador.catalogo.application.impl;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.TipoFactorService;
import com.cubetech.facturador.catalogo.domain.tipofactor.TipoFactor;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoFactorDTO;

@Service
public class TipoFactorTServiceImpl extends CatalogoServiceImpl<TipoFactor, TipoFactorDTO>
		implements TipoFactorService {



}
