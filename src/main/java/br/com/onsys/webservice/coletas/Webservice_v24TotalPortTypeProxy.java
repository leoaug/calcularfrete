package br.com.onsys.webservice.coletas;
 
public class Webservice_v24TotalPortTypeProxy implements br.com.onsys.webservice.coletas.Webservice_v24TotalPortType {
  private String _endpoint = null;
  private br.com.onsys.webservice.coletas.Webservice_v24TotalPortType webservice_v24TotalPortType = null;
  
  public Webservice_v24TotalPortTypeProxy() {
    _initWebservice_v24TotalPortTypeProxy();
  }
  
  public Webservice_v24TotalPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebservice_v24TotalPortTypeProxy();
  }
  
  private void _initWebservice_v24TotalPortTypeProxy() {
    try {
      webservice_v24TotalPortType = (new br.com.onsys.webservice.coletas.Webservice_v24TotalLocator()).getWebservice_v24TotalPort();
      if (webservice_v24TotalPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webservice_v24TotalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webservice_v24TotalPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webservice_v24TotalPortType != null)
      ((javax.xml.rpc.Stub)webservice_v24TotalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.onsys.webservice.coletas.Webservice_v24TotalPortType getWebservice_v24TotalPortType() {
    if (webservice_v24TotalPortType == null)
      _initWebservice_v24TotalPortTypeProxy();
    return webservice_v24TotalPortType;
  }
  
  public br.com.onsys.webservice.coletas.RegistraColetaResponse registraColeta(br.com.onsys.webservice.coletas.RegistraColetaRequest registraColetaRequest) throws java.rmi.RemoteException{
    if (webservice_v24TotalPortType == null)
      _initWebservice_v24TotalPortTypeProxy();
    return webservice_v24TotalPortType.registraColeta(registraColetaRequest);
  }
  
  public br.com.onsys.webservice.coletas.ObterTrackingResponse obterTracking(br.com.onsys.webservice.coletas.ObterTrackingRequest obterTrackingRequest) throws java.rmi.RemoteException{
    if (webservice_v24TotalPortType == null)
      _initWebservice_v24TotalPortTypeProxy();
    return webservice_v24TotalPortType.obterTracking(obterTrackingRequest);
  }
  
  
}