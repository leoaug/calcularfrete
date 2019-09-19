package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.apache.axis.types.NonNegativeInteger;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.bean.CalcularFreteBean;
import br.com.onsys.service.CalcularFreteService;
import br.com.onsys.webservice.CalcularFreteRequest;

@ManagedBean
@ViewScoped
public class CalcularFreteController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	//@Autowired
	private CalcularFreteService calcularFreteService = new CalcularFreteService();
	
	private CalcularFreteBean calcularFreteBean;
	
	
	@PostConstruct
	public void init() {		
		setCalcularFreteBean(new CalcularFreteBean());
	}
	
	public void calcularFrete() {
				
		try {					
						
			calcularFreteService.calcularFreteRequest(getCalcularFreteBean());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public CalcularFreteService getCalcularFreteService() {
		return calcularFreteService;
	}

	public void setCalcularFreteService(CalcularFreteService calcularFreteService) {
		this.calcularFreteService = calcularFreteService;
	}

	public CalcularFreteBean getCalcularFreteBean() {
		return calcularFreteBean;
	}

	public void setCalcularFreteBean(CalcularFreteBean calcularFreteBean) {
		this.calcularFreteBean = calcularFreteBean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	

}
