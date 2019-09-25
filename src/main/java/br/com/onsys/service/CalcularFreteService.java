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

	
	public void registraColeta() throws Exception {
		
		String request = "<SOAP-ENV:Envelope\n" + 
				"	xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" + 
				"	xmlns:ns1=\"urn:RegistraColeta\"\n" + 
				"	xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n" + 
				"	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" + 
				"	xmlns:ns2=\"http://edi.totalexpress.com.br/soap/webservice_v24.total\"\n" + 
				"	xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\"\n" + 
				"	SOAPENV:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
				"	<SOAP-ENV:Body>\n" + 
				"		<ns1:RegistraColeta>\n" + 
				"			<RegistraColetaRequest\n" + 
				"				xsi:type=\"ns2:RegistraColetaRequest\">\n" + 
				"				<CodRemessa xsi:type=\"xsd:string\"></CodRemessa>\n" + 
				"				<Encomendas SOAP-ENC:arrayType=\"ns2:Encomenda[1]\"\n" + 
				"					xsi:type=\"ns2:Encomendas\">\n" + 
				"					<item xsi:type=\"ns2:Encomenda\">\n" + 
				"						<TipoServico xsi:type=\"xsd:nonNegativeInteger\">0</TipoServico>\n" + 
				"						<TipoEntrega xsi:type=\"xsd:nonNegativeInteger\">0</TipoEntrega>\n" + 
				"						<Volumes xsi:type=\"xsd:nonNegativeInteger\">0</Volumes>\n" + 
				"						<CondFrete xsi:type=\"xsd:string\">0</CondFrete>\n" + 
				"						<Pedido xsi:type=\"xsd:string\">0</Pedido>\n" + 
				"						<IdCliente xsi:type=\"xsd:string\">0</IdCliente>\n" + 
				"						<Natureza xsi:type=\"xsd:string\">0</Natureza>\n" + 
				"						<IsencaoIcms xsi:type=\"xsd:nonNegativeInteger\">0</IsencaoIcms>\n" + 
				"						<DestNome xsi:type=\"xsd:string\">0</DestNome>\n" + 
				"						<DestCpfCnpj xsi:type=\"xsd:string\">0</DestCpfCnpj>\n" + 
				"						<DestEnd xsi:type=\"xsd:string\">0</DestEnd>\n" + 
				"						<DestEndNum xsi:type=\"xsd:string\">0</DestEndNum>\n" + 
				"						<DestCompl xsi:type=\"xsd:string\">0</DestCompl>\n" + 
				"						<DestBairro xsi:type=\"xsd:string\">0</DestBairro>\n" + 
				"						<DestCidade xsi:type=\"xsd:string\">0</DestCidade>\n" + 
				"						<DestEstado xsi:type=\"xsd:string\">0</DestEstado>\n" + 
				"						<DestCep xsi:type=\"xsd:nonNegativeInteger\">0</DestCep>\n" + 
				"						<DestEmail xsi:type=\"xsd:string\">0</DestEmail>\n" + 
				"						<DestDdd xsi:type=\"xsd:nonNegativeInteger\">0</DestDdd>\n" + 
				"						<DestTelefone1 xsi:type=\"xsd:nonNegativeInteger\">0</DestTelefone1>\n" + 
				"						<DocFiscalNFe SOAP-ENC:arrayType=\"ns2:NFe[1]\"\n" + 
				"							xsi:type=\"ns2:DocFiscalNFe\">\n" + 
				"							<item xsi:type=\"ns2:NFe\">\n" + 
				"								<NfeNumero xsi:type=\"xsd:nonNegativeInteger\">0</NfeNumero>\n" + 
				"								<NfeSerie xsi:type=\"xsd:nonNegativeInteger\">0</NfeSerie>\n" + 
				"								<NfeData xsi:type=\"xsd:date\">0</NfeData>\n" + 
				"								<NfeValTotal xsi:type=\"xsd:decimal\">0</NfeValTotal>\n" + 
				"								<NfeValProd xsi:type=\"xsd:decimal\">0</NfeValProd>\n" + 
				"								<NfeCfop xsi:type=\"xsd:nonNegativeInteger\">0</NfeCfop>\n" + 
				"								<NfeChave xsi:type=\"xsd:string\"> 0 </NfeChave>\n" + 
				"							</item>\n" + 
				"						</DocFiscalNFe>\n" + 
				"					</item>\n" + 
				"				</Encomendas>\n" + 
				"			</RegistraColetaRequest>\n" + 
				"		</ns1:RegistraColeta>\n" + 
				"	</SOAP-ENV:Body>\n" + 
				"</SOAP-ENV:Envelope> ";
				
		
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
				
				//String response =  WebServiceUtil.carregaXMLWebServices(request,"btf-qa","8ZJPQbkv","https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl");
				String response =  WebServiceUtil.carregaXMLWebServicesComProxy(request,"btf-qa","8ZJPQbkv",
						"https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl","c1260311","95350120","localhost",40080);

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
