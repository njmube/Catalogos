package com.cubetech.facturador.catalogo.application;

import java.util.Date;
import java.util.List;

public interface CatalogoService<TEntity, TModel> {
	public List<TModel> consultaVigentes();
	public List<TModel> consultaVigentes(String clave);
	public List<TModel> consultaVigentes(String clave, Date fecha);
	public List<TModel> consultaLista();
	public List<TModel> consultaLista(String clave);
}
