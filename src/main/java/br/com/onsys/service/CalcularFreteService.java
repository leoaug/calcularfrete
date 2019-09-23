package br.com.onsys.service;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.stream.StreamSource;

import org.apache.axis.AxisFault;
import org.apache.axis.types.NonNegativeInteger;
import org.springframework.stereotype.Service;

import br.com.onsys.bean.CalcularFreteBean;
import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.webservice.CalcularFreteRequest;
import br.com.onsys.webservice.CalcularFreteResponse;
import br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub;
import br.com.onsys.webservice.Webservice_calculo_freteTotalPortTypeProxy;

@Service
public class CalcularFreteService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	public void calcularFrete(CalcularFreteRequest calcularFreteRequestTela) {
		
		try {
					
			CalcularFreteResponse response = new Webservice_calculo_freteTotalBindingStub().calcularFrete(calcularFreteRequestTela);
			
			System.out.println(response.getDadosFrete().getPrazo()); 
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void calcularFreteRequest(CalcularFreteBean calcularFreteBean) throws Exception {
		try {
			/*
			Webservice_calculo_freteTotalPortTypeProxy proxy = new Webservice_calculo_freteTotalPortTypeProxy();
			CalcularFreteRequest calcularFreteRequest = new CalcularFreteRequest();
			calcularFreteRequest.setCepDestino(new NonNegativeInteger(calcularFreteBean.getCepDestino()));
			calcularFreteRequest.setTipoServico(calcularFreteBean.getTipoServico());
			calcularFreteRequest.setPeso(calcularFreteBean.getPeso());
			calcularFreteRequest.setValorDeclarado(calcularFreteBean.getValorDeclarado());
			calcularFreteRequest.setTipoEntrega(new NonNegativeInteger(calcularFreteBean.getTipoEntrega()));
			
			CalcularFreteResponse resp = proxy.calcularFrete(calcularFreteRequest);
			
			System.out.println(resp.getDadosFrete()); 
			 */	
			
			//testar esse cep: 22723497	
			
			
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
				
				String response =  WebServiceUtil.carregaXMLWebServices(request,"btf-qa","8ZJPQbkv","https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl");
				
				CalcularFreteResponse resp = this.unmarshallFromXMLToObject(CalcularFreteResponse.class, response);
				
				System.out.println(resp);
				
				/* 
				SOAPMessage message = MessageFactory.newInstance().createMessage(null,new ByteArrayInputStream(response.getBytes("UTF-8")));
				Unmarshaller unmarshaller = JAXBContext.newInstance(CalcularFreteResponse.class).createUnmarshaller();
				CalcularFreteResponse calcularFreteResponse = (CalcularFreteResponse) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
						
				System.out.println(calcularFreteResponse);
				*/
			
			//return calcularFreteResponse;
		} catch (Exception e) {
			throw e;
		}			
		
	}
	
	public static <T> T unmarshallFromXMLToObject(Class<T> classReference, String xmlToUnmarshall) throws JAXBException {  
        JAXBContext context = JAXBContext.newInstance(classReference);  
        Unmarshaller unmarshaller = context.createUnmarshaller();  
        return unmarshaller.unmarshal(new StreamSource(new StringReader(xmlToUnmarshall)), classReference).getValue();  
    }

}
