package com.cubetech.facturador.catalogo.application.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.cubetech.facturador.catalogo.domain.base.CatalogoRepository;
import com.cubetech.facturador.catalogo.application.CatalogoService;
import com.cubetech.facturador.catalogo.domain.base.Catalogo;

public abstract class CatalogoServiceImpl<TEntity extends Catalogo, TModel> implements CatalogoService<TEntity,TModel> {
	
	private final static Logger logger = LoggerFactory.getLogger(CatalogoServiceImpl.class);
	
	@Autowired
	private CatalogoRepository<TEntity> repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Class<TEntity> entityClass;
	private Class<TModel> modelClass;

	@SuppressWarnings("unchecked")
	public CatalogoServiceImpl(){
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
    this.entityClass = (Class<TEntity>) genericSuperclass.getActualTypeArguments()[0];
    this.modelClass = (Class<TModel>) genericSuperclass.getActualTypeArguments()[1];
	}
	
	private List<TEntity> filtraVigentes(List<TEntity> lista){
		
		List<TEntity> ret = new ArrayList<>();
		
		for(TEntity temp : lista){
			if(temp.vigente()){
				ret.add(temp);
			}
		}
		lista.removeAll(ret);
		
		return ret;
	}
	
	private List<TEntity> consultaAll(){
		List<TEntity> ret = new ArrayList<>();
		TEntity tmp = null;
		Iterator<TEntity> iterator = repository.findAll().iterator();
		
		while(iterator.hasNext()){
			tmp = iterator.next();
			ret.add(tmp);
		}
		return ret;
	}
	
	private List<TEntity> consultaClave(String clave){
		List<TEntity> ret = new ArrayList<>();
		TEntity tmp = null;
		Iterator<TEntity> iterator = repository.findByClaveSat(clave).iterator();
		
		while(iterator.hasNext()){
			tmp = iterator.next();
			ret.add(tmp);
		}
		return ret;
	}
	
	private List<TModel> convirte(List<TEntity> lista){
		List<TModel> ret = new ArrayList<>();
		for(TEntity temp : lista){
			ret.add(modelMapper.map(temp, modelClass));
		}
		try{
			modelMapper.validate();
		}catch(ValidationException e){
			logger.error("", e);
			throw e;
		}
		return ret;
	}
	
	@Override
	public List<TModel> consultaVigentes() {

		List<TEntity> listEntity = this.filtraVigentes(this.consultaAll()); 	
		return this.convirte(listEntity);
	}

	@Override
	public List<TModel> consultaVigentes(String clave) {
		List<TEntity> listEntity = this.filtraVigentes(this.consultaClave(clave)); 	
		return this.convirte(listEntity);
	}

	@Override
	public List<TModel> consultaLista() {
		
		List<TEntity> listEntity = this.consultaAll(); 	
		return this.convirte(listEntity);
	}

	@Override
	public List<TModel> consultaLista(String clave) {
		List<TEntity> listEntity = this.consultaClave(clave); 	
		return this.convirte(listEntity);
	}

}
