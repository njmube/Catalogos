package com.cubetech.facturador.catalogo.domain.tasacuota;

public enum TipoTasa {
	FIJO("Fijo"),
	RANGO("Rango");
	
	private String valor;
	
	TipoTasa(String valor){
		this.valor = valor;
	}
	
	public String getValor(){
		return this.valor;
	}
}
