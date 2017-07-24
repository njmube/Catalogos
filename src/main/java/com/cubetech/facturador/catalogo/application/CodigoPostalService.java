package com.cubetech.facturador.catalogo.application;

import java.util.List;

import com.cubetech.facturador.catalogo.domain.codigopostal.CodigoPostal;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CodigoPostalDTO;

public interface CodigoPostalService extends CatalogoService<CodigoPostal, CodigoPostalDTO> {
	public List<CodigoPostalDTO> consultaEstado(String estado);
}
