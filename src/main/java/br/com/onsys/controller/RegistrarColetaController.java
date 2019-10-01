package br.com.onsys.controller;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List; 

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
import br.com.onsys.webservice.coletas.NFe;

@Named
@ViewScoped
public class RegistrarColetaController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private RegistraColetaService registraColetaService;
	
	private RegistraColetaRequest registraColetaRequest;
	
	private RegistraColetaResponse registraColetaResponse;
		
	private Encomenda encomenda;
	
	private Encomenda encomendaDialog;
	
	private NFe nfe;
	
	private Integer index;
	
	@PostConstruct
	public void onInit() {
		
		setRegistraColetaRequest(new RegistraColetaRequest());
		
		getRegistraColetaRequest().setListaEncomendas(new ArrayList<Encomenda>());
		
		setRegistraColetaResponse(new RegistraColetaResponse());
		
		setEncomendaDialog(new Encomenda());
		
		setNfe(new NFe());
		
		this.initEncomenda();
		
	
	}
	
	private void initEncomenda() {
		setEncomenda(new Encomenda());
		getEncomenda().setAgendamento(new Agendamento());
		getEncomenda().setCod(new Cod());
		getEncomenda().setIsencaoIcms(0);		
	}

	public String reinit() {
		this.initEncomenda();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Item adicionado."));
        return null;
    }
	public void adicionarEncomenda() {
        if(getRegistraColetaRequest().getListaEncomendas().contains(getEncomenda())) {
            FacesMessage msg = new FacesMessage("Dulicado", "Já existe essa encomenda cadastrada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
        	getRegistraColetaRequest().getListaEncomendas().add(getEncomenda());
        	for(Encomenda enc : getRegistraColetaRequest().getListaEncomendas()) {
        		enc.setListaDocFiscalNFe(new ArrayList<NFe>());
        	}
        	this.initEncomenda();

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
	
	public void resetarNfe() {
		setNfe(new NFe());
	}
	
	public void guardarIndexEncomedaLista(Encomenda encomenda) {
		//getRegistraColetaRequest().getListaEncomendas().get(index);
		//quadra o index do objeto para substituilo depois
		//setIndex(index);
		getEncomendaDialog().setIndex(getRegistraColetaRequest().getListaEncomendas().indexOf(encomenda));
	}

	public void cadastrarNfeNaEncomenda() {
		if(getRegistraColetaRequest().getListaEncomendas().get(getEncomendaDialog().getIndex()).getListaDocFiscalNFe() == null) {
			getRegistraColetaRequest().getListaEncomendas().get(getEncomendaDialog().getIndex()).setListaDocFiscalNFe(new ArrayList<NFe>());
		}
		getRegistraColetaRequest().getListaEncomendas().get(getEncomendaDialog().getIndex()).getListaDocFiscalNFe().add(getNfe());	
		//getRegistraColetaRequest().getListaEncomendas().indexOf(o)
		setNfe(new NFe());
	}
	
	public Encomenda getEncomendaDialog() {
		return encomendaDialog;
	}

	public void setEncomendaDialog(Encomenda encomendaDialog) {
		this.encomendaDialog = encomendaDialog;
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

	public NFe getNfe() {
		return nfe;
	}

	public void setNfe(NFe nfe) {
		this.nfe = nfe;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
	
	
	

}
