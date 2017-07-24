package com.cubetech.facturador.catalogo.domain.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(indexes = @Index(columnList = "clave_sat"))
@MappedSuperclass
public abstract class Catalogo{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false, name="clave_sat")
	private String claveSat;
	
	private String descripcion;
	
	private Vigencia vigencia;
	
	public boolean sameIdentityAs(Catalogo other){
		boolean ret = false;
		
		ret = this.claveSat == other.claveSat;
		
		return ret;
	}
	public boolean vigente(){
		return vigencia.vigente();
	}
	public String toString(){
		String ret= "";
		
		ret = "claveSat: " + claveSat + " | descripcion: " + descripcion + " | vigente: " + Boolean.toString(vigencia.vigente());
		
		return ret;
	}
}
