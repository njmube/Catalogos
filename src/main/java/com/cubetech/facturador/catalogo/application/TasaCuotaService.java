package com.cubetech.facturador.catalogo.application;

import java.util.List;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.TasaCuotaDTO;

public interface TasaCuotaService {
	
	List<TasaCuotaDTO> consultaLista();
	List<TasaCuotaDTO> consultaLista(boolean vigente);

}
