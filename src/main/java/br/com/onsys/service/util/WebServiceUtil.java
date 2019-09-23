package br.com.onsys.service.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


public class WebServiceUtil {

	public static String carregaXMLWebServices(String request,String login, String senha,String wsdl) throws Exception {
		try {
			
			
			StringEntity stringEntity = new StringEntity(request, "UTF-8");
		    stringEntity.setChunked(true);

		    
		    
		    // Request parameters and other properties.
		    HttpPost httpPost = new HttpPost(wsdl);
			
		    String auth = login +":"+senha;
		    
		    byte[] encodedBytes = Base64.encodeBase64 (auth.getBytes());
			
		    httpPost.setHeader("Authorization", "Basic " + new String(encodedBytes));	
			httpPost.addHeader("Content-Type", "text/xml; charset=utf-8");
		    httpPost.setEntity(stringEntity);
		    httpPost.addHeader("Accept", "text/xml");	
		    httpPost.addHeader("SOAPAction", "Get");	
		    
		    // Execute and get the response.
		    HttpClient httpClient = HttpClientBuilder.create().build();
		    HttpResponse response = httpClient.execute(httpPost);
		    HttpEntity entity = response.getEntity();

		    return EntityUtils.toString(entity);
		
			
		} catch (Exception e) {
			throw e;
		}
	}

}
