package com.cubetech.facturador.catalogo.domain.unidad;

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
public class Unidad extends Catalogo implements Entidad<Unidad> {

	private String simbolo;
	@Override
	public boolean sameIdentityAs(Unidad other) {
		// TODO Auto-generated method stub
		return false;
	}

}
