package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;


import org.modelmapper.PropertyMap;
import com.cubetech.facturador.catalogo.domain.tipocomprobante.TipoComprobante;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoComprobanteDTO;

public class TipoComprobanteToTipoComprobanteDTO extends PropertyMap<TipoComprobante,TipoComprobanteDTO> {
	

	@Override
	protected void configure() {
		
		map().setVigente(source.vigente());
		map().setValorMaximoClasificacion(source.getValorMaximo().getClasificacion());
	}

}
