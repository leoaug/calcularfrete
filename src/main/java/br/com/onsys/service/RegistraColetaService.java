package br.com.onsys.service;

import java.io.Serializable;
import org.springframework.stereotype.Service;
import br.com.onsys.constantes.OnsysConstantes;
import br.com.onsys.service.util.WebServiceUtil;
import br.com.onsys.util.JAXBUtil;
import br.com.onsys.webservice.coletas.RegistraColetaRequest;
import br.com.onsys.webservice.coletas.RegistraColetaResponse;
import br.com.onsys.webservice.coletas.Encomenda;
import br.com.onsys.webservice.coletas.NFe;
 
@Service
public class RegistraColetaService implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public RegistraColetaResponse registraColeta(RegistraColetaRequest registraColetaRequest) throws Exception {
	
		String codRemessa = registraColetaRequest.getCodRemessa() == null ? "" : registraColetaRequest.getCodRemessa();
				 
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
				"				<CodRemessa xsi:type=\"xsd:string\">" + codRemessa + "</CodRemessa>\n" + 
				"				<Encomendas SOAP-ENC:arrayType=\"ns2:Encomenda["+registraColetaRequest.getListaEncomendas().size()+"]\" xsi:type=\"ns2:Encomendas\">\n" + 				
									this.montarItensEncomenda(registraColetaRequest) +								
				"				</Encomendas>\n" + 
				"			</RegistraColetaRequest>\n" + 
				"		</ns1:RegistraColeta>\n" + 
				"	</SOAP-ENV:Body>\n" + 
				"</SOAP-ENV:Envelope> ";
				
		
		/*
		String responseComProxy =  WebServiceUtil.carregaXMLWebServicesComProxy(request,
																		OnsysConstantes.USER_PROD,
																		OnsysConstantes.PASS_PROD,
																		OnsysConstantes.WSDL_REGISTRA_COLETA_OBTER_TRACKING,
																		OnsysConstantes.WSDL_REGISTRA_COLETA_ACTION,
															"c1260311", "95350120", "localhost", 40080);
		*/
		String response = WebServiceUtil.carregaXMLWebServices(request,
															   OnsysConstantes.USER_PROD,
															   OnsysConstantes.PASS_PROD,
															   OnsysConstantes.WSDL_REGISTRA_COLETA_OBTER_TRACKING,
															   OnsysConstantes.WSDL_REGISTRA_COLETA_ACTION);
		
		
		return JAXBUtil.preencherRegistraColetaResponse(response);
		

	}

	private String montarItensEncomenda(RegistraColetaRequest registraColetaRequest) {
		StringBuilder builderItensEncomenda = new StringBuilder();
		for(Encomenda encomenda : registraColetaRequest.getListaEncomendas()) {
			
			String email = encomenda.getDestEmail() == null ? "0" : encomenda.getDestEmail();
			Integer ddd = encomenda.getDestDdd() == null ? 0 : encomenda.getDestDdd();
			Integer telefone1 = encomenda.getDestTelefone1() == null ? 0 : encomenda.getDestTelefone1();
			
			builderItensEncomenda.append("<item xsi:type=\"ns2:Encomenda\">\n" + 
					"						<TipoServico xsi:type=\"xsd:nonNegativeInteger\">"+encomenda.getTipoServico().intValue()+"</TipoServico>\n" + 
					"						<TipoEntrega xsi:type=\"xsd:nonNegativeInteger\">"+encomenda.getTipoEntrega().intValue()+"</TipoEntrega>\n" + 
					"						<Volumes xsi:type=\"xsd:nonNegativeInteger\">"+encomenda.getVolumes().intValue()+"</Volumes>\n" + 
					"						<CondFrete xsi:type=\"xsd:string\">"+encomenda.getCondFrete()+"</CondFrete>\n" + 
					"						<Pedido xsi:type=\"xsd:string\">"+encomenda.getPedido()+"</Pedido>\n" + 
					"						<IdCliente xsi:type=\"xsd:string\">"+encomenda.getIdCliente()+"</IdCliente>\n" + 
					"						<Natureza xsi:type=\"xsd:string\">"+encomenda.getNatureza()+"</Natureza>\n" + 
					"						<IsencaoIcms xsi:type=\"xsd:nonNegativeInteger\">"+encomenda.getIsencaoIcms()+"</IsencaoIcms>\n" + 
					"						<DestNome xsi:type=\"xsd:string\">"+encomenda.getDestNome()+"</DestNome>\n" + 
					"						<DestCpfCnpj xsi:type=\"xsd:string\">"+encomenda.getDestCpfCnpj()+"</DestCpfCnpj>\n" + 
					"						<DestEnd xsi:type=\"xsd:string\">"+encomenda.getDestEnd()+"</DestEnd>\n" + 
					"						<DestEndNum xsi:type=\"xsd:string\">"+encomenda.getDestEndNum()+"</DestEndNum>\n" + 
					"						<DestCompl xsi:type=\"xsd:string\">"+encomenda.getDestCompl()+"</DestCompl>\n" + 
					"						<DestBairro xsi:type=\"xsd:string\">"+encomenda.getDestBairro()+"</DestBairro>\n" + 
					"						<DestCidade xsi:type=\"xsd:string\">"+encomenda.getDestCidade()+"</DestCidade>\n" + 
					"						<DestEstado xsi:type=\"xsd:string\">"+encomenda.getDestEstado()+"</DestEstado>\n" + 
					"						<DestCep xsi:type=\"xsd:nonNegativeInteger\">"+encomenda.getDestCep()+"</DestCep>\n" + 
					"						<DestEmail xsi:type=\"xsd:string\">"+email+"</DestEmail>\n" + 
					"						<DestDdd xsi:type=\"xsd:nonNegativeInteger\">"+ddd+"</DestDdd>\n" + 
					"						<DestTelefone1 xsi:type=\"xsd:nonNegativeInteger\">"+telefone1+"</DestTelefone1>\n" + 
					"						<DocFiscalNFe SOAP-ENC:arrayType=\"ns2:NFe["+encomenda.getListaDocFiscalNFe().size()+"]\" xsi:type=\"ns2:DocFiscalNFe\">\n" + 
					
												this.montarItensNotaFiscal(encomenda) +
					
					"						</DocFiscalNFe>\n" + 
					"					</item>\n"); 
		}
		return builderItensEncomenda.toString();
	}

	private String montarItensNotaFiscal(Encomenda encomenda) {
		 StringBuilder builderItensNotaFiscal = new StringBuilder();
		 for(NFe nfe : encomenda.getListaDocFiscalNFe()) {
			 
			 builderItensNotaFiscal.append("<item xsi:type=\"ns2:NFe\">\n" + 
				"								<NfeNumero xsi:type=\"xsd:nonNegativeInteger\">"+nfe.getNfeNumero()+"</NfeNumero>\n" + 
				"								<NfeSerie xsi:type=\"xsd:nonNegativeInteger\">"+nfe.getNfeSerie()+"</NfeSerie>\n" + 
				"								<NfeData xsi:type=\"xsd:date\">"+nfe.getNfeData()+"</NfeData>\n" + 
				"								<NfeValTotal xsi:type=\"xsd:decimal\">"+nfe.getNfeValTotalString()+"</NfeValTotal>\n" + 
				"								<NfeValProd xsi:type=\"xsd:decimal\">"+nfe.getNfeValProdString()+"</NfeValProd>\n" + 
				"								<NfeCfop xsi:type=\"xsd:nonNegativeInteger\">"+nfe.getNfeCfop()+"</NfeCfop>\n" + 
				"								<NfeChave xsi:type=\"xsd:string\"> "+nfe.getNfeChave()+" </NfeChave>\n" + 
			"							    </item>\n"); 
			
		 }
		return builderItensNotaFiscal.toString();
	}
}
