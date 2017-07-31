package com.cubetech.facturador.catalogo.domain.tiporelacion;

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
public class TipoRelacion extends Catalogo implements Entidad<TipoRelacion>{
	
	
	
	@Override
	public boolean sameIdentityAs(TipoRelacion other) {
		// TODO Auto-generated method stub
		return false;
	}

}
