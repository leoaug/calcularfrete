package br.com.onsys.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.service.RegistraColetaService;
import br.com.onsys.webservice.coletas.RegistraColetaRequest;
import br.com.onsys.webservice.coletas.RegistraColetaResponse;

@Named
@ViewScoped
public class RegistrarColetaController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private RegistraColetaService registraColetaService;
	
	private RegistraColetaRequest registraColetaRequest;
	
	private RegistraColetaResponse registraColetaResponse;
	
	public void registraColeta() {
		
		try {
			 setRegistraColetaResponse(registraColetaService.registraColeta(getRegistraColetaRequest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public RegistraColetaRequest getRegistraColetaRequest() {
		return registraColetaRequest;
	}

	public void setRegistraColetaRequest(RegistraColetaRequest registraColetaRequest) {
		this.registraColetaRequest = registraColetaRequest;
	}

	public RegistraColetaResponse getRegistraColetaResponse() {
		return registraColetaResponse;
	}

	public void setRegistraColetaResponse(RegistraColetaResponse registraColetaResponse) {
		this.registraColetaResponse = registraColetaResponse;
	}
	
	

}
