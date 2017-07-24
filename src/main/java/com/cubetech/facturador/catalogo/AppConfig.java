package com.cubetech.facturador.catalogo;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.CatalogoToCatalogoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.CodigoPostalToCodigoPostalDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.RegimenFiscalToRegimenFiscalDTO;

@Configuration
public class AppConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(new CatalogoToCatalogoDTO());
		modelMapper.addMappings(new RegimenFiscalToRegimenFiscalDTO());
		modelMapper.addMappings(new CodigoPostalToCodigoPostalDTO());

	  return modelMapper;
	}

}
