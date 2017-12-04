package com.cubetech.facturador.catalogo.application.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubetech.facturador.catalogo.application.CatalogosService;
import com.cubetech.facturador.catalogo.application.CodigoPostalService;
import com.cubetech.facturador.catalogo.application.FormaPagoService;
import com.cubetech.facturador.catalogo.application.ImpuestoService;
import com.cubetech.facturador.catalogo.application.MetodoPagoService;
import com.cubetech.facturador.catalogo.application.MonedaService;
import com.cubetech.facturador.catalogo.application.PaisService;
import com.cubetech.facturador.catalogo.application.ProductoServicioService;
import com.cubetech.facturador.catalogo.application.RegimenFiscalService;
import com.cubetech.facturador.catalogo.application.TipoComprobanteService;
import com.cubetech.facturador.catalogo.application.TipoFactorService;
import com.cubetech.facturador.catalogo.application.TipoRelacionService;
import com.cubetech.facturador.catalogo.application.UnidadService;
import com.cubetech.facturador.catalogo.application.UsoService;
import com.cubetech.facturador.catalogo.interfaces.facade.dto.CatalogosDTO;

@Service
public class CatalogosServiceImpl implements CatalogosService<CatalogosDTO, String> {

	private final static Logger logger = LoggerFactory.getLogger(CatalogosServiceImpl.class);
	
	@Autowired
	RegimenFiscalService regimenfiscal;
	@Autowired
	CodigoPostalService codigoPostal;
	@Autowired
	FormaPagoService formaPago;
	@Autowired
	MetodoPagoService	metodoPago;
	@Autowired
	UsoService uso;
	@Autowired
	ProductoServicioService productoServicio;
	@Autowired
	UnidadService unidad;
	@Autowired
	ImpuestoService impuesto;
	@Autowired
	MonedaService moneda;
	@Autowired
	PaisService pais;
	@Autowired
	TipoFactorService tipoFactor;
	@Autowired
	TipoRelacionService tipoRelacion;
	@Autowired
	TipoComprobanteService tipoComprobante;
	
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
	
	private List<CatalogosDTO> consultaVigentesFecha(Map<String, String> catalogos){
		List<CatalogosDTO> ret = new ArrayList<>();
		CatalogosDTO aux = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date fecha = sdf.parse(catalogos.remove("fecha"));
			
			Iterator<Entry<String,String>> it = catalogos.entrySet().iterator();
			
			while (it.hasNext()) {
				Map.Entry<String,String> pair = it.next();
				aux = new CatalogosDTO((String)pair.getKey());
				
				switch(aux.getNombre()){
				case "regimenFiscal":
					aux.getDatos().addAll(regimenfiscal.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "codigoPostal":
					aux.getDatos().addAll(codigoPostal.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "formaPago":
					aux.getDatos().addAll(formaPago.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "metodoPago":
					aux.getDatos().addAll(metodoPago.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "uso":
					aux.getDatos().addAll(uso.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "productoServicio":
					aux.getDatos().addAll(productoServicio.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "unidad":
					aux.getDatos().addAll(unidad.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "impuesto":
					aux.getDatos().addAll(impuesto.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "moneda":
					aux.getDatos().addAll(moneda.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "pais":
					aux.getDatos().addAll(pais.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "tipoFactor":
					aux.getDatos().addAll(tipoFactor.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "tipoRelacion":
					aux.getDatos().addAll(tipoRelacion.consultaVigentes((String)pair.getValue(),fecha));
					break;
				case "tipoComprobante":
					aux.getDatos().addAll(tipoComprobante.consultaVigentes((String)pair.getValue(),fecha));
					break;
				default:
					break;
				}
				ret.add(aux);
		//	}
				logger.debug("key: " + aux.getNombre() + " value: " + pair.getValue());
				it.remove();
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	private List<CatalogosDTO> consultaVigentes(Map<String, String> catalogos){
		List<CatalogosDTO> ret = new ArrayList<>();
		CatalogosDTO aux = null;
		Iterator<Entry<String,String>> it = catalogos.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String,String> pair = it.next();
			aux = new CatalogosDTO((String)pair.getKey());
			
			switch(aux.getNombre()){
			case "regimenFiscal":
				aux.getDatos().addAll(regimenfiscal.consultaVigentes((String)pair.getValue()));
				break;
			case "codigoPostal":
				aux.getDatos().addAll(codigoPostal.consultaVigentes((String)pair.getValue()));
				break;
			case "formaPago":
				aux.getDatos().addAll(formaPago.consultaVigentes((String)pair.getValue()));
				break;
			case "metodoPago":
				aux.getDatos().addAll(metodoPago.consultaVigentes((String)pair.getValue()));
				break;
			case "uso":
				aux.getDatos().addAll(uso.consultaVigentes((String)pair.getValue()));
				break;
			case "productoServicio":
				aux.getDatos().addAll(productoServicio.consultaVigentes((String)pair.getValue()));
				break;
			case "unidad":
				aux.getDatos().addAll(unidad.consultaVigentes((String)pair.getValue()));
				break;
			case "impuesto":
				aux.getDatos().addAll(impuesto.consultaVigentes((String)pair.getValue()));
				break;
			case "moneda":
				aux.getDatos().addAll(moneda.consultaVigentes((String)pair.getValue()));
				break;
			case "pais":
				aux.getDatos().addAll(pais.consultaVigentes((String)pair.getValue()));
				break;
			case "tipoFactor":
				aux.getDatos().addAll(tipoFactor.consultaVigentes((String)pair.getValue()));
				break;
			case "tipoRelacion":
				aux.getDatos().addAll(tipoRelacion.consultaVigentes((String)pair.getValue()));
				break;
			case "tipoComprobante":
				aux.getDatos().addAll(tipoComprobante.consultaVigentes((String)pair.getValue()));
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
	

	@Override
	public List<CatalogosDTO> consultaClaves(Map<String, String> catalogos) {
		List<CatalogosDTO> ret = null;
		if(catalogos.containsKey("fecha")){
			ret = consultaVigentesFecha(catalogos);
		}else{
			ret = consultaVigentes(catalogos);
		}
		return ret;

	}
	
	

}
