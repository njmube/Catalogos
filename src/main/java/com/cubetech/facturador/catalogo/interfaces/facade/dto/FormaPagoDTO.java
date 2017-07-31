package com.cubetech.facturador.catalogo.interfaces.facade.dto;

import lombok.Data;

@Data
public class FormaPagoDTO extends CatalogoDTO{
	
	private String bancarizado;
	private String numeroOperacion;
	private String ordenanteRfc;
	private String ordenanteCuenta;
	private String ordenantePatron;
	private String beneficiarioRfc;
	private String beneficiarioCuenta;
	private String beneficiarioPatron;
	private String tipoCadenaPago;
	private String bancoEmisor;

}
