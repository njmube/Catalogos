package com.cubetech.facturador.catalogo.interfaces;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CatalogosDTO;
import com.cubetech.facturador.catalogo.application.CatalogosService;

@RestController
public class CatalogoController {
	
	private final static Logger logger = LoggerFactory.getLogger(CatalogoController.class);
	
	@Autowired
	CatalogosService<CatalogosDTO, String> catalogosServices;
	
	@RequestMapping("/catalogo")
	public List<CatalogosDTO> consulta(@RequestParam(value="nombre") String[] catalogos){
		return catalogosServices.consultaVigentes(catalogos);
	}
	@RequestMapping("/catalogo/clave")
	public List<CatalogosDTO> consulta(@RequestParam  Map<String, String> claves){
	/*	
		for (Map.Entry<String, String> entry : claves.entrySet())
		{
			logger.debug(entry.getKey() + "/" + entry.getValue());
		}
		*/
		return catalogosServices.consultaClaves(claves);
	}

}
