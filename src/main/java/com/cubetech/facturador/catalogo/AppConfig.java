package com.cubetech.facturador.catalogo;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.CatalogoToCatalogoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.CodigoPostalToCodigoPostalDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.FormaPagoToFormaPagoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.ImpuestoToImpuestoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.MetodoPagoToMetodoPagoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.MonedaToMonedaDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.PaisToPaisDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.RegimenFiscalToRegimenFiscalDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.TasaCuotaToTasaCuotaDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.TipoComprobanteToTipoComprobanteDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.TipoFactorToTipoFactorDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.TipoRelacionToTipoRelacionDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.UnidadToUnidadDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.UsoTOUsoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler.productoServicioToProductoServicioDTO;

@Configuration
public class AppConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(new CatalogoToCatalogoDTO());
		modelMapper.addMappings(new RegimenFiscalToRegimenFiscalDTO());
		modelMapper.addMappings(new CodigoPostalToCodigoPostalDTO());
		modelMapper.addMappings(new FormaPagoToFormaPagoDTO());
		modelMapper.addMappings(new MetodoPagoToMetodoPagoDTO());
		modelMapper.addMappings(new UsoTOUsoDTO());
		modelMapper.addMappings(new productoServicioToProductoServicioDTO());
		modelMapper.addMappings(new UnidadToUnidadDTO());
		modelMapper.addMappings(new ImpuestoToImpuestoDTO());
		modelMapper.addMappings(new MonedaToMonedaDTO());
		modelMapper.addMappings(new PaisToPaisDTO());
		modelMapper.addMappings(new TipoFactorToTipoFactorDTO());
		modelMapper.addMappings(new TipoRelacionToTipoRelacionDTO());
		modelMapper.addMappings(new TipoComprobanteToTipoComprobanteDTO());
		
	  return modelMapper;
	}

}
