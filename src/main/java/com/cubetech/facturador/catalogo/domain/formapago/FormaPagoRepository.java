package com.cubetech.facturador.catalogo.domain.formapago;

import javax.transaction.Transactional;

import com.cubetech.facturador.catalogo.domain.base.CatalogoRepository;

@Transactional
public interface FormaPagoRepository extends CatalogoRepository<FormaPago> {

}
