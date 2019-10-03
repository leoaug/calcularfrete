package br.com.onsys.service.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;


public class WebServiceUtil {

	public static String carregaXMLWebServices(String request,String login, String senha,String wsdl,String soapAction) throws Exception {
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
		    httpPost.addHeader("SOAPAction", soapAction);	
		    
		    // Execute and get the response.
		    HttpClient httpClient = HttpClientBuilder.create().build();
		    HttpResponse response = httpClient.execute(httpPost);
		    HttpEntity entity = response.getEntity();

		    return EntityUtils.toString(entity);
		
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static String carregaXMLWebServicesComProxy(String request,String login, String senha,String wsdl,String soapAction,String userProxy,String passProxy,String proxyHost,Integer proxyPort) throws Exception {
		try {
			
			
			StringEntity stringEntity = new StringEntity(request, "UTF-8");
		    stringEntity.setChunked(true);
		    
		    
		    CredentialsProvider credsProvider = new BasicCredentialsProvider();
		    credsProvider.setCredentials(
		            new AuthScope(proxyHost, proxyPort),
		            new UsernamePasswordCredentials(userProxy, passProxy));
		    

		    HttpHost proxy = new HttpHost(proxyHost, proxyPort);

	        RequestConfig config = RequestConfig.custom()
	            .setProxy(proxy)
	            .build();
		    
		    
		    // Request parameters and other properties.
		    HttpPost httpPost = new HttpPost(wsdl);
		    httpPost.setConfig(config);
			
		    String auth = login +":"+senha;
		    
		    byte[] encodedBytes = Base64.encodeBase64 (auth.getBytes());
			
		    httpPost.setHeader("Authorization", "Basic " + new String(encodedBytes));	
			httpPost.addHeader("Content-Type", "text/xml; charset=utf-8");
		    httpPost.setEntity(stringEntity);
		    httpPost.addHeader("Accept", "text/xml");	
		    httpPost.addHeader("SOAPAction", soapAction);	
		 
		    
		    //Creating the HttpClientBuilder
		    HttpClientBuilder clientbuilder = HttpClients.custom();

		    //Setting the credentials
		    clientbuilder = clientbuilder.setDefaultCredentialsProvider(credsProvider);
	      
		    //Building the CloseableHttpClient object
		    CloseableHttpClient httpClient = clientbuilder.build();
		    
		    // Execute and get the response.
		    //HttpClient httpClient = HttpClientBuilder.create().build();
		    HttpResponse response = httpClient.execute(httpPost);
		    HttpEntity entity = response.getEntity();

		    return EntityUtils.toString(entity);
		
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static String carregaXMLWebServicesTimeout(String request,String login, String senha,String wsdl,String soapAction,int timeout) throws Exception {
		try {
			
			
			StringEntity stringEntity = new StringEntity(request, "UTF-8");
		    stringEntity.setChunked(true);

		    RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout).
					  setSocketTimeout(timeout).
					  setConnectionRequestTimeout(timeout).build();
		    
		    // Request parameters and other properties.
		    HttpPost httpPost = new HttpPost(wsdl);
		    httpPost.setConfig(requestConfig);
		    String auth = login +":"+senha;
		    
		    byte[] encodedBytes = Base64.encodeBase64 (auth.getBytes());
			
		    httpPost.setHeader("Authorization", "Basic " + new String(encodedBytes));	
			httpPost.addHeader("Content-Type", "text/xml; charset=utf-8");
		    httpPost.setEntity(stringEntity);
		    httpPost.addHeader("Accept", "text/xml");	
		    httpPost.addHeader("SOAPAction", soapAction);	
		    
		    
		    PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		    connManager.setMaxTotal(2000);
		    
		    // Execute and get the response.
		    HttpClient httpClient = HttpClientBuilder.create().setConnectionManager(connManager).setDefaultRequestConfig(requestConfig).build();
		    HttpResponse response = httpClient.execute(httpPost);
		    HttpEntity entity = response.getEntity();

		    return EntityUtils.toString(entity);
		
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static String carregaXMLWebServicesComProxyTimeout(String request,String login, String senha,String wsdl,String soapAction,String userProxy,String passProxy,String proxyHost,Integer proxyPort,int timeout) throws Exception {
		try {
			
			
			StringEntity stringEntity = new StringEntity(request, "UTF-8");
		    stringEntity.setChunked(true);
		    
		    
		    CredentialsProvider credsProvider = new BasicCredentialsProvider();
		    credsProvider.setCredentials(
		            new AuthScope(proxyHost, proxyPort),
		            new UsernamePasswordCredentials(userProxy, passProxy));
		    

		    HttpHost proxy = new HttpHost(proxyHost, proxyPort);

	        RequestConfig requestConfig = RequestConfig.custom().
	        		 setConnectTimeout(timeout).
					  setSocketTimeout(timeout).
					  setConnectionRequestTimeout(timeout)
	            .setProxy(proxy)
	            .build();

		    
		    // Request parameters and other properties.
		    HttpPost httpPost = new HttpPost(wsdl);
		    httpPost.setConfig(requestConfig);
			
		    String auth = login +":"+senha;
		    
		    byte[] encodedBytes = Base64.encodeBase64 (auth.getBytes());
			
		    httpPost.setHeader("Authorization", "Basic " + new String(encodedBytes));	
			httpPost.addHeader("Content-Type", "text/xml; charset=utf-8");
		    httpPost.setEntity(stringEntity);
		    httpPost.addHeader("Accept", "text/xml");	
		    httpPost.addHeader("SOAPAction", soapAction);	
		 
		    
		    
		    //Creating the HttpClientBuilder
		    HttpClientBuilder clientbuilder = HttpClients.custom();

		    //Setting the credentials
		    clientbuilder = clientbuilder.setDefaultCredentialsProvider(credsProvider);
		    
		    PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		    connManager.setMaxTotal(2000);
		    //connManager.setDefaultMaxPerRoute(108);
	      
		    //Building the CloseableHttpClient object
		    CloseableHttpClient httpClient = clientbuilder.setConnectionManager(connManager).setDefaultRequestConfig(requestConfig).build();
		    
		    // Execute and get the response.
		    //HttpClient httpClient = HttpClientBuilder.create().build();
		    HttpResponse response = httpClient.execute(httpPost);
		    HttpEntity entity = response.getEntity();

		    return EntityUtils.toString(entity);
		
			
		} catch (Exception e) {
			throw e;
		}
	}

}
