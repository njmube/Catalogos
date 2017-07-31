package com.cubetech.facturador.catalogo.interfaces.facade.internal.assembler;

import org.modelmapper.ModelMapper;
import com.cubetech.facturador.catalogo.domain.tasacuota.TasaCuota;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.ImpuestoDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TasaCuotaDTO;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TipoFactorDTO;

public class TasaCuotaToTasaCuotaDTO {

	public TasaCuotaDTO toTasaCoutaDTO(TasaCuota entrada, ModelMapper modelMapper ){
		TasaCuotaDTO ret = new TasaCuotaDTO();
		ImpuestoDTO imp ;
		TipoFactorDTO fac;
		
		ret.setTipo(entrada.getTasa().getTipo().getValor());
		ret.setMinimo(entrada.getTasa().getMinimio());
		ret.setValor(entrada.getTasa().getValor());
		imp = modelMapper.map(entrada.getImpuesto(), ImpuestoDTO.class);
		ret.setImpuesto(imp);
		fac = modelMapper.map(entrada.getFactor(), TipoFactorDTO.class);
		ret.setFactor(fac);
		ret.setTraslado(entrada.isTraslado());
		ret.setRetencion(entrada.isRetencion());
		ret.setVigente(entrada.getVigencia().vigente());
		
		return ret;
	}

}
