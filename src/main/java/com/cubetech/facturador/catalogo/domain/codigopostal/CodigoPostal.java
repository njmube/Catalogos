package com.cubetech.facturador.catalogo.domain.codigopostal;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;

@Data
@Table(indexes = @Index(columnList = "clave_sat"))
@Entity
public class CodigoPostal extends Catalogo implements Entidad<CodigoPostal> { 
	
	private String estado;
	private String municipio;
	private String localidad;

	@Override
	public boolean sameIdentityAs(CodigoPostal other) {
		return super.sameIdentityAs(other);
	}
	
}


