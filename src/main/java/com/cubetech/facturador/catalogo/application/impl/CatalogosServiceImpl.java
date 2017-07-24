package com.cubetech.facturador.catalogo.application.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.CatalogosService;
import com.cubetech.facturador.catalogo.application.CodigoPostalService;
import com.cubetech.facturador.catalogo.application.RegimenFiscalService;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CatalogosDTO;

@Service
public class CatalogosServiceImpl implements CatalogosService<CatalogosDTO, String> {

	private final static Logger logger = LoggerFactory.getLogger(CatalogosServiceImpl.class);
	
	@Autowired
	RegimenFiscalService regimenfiscal;
	@Autowired
	CodigoPostalService codigoPostal;
	
	
	@Override
	public List<CatalogosDTO> consultaVigentes(String[] catalogos) {
		List<CatalogosDTO> ret = new ArrayList<>();
		final Map<String, String> map = new HashMap<String, String>();
		int i = 0;
		CatalogosDTO aux = null;
		for(String key : catalogos){
			if(!map.containsKey(key)){
				map.put(key, catalogos[i++]);
				aux = new CatalogosDTO(map.get(key));
				switch(map.get(key)){
				case "regimenFiscal":
					aux.getDatos().addAll(regimenfiscal.consultaVigentes());
					break;
				case "codigoPostal":
					aux.getDatos().addAll(codigoPostal.consultaVigentes());
					break;
				default:
					break;
				}
				ret.add(aux);
			}
			
			logger.debug("key: " + key + " value: " + map.get(key));
		}
		return ret;
	}


	@Override
	public List<CatalogosDTO> consultaClaves(Map<String, String> catalogos) {
		List<CatalogosDTO> ret = new ArrayList<>();
		CatalogosDTO aux = null;
		Iterator it = catalogos.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			aux = new CatalogosDTO((String)pair.getKey());
			
			switch(aux.getNombre()){
			case "regimenFiscal":
				aux.getDatos().addAll(regimenfiscal.consultaLista((String)pair.getValue()));
				break;
			case "codigoPostal":
				aux.getDatos().addAll(codigoPostal.consultaLista((String)pair.getValue()));
				break;
			default:
				break;
			}
			ret.add(aux);
	//	}
			logger.debug("key: " + aux.getNombre() + " value: " + pair.getValue());
			it.remove();
		}
		return ret;
	}

}
