package com.cubetech.facturador.catalogo.domain.moneda;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
public class Moneda extends Catalogo implements Entidad<Moneda> {
	
	private int decimales;
	private double variacion;
	
	@Override
	public boolean sameIdentityAs(Moneda other) {
		// TODO Auto-generated method stub
		return false;
	}
}
