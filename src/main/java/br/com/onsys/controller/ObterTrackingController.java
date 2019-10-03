package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.onsys.service.ObterTrackingService;
import br.com.onsys.webservice.coletas.ObterTrackingRequest;
import br.com.onsys.webservice.coletas.ObterTrackingResponse;

@Named
@Scope("view")
public class ObterTrackingController implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private ObterTrackingResponse obterTrackingResponse;
	
	private ObterTrackingRequest obterTrackingRequest;
	
	@Autowired
	private ObterTrackingService obterTrackingService;

	
	@PostConstruct
	public void onInit() {
		setObterTrackingRequest(new ObterTrackingRequest());
		setObterTrackingResponse(new ObterTrackingResponse());
	}
	
	public void obterTracking() {
		
		try {
			setObterTrackingResponse(obterTrackingService.obterTracking(getObterTrackingRequest()));
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Tracking Realizado."));

		} catch (Exception e) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Erro ao obter o tracking"));
			e.printStackTrace();
		}
	}

	public ObterTrackingResponse getObterTrackingResponse() {
		return obterTrackingResponse;
	}

	public void setObterTrackingResponse(ObterTrackingResponse obterTrackingResponse) {
		this.obterTrackingResponse = obterTrackingResponse;
	}

	public ObterTrackingRequest getObterTrackingRequest() {
		return obterTrackingRequest;
	}

	public void setObterTrackingRequest(ObterTrackingRequest obterTrackingRequest) {
		this.obterTrackingRequest = obterTrackingRequest;
	}

	
	
}
