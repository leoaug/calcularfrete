package br.com.onsys.service;

 
import java.io.Serializable;
import org.springframework.stereotype.Service;
import br.com.onsys.bean.CalcularFreteBean;
import br.com.onsys.constantes.OnsysConstantes;
import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.util.JAXBUtil;
import br.com.onsys.webservice.CalcularFreteResponse;


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
				String altura = calcularFreteBean.getAltura() == null ? "?" : calcularFreteBean.getAltura();
				String largura = calcularFreteBean.getLargura() == null ? "?" : calcularFreteBean.getLargura();
				String profundidade = calcularFreteBean.getProfundidade() == null ? "?" : calcularFreteBean.getProfundidade();
				
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
										        "<ServicoCOD xsi:type=\"xsd:boolean\">"+calcularFreteBean.isServicoCOD()+"</ServicoCOD> " +
										           // <!--Optional:-->
										        "<Altura xsi:type=\"xsd:nonNegativeInteger\">"+ altura +"</Altura> " +
										           // <!--Optional:-->
										        "<Largura xsi:type=\"xsd:nonNegativeInteger\">"+ largura +"</Largura> " +
										           // <!--Optional:-->
										        "<Profundidade xsi:type=\"xsd:nonNegativeInteger\">"+ profundidade +"</Profundidade> " +
									      "</calcularFreteRequest> " +
								      "</urn:calcularFrete> " +
								   "</soapenv:Body> " +
								"</soapenv:Envelope> ";
				
				
				/**
				 * caso a rede tenha proxy, usar esse método
				 
				String responseComproxy =  WebServiceUtil.carregaXMLWebServicesComProxy(request,
																					   OnsysConstantes.USER_DESENV,
																					   OnsysConstantes.PASS_DESENV,
																					   OnsysConstantes.WSDL_CALCULO_FRETE,
																					   OnsysConstantes.WSDL_CALCULO_FRETE_ACTION,
																					   "c1260311",
																					   "95350120",
																					   "localhost",
																					   40080);
				*/
				String response =  WebServiceUtil.carregaXMLWebServices(request,
																		OnsysConstantes.USER_PROD,
																		OnsysConstantes.PASS_PROD,
																		OnsysConstantes.WSDL_CALCULO_FRETE,
																		OnsysConstantes.WSDL_CALCULO_FRETE_ACTION);
						
				CalcularFreteResponse calcularFreteResponse = JAXBUtil.preecherCalcularFreteResponse(response);
				
								
				return calcularFreteResponse;
				
		} catch (Exception e) {
			throw e;
		}			
		
	}


}
