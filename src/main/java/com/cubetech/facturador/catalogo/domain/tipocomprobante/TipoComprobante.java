package com.cubetech.facturador.catalogo.domain.tipocomprobante;

import javax.persistence.Embedded;
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
public class TipoComprobante extends Catalogo implements Entidad<TipoComprobante> {

	@Embedded
	ValorMaximo valorMaximo;
	
	@Override
	public boolean sameIdentityAs(TipoComprobante other) {
		// TODO Auto-generated method stub
		return false;
	}

}
