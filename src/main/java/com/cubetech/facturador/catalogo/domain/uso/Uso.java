package com.cubetech.facturador.catalogo.domain.uso;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
@Data
@EqualsAndHashCode(callSuper=true)
public class Uso extends Catalogo {
	private boolean fisica;
	private boolean moral;
}
