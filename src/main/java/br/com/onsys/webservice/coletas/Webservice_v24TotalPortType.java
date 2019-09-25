/**
 * Webservice_v24TotalPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public interface Webservice_v24TotalPortType extends java.rmi.Remote {

    /**
     * Cadastra uma nova coleta no sistema, através do envio das informações
     * dos
     * 				volumes.
     */
    public br.com.onsys.webservice.coletas.RegistraColetaResponse registraColeta(br.com.onsys.webservice.coletas.RegistraColetaRequest registraColetaRequest) throws java.rmi.RemoteException;

    /**
     * Obtém informações de trânsito das encomendas.
     */
    public br.com.onsys.webservice.coletas.ObterTrackingResponse obterTracking(br.com.onsys.webservice.coletas.ObterTrackingRequest obterTrackingRequest) throws java.rmi.RemoteException;
}
