package com.cubetech.facturador.catalogo.domain.tasacuota;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cubetech.facturador.catalogo.domain.base.Vigencia;
import com.cubetech.facturador.catalogo.domain.impuesto.Impuesto;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;
import com.cubetech.facturador.catalogo.domain.tipofactor.TipoFactor;

import lombok.Data;

@Entity
@Data
public class TasaCuota implements Entidad<TasaCuota> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Tasa tasa;
	
	@OneToOne(fetch=FetchType.LAZY )
	@JoinColumn(name="impuesto", referencedColumnName="clave_sat", nullable=false)
	private Impuesto impuesto;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="factor", referencedColumnName="clave_sat", nullable=false )
	private TipoFactor factor;
	
	private boolean traslado;
	private boolean retencion;
	
	private Vigencia vigencia;
	
	@Override
	public boolean sameIdentityAs(TasaCuota other) {
		// TODO Auto-generated method stub
		return false;
	}

}
