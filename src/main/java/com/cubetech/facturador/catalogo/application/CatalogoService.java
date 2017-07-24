package com.cubetech.facturador.catalogo.application;

import java.util.List;
import com.cubetech.facturador.catalogo.domain.base.Catalogo;

public interface CatalogoService<TEntity, TModel> {
	public List<TModel> consultaVigentes();
	public List<TModel> consultaVigentes(String clave);
	public List<TModel> consultaLista();
	public List<TModel> consultaLista(String clave);
}
