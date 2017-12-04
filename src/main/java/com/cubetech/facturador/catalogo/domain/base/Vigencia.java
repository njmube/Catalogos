package com.cubetech.facturador.catalogo.domain.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.cubetech.facturador.catalogo.domain.shared.ValueObject;

import lombok.Data;

@Data
@Embeddable
public class Vigencia implements ValueObject<Vigencia> {

	@Column(name = "fecha_inicial")
	private Date fechaInicial;
	
	@Column(name="fecha_final")
	private Date fechaFinal;
	
	Vigencia(Date ini, Date fin){
		this.fechaInicial = ini;
		this.fechaFinal = fin;
	}
	Vigencia(Date ini){
		this.fechaInicial = ini;
		this.fechaFinal = null;
	}
	Vigencia(){
		this.fechaInicial = null;
		this.fechaFinal = null;
	}
	
	@Override
	public boolean sameValueAs(Vigencia other) {
		boolean ret = false;

		ret = (this.fechaInicial.equals(other.fechaInicial) && this.fechaFinal.equals(other.fechaFinal));

		return ret;
	}

	public boolean vigente() {
		boolean ret = false;
		Date ahora = new Date();
		
		ret = this.vigenteEn(ahora);
		
		return ret;
	}

	public boolean vigenteEn(Date fecha) {
		boolean ret = false;

		if (this.fechaInicial != null)
			ret = this.fechaInicial.compareTo(fecha) <= 0;

		if (fechaFinal != null)
			ret = ret && this.fechaFinal.compareTo(fecha) >= 0;

		return ret;
	}

}
