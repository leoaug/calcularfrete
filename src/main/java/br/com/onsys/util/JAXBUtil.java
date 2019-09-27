package br.com.onsys.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;

import org.apache.axis.types.NonNegativeInteger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import br.com.onsys.webservice.CalcularFreteResponse;
import br.com.onsys.webservice.DadosFrete;

public class JAXBUtil implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static <T> T unmarshallFromXMLToObject(Class<T> classReference, String xmlToUnmarshall) throws JAXBException {  
        JAXBContext context = JAXBContext.newInstance(classReference);  
        Unmarshaller unmarshaller = context.createUnmarshaller();  
        return unmarshaller.unmarshal(new StreamSource(new StringReader(xmlToUnmarshall)), classReference).getValue();  
    }
	
	@SuppressWarnings("unchecked")
	public static <T> T unmarshallFromXMLToObject2(Class<T> classReference, String xmlToUnmarshall) throws JAXBException {  
		JAXBContext jaxbContext= JAXBContext.newInstance(classReference);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		InputStream inputStream = new ByteArrayInputStream(xmlToUnmarshall.getBytes());
		return (T) unmarshaller.unmarshal(inputStream);
    }
	

	public static CalcularFreteResponse preecherCalcularFreteResponse(String response) throws Exception  {

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
						
						//NodeList ListaDadosFrete = eElement.getChildNodes();
						//for (int i = 0; temp < ListaDadosFrete.getLength(); temp++) {
							calcularFreteResponse.getDadosFrete().setPrazo(eElement.getElementsByTagName("Prazo").item(0) == null ? "" : eElement.getElementsByTagName("Prazo").item(0).getTextContent());						
							calcularFreteResponse.getDadosFrete().setValorServico(eElement.getElementsByTagName("ValorServico").item(0) == null ? "" : eElement.getElementsByTagName("ValorServico").item(0).getTextContent());
							
						//}
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