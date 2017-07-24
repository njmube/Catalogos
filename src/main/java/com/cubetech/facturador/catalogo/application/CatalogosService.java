package com.cubetech.facturador.catalogo.application;

import java.util.List;
import java.util.Map;

public interface CatalogosService<TModel, E> {
	public List<TModel> consultaVigentes(E[] catalogos);
	public List<TModel> consultaClaves(Map<E,E> catalogos);
}
