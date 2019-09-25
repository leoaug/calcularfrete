/**
 * Webservice_v24TotalLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;
 
public class Webservice_v24TotalLocator extends org.apache.axis.client.Service implements br.com.onsys.webservice.coletas.Webservice_v24Total {

    public Webservice_v24TotalLocator() {
    }


    public Webservice_v24TotalLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Webservice_v24TotalLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Webservice_v24TotalPort
    private java.lang.String Webservice_v24TotalPort_address = "https://edi.totalexpress.com.br:443/webservice24.php";

    public java.lang.String getWebservice_v24TotalPortAddress() {
        return Webservice_v24TotalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Webservice_v24TotalPortWSDDServiceName = "webservice_v24.totalPort";

    public java.lang.String getWebservice_v24TotalPortWSDDServiceName() {
        return Webservice_v24TotalPortWSDDServiceName;
    }

    public void setWebservice_v24TotalPortWSDDServiceName(java.lang.String name) {
        Webservice_v24TotalPortWSDDServiceName = name;
    }

    public br.com.onsys.webservice.coletas.Webservice_v24TotalPortType getWebservice_v24TotalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Webservice_v24TotalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebservice_v24TotalPort(endpoint);
    }

    public br.com.onsys.webservice.coletas.Webservice_v24TotalPortType getWebservice_v24TotalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.onsys.webservice.coletas.Webservice_v24TotalBindingStub _stub = new br.com.onsys.webservice.coletas.Webservice_v24TotalBindingStub(portAddress, this);
            _stub.setPortName(getWebservice_v24TotalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebservice_v24TotalPortEndpointAddress(java.lang.String address) {
        Webservice_v24TotalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.onsys.webservice.coletas.Webservice_v24TotalPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.onsys.webservice.coletas.Webservice_v24TotalBindingStub _stub = new br.com.onsys.webservice.coletas.Webservice_v24TotalBindingStub(new java.net.URL(Webservice_v24TotalPort_address), this);
                _stub.setPortName(getWebservice_v24TotalPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("webservice_v24.totalPort".equals(inputPortName)) {
            return getWebservice_v24TotalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "webservice_v24.total");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "webservice_v24.totalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Webservice_v24TotalPort".equals(portName)) {
            setWebservice_v24TotalPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
