package com.cubetech.facturador.catalogo.domain.tasacuota;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.cubetech.facturador.catalogo.domain.shared.ValueObject;

import lombok.Data;

@Data
@Embeddable
public class Tasa implements ValueObject<Tasa> {

	private TipoTasa tipo;
	@Column(nullable=true, name="minimo")
	private Double minimio;
	private double valor;
	
	@Override
	public boolean sameValueAs(Tasa other) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
