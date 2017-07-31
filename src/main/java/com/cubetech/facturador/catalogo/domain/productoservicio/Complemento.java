package com.cubetech.facturador.catalogo.domain.productoservicio;

import com.cubetech.facturador.catalogo.domain.base.ComplementoEnum;
import com.cubetech.facturador.catalogo.domain.base.Requerido;
import com.cubetech.facturador.catalogo.domain.shared.ValueObject;

import lombok.Data;

@Data
public class Complemento implements ValueObject<Complemento> {

	private Requerido requerido;
	private ComplementoEnum seleccion;
	
	@Override
	public boolean sameValueAs(Complemento other) {
		// TODO Auto-generated method stub
		return false;
	}

}
