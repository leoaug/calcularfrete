package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.service.CalcularFreteService;
import br.com.onsys.webservice.CalcularFreteRequest;

@Named
@ViewScoped
public class CalcularFreteController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private CalcularFreteService calcularFreteService;
	
	private CalcularFreteRequest calcularFreteRequest;
	
	
	@PostConstruct
	public void init() {
		
		setCalcularFreteRequest(new CalcularFreteRequest());
		
	}
	
	public void calcularFrete() {
		
		
		try {
			
			CalcularFreteRequest calcularFreteRequestTela = new CalcularFreteRequest();
			
			calcularFreteService.calcularFreteRequest(calcularFreteRequestTela);
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
