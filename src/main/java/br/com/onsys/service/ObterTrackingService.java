package br.com.onsys.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class ObterTrackingService implements Serializable {


	private static final long serialVersionUID = 1L;

	public void obterTracking() {
		
		String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:ObterTracking\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <urn:ObterTracking soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
				"         <ObterTrackingRequest xsi:type=\"web:ObterTrackingRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_v24.total\">\n" + 
				"            <!--Optional:-->\n" + 
				"            <DataConsulta xsi:type=\"xsd:date\">?</DataConsulta>\n" + 
				"         </ObterTrackingRequest>\n" + 
				"      </urn:ObterTracking>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		
	}
	
}
