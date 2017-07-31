package com.cubetech.facturador.catalogo.domain.tipocomprobante;

import com.cubetech.facturador.catalogo.domain.shared.ValueObject;

import lombok.Data;

@Data
public class ValorMaximo implements ValueObject<ValorMaximo> {

	private double importe;
	
  private Clasificacion clasificacion;
	
	public String getClasificacion(){
		if(this.clasificacion == null) return null;
		return this.clasificacion.getValor();
	}
	
	private enum Clasificacion{
		NS("NS"),
		NDS("NDS");
		
		String valor;
		
		Clasificacion(String valor){
			this.valor = valor;
		}
		public String getValor(){
			return this.valor;
		}
	}
	
	@Override
	public boolean sameValueAs(ValorMaximo other) {
		// TODO Auto-generated method stub
		return false;
	}

}
