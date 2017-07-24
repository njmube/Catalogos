package com.cubetech.facturador.catalogo.interfaces;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cubetech.facturador.catalogo.application.RegimenFiscalService;
import com.cubetech.facturador.catalogo.application.impl.CatalogoServiceImpl;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.RegimenFiscalDTO;

@RestController
public class RegimenFiscalController {
	
	private final static Logger logger = LoggerFactory.getLogger(RegimenFiscalController.class);
	
	private static final int VIGENTE 	= 1;	//001
	private static final int CLAVE		= 2;	//010
	private static final int SECTOR		= 4;	//101
	
	@Autowired
	RegimenFiscalService regimenfiscal;
	
	@RequestMapping(path="/regimenes", method = RequestMethod.GET)
	public List<RegimenFiscalDTO> buscarTodos(@RequestParam(required = false) boolean vigente, @RequestParam(required = false) String clave){
		int opcion = 0;
		List<RegimenFiscalDTO> ret = null;
		
		logger.debug(Boolean.toString(vigente));
		logger.debug(clave);
		
		if(vigente == true) opcion = opcion + VIGENTE;
		if(clave != null)		opcion = opcion + CLAVE;
		
		switch(opcion){
			case 1:
				ret = regimenfiscal.consultaVigentes();
				break;
			case 2:
				ret = regimenfiscal.consultaLista(clave);
				break;
			case 3:
				ret = regimenfiscal.consultaVigentes(clave);
				break;
			case 4:
				break;
			default:
				ret = regimenfiscal.consultaLista();
				break;
		}
		logger.debug(Integer.toString(opcion));
		
		return ret; 
	}
	/*@RequestMapping("/regimenes/vigentes")
	public List<RegimenFiscalDTO> buscarVigentes(){
		List<RegimenFiscalDTO> ret = regimenfiscal.consultaVigentes();
		return ret; 
	}*/
	/*
	@RequestMapping("/regimenes")
	public List<RegimenFiscalDTO> buscaClave(@RequestParam(required = false) boolean vigente, @RequestParam String clave){
		logger.debug(Boolean.toString(vigente));
		logger.debug(clave);
		List<RegimenFiscalDTO> ret = regimenfiscal.consultaListaClave(clave);
		return ret; 
	}*/

}
