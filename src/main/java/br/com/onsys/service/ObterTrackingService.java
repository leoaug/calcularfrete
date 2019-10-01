package br.com.onsys.service;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.webservice.coletas.ObterTrackingRequest;

@Service
public class ObterTrackingService implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private ObterTrackingRequest obterTrackingRequest;
	
	@PostConstruct
	public void onInit() {
		setObterTrackingRequest(new ObterTrackingRequest());
	}

	public void obterTracking() throws Exception{
		try {
			
		
			String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:ObterTracking\">\n" + 
					"   <soapenv:Header/>\n" + 
					"   <soapenv:Body>\n" + 
					"      <urn:ObterTracking soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
					"         <ObterTrackingRequest xsi:type=\"web:ObterTrackingRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_v24.total\">\n" + 
					"            <!--Optional:-->\n" + 
					"            <DataConsulta xsi:type=\"xsd:date\">"+obterTrackingRequest.getDataConsulta()+"</DataConsulta>\n" + 
					"         </ObterTrackingRequest>\n" + 
					"      </urn:ObterTracking>\n" + 
					"   </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String WSDL = "";
			
			String responseComproxy =  WebServiceUtil.carregaXMLWebServicesComProxy(request,"btf-qa","8ZJPQbkv",WSDL,"calcularFrete","c1260311","95350120","localhost",40080);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public ObterTrackingRequest getObterTrackingRequest() {
		return obterTrackingRequest;
	}

	public void setObterTrackingRequest(ObterTrackingRequest obterTrackingRequest) {
		this.obterTrackingRequest = obterTrackingRequest;
	}
	
	
}
