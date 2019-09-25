/**
 * Webservice_v24TotalBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class Webservice_v24TotalBindingStub extends org.apache.axis.client.Stub implements br.com.onsys.webservice.coletas.Webservice_v24TotalPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegistraColeta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RegistraColetaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaRequest"), br.com.onsys.webservice.coletas.RegistraColetaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaResponse"));
        oper.setReturnClass(br.com.onsys.webservice.coletas.RegistraColetaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "RegistraColetaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObterTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ObterTrackingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ObterTrackingRequest"), br.com.onsys.webservice.coletas.ObterTrackingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ObterTrackingResponse"));
        oper.setReturnClass(br.com.onsys.webservice.coletas.ObterTrackingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ObterTrackingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

    }

    public Webservice_v24TotalBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Webservice_v24TotalBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Webservice_v24TotalBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Agendamento");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.Agendamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ArrayEncomendaRetorno");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.EncomendaRetorno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "EncomendaRetorno");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ArrayLoteRetorno");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.LoteRetorno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "LoteRetorno");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ArrayStatusEct");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.StatusEct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusEct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ArrayStatusTotal");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.StatusTotal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusTotal");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Cod");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.Cod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "CriticaVolume");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.CriticaVolume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalNF");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.NF[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NF");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalNFe");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.NFe[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NFe");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalO");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.DocFiscalOutroTipo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalOutroTipo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalOutroTipo");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.DocFiscalOutroTipo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Encomenda");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.Encomenda.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "EncomendaRetorno");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.EncomendaRetorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Encomendas");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.Encomenda[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Encomenda");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ErrosIndividuais");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.CriticaVolume[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "CriticaVolume");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "LoteRetorno");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.LoteRetorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NF");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.NF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NFe");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.NFe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ObterTrackingRequest");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.ObterTrackingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ObterTrackingResponse");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.ObterTrackingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaRequest");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.RegistraColetaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaResponse");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.RegistraColetaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusEct");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.StatusEct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusTotal");
            cachedSerQNames.add(qName);
            cls = br.com.onsys.webservice.coletas.StatusTotal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.onsys.webservice.coletas.RegistraColetaResponse registraColeta(br.com.onsys.webservice.coletas.RegistraColetaRequest registraColetaRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:RegistraColeta#RegistraColeta");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:RegistraColeta", "RegistraColeta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {registraColetaRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.onsys.webservice.coletas.RegistraColetaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.onsys.webservice.coletas.RegistraColetaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.onsys.webservice.coletas.RegistraColetaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.onsys.webservice.coletas.ObterTrackingResponse obterTracking(br.com.onsys.webservice.coletas.ObterTrackingRequest obterTrackingRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ObterTracking#ObterTracking");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ObterTracking", "ObterTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obterTrackingRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.onsys.webservice.coletas.ObterTrackingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.onsys.webservice.coletas.ObterTrackingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.onsys.webservice.coletas.ObterTrackingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
