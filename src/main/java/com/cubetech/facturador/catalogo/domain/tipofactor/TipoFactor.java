package com.cubetech.facturador.catalogo.domain.tipofactor;

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
public class TipoFactor extends Catalogo implements Entidad<TipoFactor> , Serializable{
	
	@Override
	public boolean sameIdentityAs(TipoFactor other) {
		// TODO Auto-generated method stub
		return false;
	}

}
