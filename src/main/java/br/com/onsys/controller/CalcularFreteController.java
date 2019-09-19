package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.service.CalcularFreteService;
import br.com.onsys.webservice.CalcularFreteRequest;

@ManagedBean
@ViewScoped
public class CalcularFreteController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	//@Autowired
	private CalcularFreteService calcularFreteService = new CalcularFreteService();
	
	private CalcularFreteRequest calcularFreteRequest;
	
	
	@PostConstruct
	public void init() {		
		setCalcularFreteRequest(new CalcularFreteRequest());		
	}
	
	public void calcularFrete() {
				
		try {					
			calcularFreteService.calcularFreteRequest(getCalcularFreteRequest());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public CalcularFreteRequest getCalcularFreteRequest() {
		return calcularFreteRequest;
	}

	public void setCalcularFreteRequest(CalcularFreteRequest calcularFreteRequest) {
		this.calcularFreteRequest = calcularFreteRequest;
	}

	
	
	

}
