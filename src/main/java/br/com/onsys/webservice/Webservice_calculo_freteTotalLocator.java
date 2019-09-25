/**
 * Webservice_calculo_freteTotalLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice;

public class Webservice_calculo_freteTotalLocator extends org.apache.axis.client.Service implements br.com.onsys.webservice.Webservice_calculo_freteTotal {

    public Webservice_calculo_freteTotalLocator() {
    }


    public Webservice_calculo_freteTotalLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Webservice_calculo_freteTotalLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Webservice_calculo_freteTotalPort
    private java.lang.String Webservice_calculo_freteTotalPort_address = "https://edi.totalexpress.com.br:443/webservice_calculo_frete.php";

    public java.lang.String getWebservice_calculo_freteTotalPortAddress() {
        return Webservice_calculo_freteTotalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Webservice_calculo_freteTotalPortWSDDServiceName = "webservice_calculo_frete.totalPort";

    public java.lang.String getWebservice_calculo_freteTotalPortWSDDServiceName() {
        return Webservice_calculo_freteTotalPortWSDDServiceName;
    }

    public void setWebservice_calculo_freteTotalPortWSDDServiceName(java.lang.String name) {
        Webservice_calculo_freteTotalPortWSDDServiceName = name;
    }

    public br.com.onsys.webservice.Webservice_calculo_freteTotalPortType getWebservice_calculo_freteTotalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Webservice_calculo_freteTotalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebservice_calculo_freteTotalPort(endpoint);
    }

    public br.com.onsys.webservice.Webservice_calculo_freteTotalPortType getWebservice_calculo_freteTotalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub _stub = new br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub(portAddress, this);
            _stub.setPortName(getWebservice_calculo_freteTotalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebservice_calculo_freteTotalPortEndpointAddress(java.lang.String address) {
        Webservice_calculo_freteTotalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.onsys.webservice.Webservice_calculo_freteTotalPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub _stub = new br.com.onsys.webservice.Webservice_calculo_freteTotalBindingStub(new java.net.URL(Webservice_calculo_freteTotalPort_address), this);
                _stub.setPortName(getWebservice_calculo_freteTotalPortWSDDServiceName());
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
        if ("webservice_calculo_frete.totalPort".equals(inputPortName)) {
            return getWebservice_calculo_freteTotalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "webservice_calculo_frete.total");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "webservice_calculo_frete.totalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Webservice_calculo_freteTotalPort".equals(portName)) {
            setWebservice_calculo_freteTotalPortEndpointAddress(address);
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
