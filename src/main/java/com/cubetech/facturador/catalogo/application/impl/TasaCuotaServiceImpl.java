package com.cubetech.facturador.catalogo.application.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.TasaCuotaService;
import com.cubetech.facturador.catalogo.domain.tasacuota.TasaCuota;
import com.cubetech.facturador.catalogo.domain.tasacuota.TasaCuotaRepository;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TasaCuotaDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.TasaCuotaToTasaCuotaDTO;

@Service
public class TasaCuotaServiceImpl implements TasaCuotaService {

	private final static Logger logger = LoggerFactory.getLogger(TasaCuotaServiceImpl.class);
	private final TasaCuotaRepository tasaCuotaRepository;
	private final ModelMapper modelMapper;
	
	@Autowired
	public TasaCuotaServiceImpl(TasaCuotaRepository tasaCuotaRepository, ModelMapper modelMapper){
		this.tasaCuotaRepository = tasaCuotaRepository;
		this.modelMapper = modelMapper;
	}
	
	@Override
	public List<TasaCuotaDTO> consultaLista() {
		
		TasaCuotaToTasaCuotaDTO converter = new TasaCuotaToTasaCuotaDTO();
		
		List<TasaCuota> lTasaCuota= tasaCuotaRepository.findAll();
		List<TasaCuotaDTO> ret = new ArrayList<>();
		
		for(TasaCuota tctmp: lTasaCuota){
			TasaCuotaDTO tmp;
			try{
				tmp = converter.toTasaCoutaDTO(tctmp, modelMapper);
				ret.add(tmp);
			}catch(Exception e){
				logger.error("Conversion", e);
				throw e;
			}
		}
		
		try{
			this.modelMapper.validate();
		}catch(ValidationException e){
			logger.error("", e);
			throw e;
		}
		
		return ret;
	}

	@Override
	public List<TasaCuotaDTO> consultaLista(boolean vigente) {
		List<TasaCuotaDTO> ltasacuota = this.consultaLista();
		List<TasaCuotaDTO> ret = new ArrayList<>();
		
		for(TasaCuotaDTO tmp: ltasacuota){
			if(tmp.isVigente() == vigente){
				ret.add(tmp);
			}
		}
		
		return ret;
	}

}
