package com.cubetech.facturador.catalogo.application.impl;


import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.ProductoServicioService;
import com.cubetech.facturador.catalogo.domain.productoservicio.ProductoServicio;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.ProductoServicioDTO;

@Service
public class ProductoServicioServiceImpl extends CatalogoServiceImpl<ProductoServicio, ProductoServicioDTO>
		implements ProductoServicioService {



}
