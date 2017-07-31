package com.cubetech.facturador.catalogo.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cubetech.facturador.catalogo.application.TasaCuotaService;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TasaCuotaDTO;

@RestController
public class TasaCuotaController {

	private final TasaCuotaService tasaCuotaService;
	
	@Autowired
	public TasaCuotaController(TasaCuotaService tasaCuotaService){
		this.tasaCuotaService = tasaCuotaService;
	}
	
	@RequestMapping("/tasacuota")
	public List<TasaCuotaDTO> consultaLista(@RequestParam(required = false) boolean vigente){
		if(vigente == true){
			return tasaCuotaService.consultaLista(vigente);
		}else{
			return tasaCuotaService.consultaLista();
		}
		
	}
}
