package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.PropertyMap;
import com.cubetech.facturador.catalogo.domain.productoservicio.ProductoServicio;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.ProductoServicioDTO;


public class productoServicioToProductoServicioDTO extends PropertyMap<ProductoServicio,ProductoServicioDTO>{

	@Override
	protected void configure() {
		map().setVigente(source.vigente());
	}

}
