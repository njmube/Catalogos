package com.cubetech.facturador.catalogo.domain.codigopostal;

import javax.transaction.Transactional;

import com.cubetech.facturador.catalogo.domain.base.CatalogoRepository;

@Transactional
public interface CodigoPostalRepository extends CatalogoRepository<CodigoPostal> {

}
