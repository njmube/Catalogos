package com.cubetech.facturador.catalogo.domain.formapago;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;
import com.cubetech.facturador.catalogo.domain.base.Requerido;
import com.cubetech.facturador.catalogo.domain.shared.Entidad;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
@Data
@EqualsAndHashCode(callSuper=true)
public class FormaPago extends Catalogo implements Entidad<FormaPago> {

	private Requerido bancarizado;
	private Requerido numeroOperacion;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="rfc", column=@Column(name="ordenante_rfc")),
		@AttributeOverride(name="cuenta", column=@Column(name="ordenante_cuenta")),
		@AttributeOverride(name="patron", column=@Column(name="ordenante_patron")),
	})
	private CuentaReferencia ordenante;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="rfc", column=@Column(name="beneficiario_rfc")),
		@AttributeOverride(name="cuenta", column=@Column(name="beneficiario_cuenta")),
		@AttributeOverride(name="patron", column=@Column(name="beneficiario_patron")),
	})
	private CuentaReferencia beneficiario;
	private Requerido tipoCadenaPago;
	private String bancoEmisor;
	
	@Override
	public boolean sameIdentityAs(FormaPago other) {
		// TODO Auto-generated method stub
		return false;
	}

}
