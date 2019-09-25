package br.com.onsys.webservice;

public class Webservice_calculo_freteTotalPortTypeProxy implements br.com.onsys.webservice.Webservice_calculo_freteTotalPortType {
  private String _endpoint = null;
  private br.com.onsys.webservice.Webservice_calculo_freteTotalPortType webservice_calculo_freteTotalPortType = null;
  
  public Webservice_calculo_freteTotalPortTypeProxy() {
    _initWebservice_calculo_freteTotalPortTypeProxy();
  }
  
  public Webservice_calculo_freteTotalPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebservice_calculo_freteTotalPortTypeProxy();
  }
  
  private void _initWebservice_calculo_freteTotalPortTypeProxy() {
    try {
      webservice_calculo_freteTotalPortType = (new br.com.onsys.webservice.Webservice_calculo_freteTotalLocator()).getWebservice_calculo_freteTotalPort();
      if (webservice_calculo_freteTotalPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webservice_calculo_freteTotalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webservice_calculo_freteTotalPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webservice_calculo_freteTotalPortType != null)
      ((javax.xml.rpc.Stub)webservice_calculo_freteTotalPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.onsys.webservice.Webservice_calculo_freteTotalPortType getWebservice_calculo_freteTotalPortType() {
    if (webservice_calculo_freteTotalPortType == null)
      _initWebservice_calculo_freteTotalPortTypeProxy();
    return webservice_calculo_freteTotalPortType;
  }
  
  public br.com.onsys.webservice.CalcularFreteResponse calcularFrete(br.com.onsys.webservice.CalcularFreteRequest calcularFreteRequest) throws java.rmi.RemoteException{
    if (webservice_calculo_freteTotalPortType == null)
      _initWebservice_calculo_freteTotalPortTypeProxy();
    return webservice_calculo_freteTotalPortType.calcularFrete(calcularFreteRequest);
  }
  
  
}