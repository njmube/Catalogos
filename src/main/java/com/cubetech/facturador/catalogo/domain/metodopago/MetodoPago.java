package com.cubetech.facturador.catalogo.domain.metodopago;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
@Data
@EqualsAndHashCode(callSuper=true)
public class MetodoPago extends Catalogo implements Entidad<MetodoPago>{
	
	@Override
	public boolean sameIdentityAs(MetodoPago other) {
		// TODO Auto-generated method stub
		return false;
	}

}
