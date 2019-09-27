package br.com.onsys.controller;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.axis.types.NonNegativeInteger;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.service.RegistraColetaService;
import br.com.onsys.webservice.coletas.Agendamento;
import br.com.onsys.webservice.coletas.Cod;
import br.com.onsys.webservice.coletas.Encomenda;
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
		
	private Encomenda encomenda;
	
	@PostConstruct
	public void onInit() {
		
		setRegistraColetaRequest(new RegistraColetaRequest());
		
		getRegistraColetaRequest().setListaEncomendas(new ArrayList<Encomenda>());
		
		setEncomenda(new Encomenda());
		
		getEncomenda().setAgendamento(new Agendamento());
		getEncomenda().setCod(new Cod());
		getEncomenda().setIsencaoIcms(0);
	}
	
	public String reinit() {
		setEncomenda(new Encomenda());         
        return null;
    }
	public void adicionarEncomenda() {
        if(getRegistraColetaRequest().getListaEncomendas().contains(getEncomenda())) {
            FacesMessage msg = new FacesMessage("Dulicado", "Já existe essa encomenda cadastrada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
        	getRegistraColetaRequest().getListaEncomendas().add(getEncomenda());
        	setEncomenda(new Encomenda());
        }
    }
	
	public void registraColeta() {
		
		try {
			 setRegistraColetaResponse(registraColetaService.registraColeta(getRegistraColetaRequest()));
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Registro Coletado."));

		} catch (Exception e) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Erro ao registrar coleta"));

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

	public Encomenda getEncomenda() {
		return encomenda;
	}

	public void setEncomenda(Encomenda encomenda) {
		this.encomenda = encomenda;
	}
	
	

}
