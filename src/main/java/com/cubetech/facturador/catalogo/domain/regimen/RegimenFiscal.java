package com.cubetech.facturador.catalogo.domain.regimen;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;

@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
@Data
public class RegimenFiscal extends Catalogo implements Entidad<RegimenFiscal> {

	private boolean fisico;
	private boolean moral;
	
	@Override
	public boolean sameIdentityAs(RegimenFiscal other) {
		return super.sameIdentityAs(other);
	}
	
	public String toString(){
		return super.toString();
	}

}
