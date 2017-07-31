package com.cubetech.facturador.catalogo.domain.pais;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.cubetech.facturador.catalogo.domain.base.Catalogo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(indexes = @Index(columnList = "clave_sat"))
public class Pais extends Catalogo {
	private String formatoCP;
	private String formatoIdentidadTributaria;
}
