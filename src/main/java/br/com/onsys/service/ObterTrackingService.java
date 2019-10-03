package br.com.onsys.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import br.com.onsys.constantes.OnsysConstantes;
import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.util.DataUtil;
import br.com.onsys.util.JAXBUtil;
import br.com.onsys.webservice.coletas.ObterTrackingRequest;
import br.com.onsys.webservice.coletas.ObterTrackingResponse;

@Service
public class ObterTrackingService implements Serializable {


	private static final long serialVersionUID = 1L;
	
	
	public ObterTrackingResponse obterTracking(ObterTrackingRequest obterTrackingRequest) throws Exception{
		try {
			
		
			String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:ObterTracking\">\n" + 
					"   <soapenv:Header/>\n" + 
					"   <soapenv:Body>\n" + 
					"      <urn:ObterTracking soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
					"         <ObterTrackingRequest xsi:type=\"web:ObterTrackingRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_v24.total\">\n" + 
					"            <!--Optional:-->\n" + 
					"            <DataConsulta xsi:type=\"xsd:date\">"+DataUtil.dateToString(obterTrackingRequest.getDataConsulta(), "yyyy-MM-dd") +"</DataConsulta>\n" + 
					"         </ObterTrackingRequest>\n" + 
					"      </urn:ObterTracking>\n" + 
					"   </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			/*
			String responseComproxy =  WebServiceUtil.carregaXMLWebServicesComProxyTimeout(request,
																					OnsysConstantes.USER_DESENV, 
																					OnsysConstantes.PASS_DESENV,
																					OnsysConstantes.WSDL_REGISTRA_COLETA_OBTER_TRACKING, 
																					OnsysConstantes.WSDL_OBTER_TRACKING_ACTION,
																					"c1260311", 
																					"95350120", 
																					"localhost", 
																					40080,
																					OnsysConstantes.TIMEOUT
																					);
			*/
			String response =  WebServiceUtil.carregaXMLWebServicesTimeout(request,
																	OnsysConstantes.USER_PROD, 
		 															OnsysConstantes.PASS_PROD,
																	OnsysConstantes.WSDL_REGISTRA_COLETA_OBTER_TRACKING, 
																	OnsysConstantes.WSDL_OBTER_TRACKING_ACTION,
																	OnsysConstantes.TIMEOUT);
																	
			return JAXBUtil.preencherObterTrackingResponse(response);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	
}
