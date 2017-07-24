package com.cubetech.facturador.catalogo.application.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.CodigoPostalService;
import com.cubetech.facturador.catalogo.domain.codigopostal.CodigoPostal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CodigoPostalDTO;

@Service
public class CodigoPostalServiceImpl extends CatalogoServiceImpl<CodigoPostal, CodigoPostalDTO>  
																		 implements CodigoPostalService {


	
	@Override
	public List<CodigoPostalDTO> consultaEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

}
