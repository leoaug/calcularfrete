package br.com.onsys.service;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;

import org.springframework.stereotype.Service;

import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.webservice.CalcularFreteRequest;
import br.com.onsys.webservice.CalcularFreteResponse;

//@Service
public class CalcularFreteService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	public CalcularFreteResponse calcularFreteRequest(CalcularFreteRequest calcularFreteRequestTela) throws Exception {
		try {
				String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:calcularFrete\">" +
								 "  <soapenv:Header/> " +
								 "  <soapenv:Body> " +
									 "<urn:calcularFrete soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"> " +
									     "<calcularFreteRequest xsi:type=\"web:calcularFreteRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total\"> " +
									            //<!--You may enter the following 9 items in any order-->
										        "<TipoServico xsi:type=\"xsd:string\">" + calcularFreteRequestTela.getTipoServico() + "</TipoServico> " +
										        "<CepDestino xsi:type=\"xsd:nonNegativeInteger\">?</CepDestino> " +
										        "<Peso xsi:type=\"xsd:string\">?</Peso> " +
										        "<ValorDeclarado xsi:type=\"xsd:string\">?</ValorDeclarado> " +
										        "<TipoEntrega xsi:type=\"xsd:nonNegativeInteger\">?</TipoEntrega> " +
										            //<!--Optional:-->
										        "<ServicoCOD xsi:type=\"xsd:boolean\">?</ServicoCOD> " +
										           // <!--Optional:-->
										        "<Altura xsi:type=\"xsd:nonNegativeInteger\">?</Altura> " +
										           // <!--Optional:-->
										        "<Largura xsi:type=\"xsd:nonNegativeInteger\">?</Largura> " +
										           // <!--Optional:-->
										        "<Profundidade xsi:type=\"xsd:nonNegativeInteger\">?</Profundidade> " +
									      "</calcularFreteRequest> " +
								      "</urn:calcularFrete> " +
								   "</soapenv:Body> " +
								"</soapenv:Envelope> ";
				
				String response =  WebServiceUtil.carregaXMLWebServices(request,"btf-qa","8ZJPQbkv","https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl");
				
				
				SOAPMessage message = MessageFactory.newInstance().createMessage(null,new ByteArrayInputStream(response.getBytes("UTF-8")));
				Unmarshaller unmarshaller = JAXBContext.newInstance(CalcularFreteRequest.class).createUnmarshaller();
				CalcularFreteResponse calcularFreteResponse = (CalcularFreteResponse) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
						
						
				return calcularFreteResponse;
		} catch (Exception e) {
			throw e;
		}			
		
	}

}
