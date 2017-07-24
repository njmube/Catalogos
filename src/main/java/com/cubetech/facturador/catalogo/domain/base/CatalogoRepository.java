package com.cubetech.facturador.catalogo.domain.base;

import java.util.List;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;


@NoRepositoryBean
public interface CatalogoRepository<T extends Catalogo> extends Repository<T, Long> {
	
	/*
	@Query("select u from #{#entityName} as u where u.clave_sat = ?1 ")
	public T findbyClave_sat(String clave);
*/
	public List<T> findByClaveSat(String clave);
	public List<T> findAll();
}
