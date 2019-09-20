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
import br.com.onsys.webservice.CalcularFreteResponse;

@ManagedBean
@ViewScoped
public class CalcularFreteController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	//@Autowired
	private CalcularFreteService calcularFreteService = new CalcularFreteService();
	
	private CalcularFreteBean calcularFreteBean;
	
	private CalcularFreteResponse calcularFreteResponse;
	
	
	@PostConstruct
	public void init() {		
		setCalcularFreteBean(new CalcularFreteBean());
	}
	
	public void calcularFrete() {
				
		try {					
						
			setCalcularFreteResponse(calcularFreteService.calcularFreteRequest(getCalcularFreteBean()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
