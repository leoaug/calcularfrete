package br.com.onsys.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.apache.axis.AxisFault;
import org.apache.axis.types.NonNegativeInteger;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import br.com.onsys.bean.CalcularFreteBean;
import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.util.JAXBUtil;
import br.com.onsys.webservice.CalcularFreteRequest;
import br.com.onsys.webservice.CalcularFreteResponse;
import br.com.onsys.webservice.DadosFrete;
import br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub;
import br.com.onsys.webservice.Webservice_calculo_freteTotalPortTypeProxy;
import br.com.onsys.webservice.coletas.RegistraColetaResponse;
import br.com.onsys.webservice.coletas.Webservice_v24TotalBindingStub;
import br.com.onsys.webservice.coletas.Webservice_v24TotalLocator;

@Service
public class CalcularFreteService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	public CalcularFreteResponse calcularFreteRequest(CalcularFreteBean calcularFreteBean) throws Exception {
		try {
					
			
				String tipoServico = calcularFreteBean.getTipoServico() == null ? "?" :  calcularFreteBean.getTipoServico();
				String cepDestino = calcularFreteBean.getCepDestino() == null ? "?" : calcularFreteBean.getCepDestino();
				String peso = calcularFreteBean.getPeso() == null ? "?" : calcularFreteBean.getPeso();		
				String valorDeclarado = calcularFreteBean.getValorDeclarado() == null ? "?" : calcularFreteBean.getValorDeclarado();
				String tipoEntrega = calcularFreteBean.getTipoEntrega() == null ? "?" : calcularFreteBean.getTipoEntrega();
				
				String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:calcularFrete\">" +
								 "  <soapenv:Header/> " +
								 "  <soapenv:Body> " +
									 "<urn:calcularFrete soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"> " +
									     "<calcularFreteRequest xsi:type=\"web:calcularFreteRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total\"> " +
									            //<!--You may enter the following 9 items in any order-->
										        "<TipoServico xsi:type=\"xsd:string\">" + tipoServico +"</TipoServico> " +
										        "<CepDestino xsi:type=\"xsd:nonNegativeInteger\">"+ cepDestino +"</CepDestino> " +
										        "<Peso xsi:type=\"xsd:string\">"+ peso +"</Peso> " +
										        "<ValorDeclarado xsi:type=\"xsd:string\">"+ valorDeclarado +"</ValorDeclarado> " +
										        "<TipoEntrega xsi:type=\"xsd:nonNegativeInteger\">"+ tipoEntrega +"</TipoEntrega> " +
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
				
				String WSDL = "https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl";
				
				/**
				 * caso a rede tenha proxy, usar esse método
				 */
				String responseComproxy =  WebServiceUtil.carregaXMLWebServicesComProxy(request,"btf-qa","8ZJPQbkv",WSDL,"calcularFrete","c1260311","95350120","localhost",40080);
				
				//String response =  WebServiceUtil.carregaXMLWebServices(request,"btf-qa","8ZJPQbkv",WSDL,"calcularFrete");
						
				CalcularFreteResponse calcularFreteResponse = JAXBUtil.preecherCalcularFreteResponse(responseComproxy);
				
								
				return calcularFreteResponse;
				
		} catch (Exception e) {
			throw e;
		}			
		
	}


}
