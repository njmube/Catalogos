package com.cubetech.facturador.catalogo.domain.impuesto;

import java.io.Serializable;

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
public class Impuesto extends Catalogo implements Entidad<Impuesto>, Serializable {

	private boolean retencion;
	private boolean traslado;
	private ImpuestoEnum tipo;
	private String entidad;
	
	@Override
	public boolean sameIdentityAs(Impuesto other) {
		// TODO Auto-generated method stub
		return false;
	}

}
