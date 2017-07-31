package com.cubetech.facturador.catalogo.domain.impuesto;

public enum ImpuestoEnum {
	
	LOCAL("LOCAL"),
	FEDERAL("FEDERAL");
	
	String valor;
	
	ImpuestoEnum(String valor){
		this.valor = valor;
	}
	public String getValor(){
		return this.valor;
	}
}
