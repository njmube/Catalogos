package com.cubetech.facturador.catalogo.domain.tasacuota;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface TasaCuotaRepository extends Repository<TasaCuota, Long> {
	List<TasaCuota> findAll();
}
