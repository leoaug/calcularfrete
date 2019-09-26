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
	
	public RegistraColetaResponse registraColeta() throws Exception {
		
		
		
		
		String codRemessa = "12";
		
		String request = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:RegistraColeta\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <urn:RegistraColeta soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" + 
				"         <RegistraColetaRequest xsi:type=\"web:RegistraColetaRequest\" xmlns:web=\"http://edi.totalexpress.com.br/soap/webservice_v24.total\">\n" + 
				"            <!--You may enter the following 2 items in any order-->\n" + 
				"            <CodRemessa xsi:type=\"xsd:string\">"+codRemessa+"</CodRemessa>\n" + 
				"            <Encomendas xsi:type=\"web:Encomendas\" soapenc:arrayType=\"web:Encomenda[]\"/>\n" + 
				"         </RegistraColetaRequest>\n" + 
				"      </urn:RegistraColeta>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		String response =  WebServiceUtil.carregaXMLWebServicesComProxy(request,"btf-qa","8ZJPQbkv","https://edi.totalexpress.com.br/webservice24.php?wsdl","RegistraColeta",
				"c1260311", "95350120", "localhost", 40080);

		
		//RegistraColetaResponse registraColetaResponse = JAXBUtil.unmarshallFromXMLToObject(RegistraColetaResponse.class, response);
		String ISO = "ISO-8859-1";
		String UTF_8 = "UTF_8";
		
		SOAPMessage message = MessageFactory.newInstance().createMessage(null,new ByteArrayInputStream(response.getBytes(ISO)));
		SOAPEnvelope soapEnv = message.getSOAPPart().getEnvelope();
		SOAPBody body =	soapEnv.getBody();
		
		System.out.println(body.getAttribute("CodigoProc")); 
		
		/*
		Unmarshaller unmarshaller = JAXBContext.newInstance(RegistraColetaResponse.class).createUnmarshaller();
		RegistraColetaResponse registraColetaResponse = (RegistraColetaResponse) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
		*/
		//System.out.println(registraColetaResponse.getCodigoProc()); 
		
		return null;
		
		/* 
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
				*/
		
	}
	
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
				
				String response =  WebServiceUtil.carregaXMLWebServices(request,"btf-qa","8ZJPQbkv",WSDL,"calcularFrete");
						
				CalcularFreteResponse calcularFreteResponse = this.preecherCalcularFreteResponse(response);
				
								
				return calcularFreteResponse;
				
		} catch (Exception e) {
			throw e;
		}			
		
	}

	private CalcularFreteResponse preecherCalcularFreteResponse(String response) throws Exception  {

		CalcularFreteResponse calcularFreteResponse = new CalcularFreteResponse();
		try {

			//Get Document Builder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			//Build Document
			Document document = builder.parse(new InputSource(new StringReader(response)));

			//Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();

			//Here comes the root node
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			
			NodeList nList = document.getElementsByTagName("calcularFreteResponse");
			System.out.println("============================");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				System.out.println("");    //Just a separator
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) node;
					calcularFreteResponse.setErroConsultaFrete(eElement.getElementsByTagName("ErroConsultaFrete").item(0) == null ? "" : eElement.getElementsByTagName("ErroConsultaFrete").item(0).getTextContent());
					calcularFreteResponse.setCodigoProc(new NonNegativeInteger(eElement.getElementsByTagName("CodigoProc").item(0).getTextContent()));
					
					if(eElement.getAttribute("DadosFrete") != null){
						
						calcularFreteResponse.setDadosFrete(new DadosFrete());
						
						NodeList ListaDadosFrete = eElement.getChildNodes();
						for (int i = 0; temp < ListaDadosFrete.getLength(); temp++) {
							System.out.println("Prazo "  + eElement.getElementsByTagName("Prazo").item(0).getTextContent());
							calcularFreteResponse.getDadosFrete().setPrazo(eElement.getElementsByTagName("Prazo").item(0).getTextContent());
							
							System.out.println("ValorServico "  + eElement.getElementsByTagName("ValorServico").item(0).getTextContent());
							calcularFreteResponse.getDadosFrete().setValorServico(eElement.getElementsByTagName("ValorServico").item(0).getTextContent());
							
						}
					}
						
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return calcularFreteResponse;
		
	}
	
	
	

}
