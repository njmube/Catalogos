package com.cubetech.facturador.catalogo.domain.regimen;

import javax.transaction.Transactional;

import com.cubetech.facturador.catalogo.domain.base.CatalogoRepository;

@Transactional
public interface RegimenFiscalRepository extends CatalogoRepository<RegimenFiscal> {

}
