package com.cubetech.facturador.catalogo.domain.productoservicio;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.base.Requerido;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
public class ProductoServicio extends Catalogo implements Entidad<ProductoServicio>{

	private Requerido trasladoIva;
	private Requerido trasladoIeps;
	@Embedded
	private Complemento complemento;
	
	@Override
	public boolean sameIdentityAs(ProductoServicio other) {
		// TODO Auto-generated method stub
		return false;
	}

}
