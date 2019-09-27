package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.axis.management.Registrar;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.onsys.bean.CalcularFreteBean;
import br.com.onsys.service.CalcularFreteService;
import br.com.onsys.service.RegistraColetaService;
import br.com.onsys.webservice.CalcularFreteResponse;


@Named
@ViewScoped
public class CalcularFreteController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private CalcularFreteService calcularFreteService;
	
	
	
	private CalcularFreteBean calcularFreteBean;
	
	private CalcularFreteResponse calcularFreteResponse;
	
	
	@PostConstruct
	public void init() {		
		setCalcularFreteBean(new CalcularFreteBean());
	}
	
	public void calcularFrete() {
				
		try {										
			setCalcularFreteResponse(calcularFreteService.calcularFreteRequest(getCalcularFreteBean()));	
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Frete Calculado."));
	        
		} catch (Exception e) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Erro ao registrar o frete"));

			e.printStackTrace();
		}
		
	}


	public CalcularFreteBean getCalcularFreteBean() {
		return calcularFreteBean;
	}

	public void setCalcularFreteBean(CalcularFreteBean calcularFreteBean) {
		this.calcularFreteBean = calcularFreteBean;
	}

	public CalcularFreteResponse getCalcularFreteResponse() {
		return calcularFreteResponse;
	}

	public void setCalcularFreteResponse(CalcularFreteResponse calcularFreteResponse) {
		this.calcularFreteResponse = calcularFreteResponse;
	}

	

	
	
	
	

}
