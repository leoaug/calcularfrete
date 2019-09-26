package br.com.onsys.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

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


}
