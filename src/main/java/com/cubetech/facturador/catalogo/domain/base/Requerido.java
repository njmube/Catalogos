package com.cubetech.facturador.catalogo.domain.base;

public enum Requerido {

	NO("NO"),
	SI("SI"),
	OPCIONAL("OPCIONAL")
	;
	
	private String valor;
	Requerido(String valor){
		this.valor = valor;
	}
	
	public String getValor(){
		return this.valor;
	}
}
