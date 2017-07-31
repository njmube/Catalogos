package com.cubetech.facturador.catalogo.domain.formapago;

import javax.persistence.Embeddable;

import com.cubetech.facturador.catalogo.domain.base.Requerido;
import com.cubetech.facturador.catalogo.domain.shared.ValueObject;

import lombok.Data;

@Embeddable
@Data
public class CuentaReferencia implements ValueObject<CuentaReferencia> {

	private Requerido rfc;
	private Requerido cuenta;
	private String 		patron;
	
	@Override
	public boolean sameValueAs(CuentaReferencia other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
