/**
 * RegistraColetaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class RegistraColetaResponse  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codigoProc;

    private java.lang.String codRomaneio;

    private org.apache.axis.types.NonNegativeInteger itensProcessados;

    private org.apache.axis.types.NonNegativeInteger itensRejeitados;

    private br.com.onsys.webservice.coletas.CriticaVolume[] errosIndividuais;

    private org.apache.axis.types.NonNegativeInteger numProtocolo;

    public RegistraColetaResponse() {
    }

    public RegistraColetaResponse(
           org.apache.axis.types.NonNegativeInteger codigoProc,
           java.lang.String codRomaneio,
           org.apache.axis.types.NonNegativeInteger itensProcessados,
           org.apache.axis.types.NonNegativeInteger itensRejeitados,
           br.com.onsys.webservice.coletas.CriticaVolume[] errosIndividuais,
           org.apache.axis.types.NonNegativeInteger numProtocolo) {
           this.codigoProc = codigoProc;
           this.codRomaneio = codRomaneio;
           this.itensProcessados = itensProcessados;
           this.itensRejeitados = itensRejeitados;
           this.errosIndividuais = errosIndividuais;
           this.numProtocolo = numProtocolo;
    }


    /**
     * Gets the codigoProc value for this RegistraColetaResponse.
     * 
     * @return codigoProc
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoProc() {
        return codigoProc;
    }


    /**
     * Sets the codigoProc value for this RegistraColetaResponse.
     * 
     * @param codigoProc
     */
    public void setCodigoProc(org.apache.axis.types.NonNegativeInteger codigoProc) {
        this.codigoProc = codigoProc;
    }


    /**
     * Gets the codRomaneio value for this RegistraColetaResponse.
     * 
     * @return codRomaneio
     */
    public java.lang.String getCodRomaneio() {
        return codRomaneio;
    }


    /**
     * Sets the codRomaneio value for this RegistraColetaResponse.
     * 
     * @param codRomaneio
     */
    public void setCodRomaneio(java.lang.String codRomaneio) {
        this.codRomaneio = codRomaneio;
    }


    /**
     * Gets the itensProcessados value for this RegistraColetaResponse.
     * 
     * @return itensProcessados
     */
    public org.apache.axis.types.NonNegativeInteger getItensProcessados() {
        return itensProcessados;
    }


    /**
     * Sets the itensProcessados value for this RegistraColetaResponse.
     * 
     * @param itensProcessados
     */
    public void setItensProcessados(org.apache.axis.types.NonNegativeInteger itensProcessados) {
        this.itensProcessados = itensProcessados;
    }


    /**
     * Gets the itensRejeitados value for this RegistraColetaResponse.
     * 
     * @return itensRejeitados
     */
    public org.apache.axis.types.NonNegativeInteger getItensRejeitados() {
        return itensRejeitados;
    }


    /**
     * Sets the itensRejeitados value for this RegistraColetaResponse.
     * 
     * @param itensRejeitados
     */
    public void setItensRejeitados(org.apache.axis.types.NonNegativeInteger itensRejeitados) {
        this.itensRejeitados = itensRejeitados;
    }


    /**
     * Gets the errosIndividuais value for this RegistraColetaResponse.
     * 
     * @return errosIndividuais
     */
    public br.com.onsys.webservice.coletas.CriticaVolume[] getErrosIndividuais() {
        return errosIndividuais;
    }


    /**
     * Sets the errosIndividuais value for this RegistraColetaResponse.
     * 
     * @param errosIndividuais
     */
    public void setErrosIndividuais(br.com.onsys.webservice.coletas.CriticaVolume[] errosIndividuais) {
        this.errosIndividuais = errosIndividuais;
    }


    /**
     * Gets the numProtocolo value for this RegistraColetaResponse.
     * 
     * @return numProtocolo
     */
    public org.apache.axis.types.NonNegativeInteger getNumProtocolo() {
        return numProtocolo;
    }


    /**
     * Sets the numProtocolo value for this RegistraColetaResponse.
     * 
     * @param numProtocolo
     */
    public void setNumProtocolo(org.apache.axis.types.NonNegativeInteger numProtocolo) {
        this.numProtocolo = numProtocolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistraColetaResponse)) return false;
        RegistraColetaResponse other = (RegistraColetaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoProc==null && other.getCodigoProc()==null) || 
             (this.codigoProc!=null &&
              this.codigoProc.equals(other.getCodigoProc()))) &&
            ((this.codRomaneio==null && other.getCodRomaneio()==null) || 
             (this.codRomaneio!=null &&
              this.codRomaneio.equals(other.getCodRomaneio()))) &&
            ((this.itensProcessados==null && other.getItensProcessados()==null) || 
             (this.itensProcessados!=null &&
              this.itensProcessados.equals(other.getItensProcessados()))) &&
            ((this.itensRejeitados==null && other.getItensRejeitados()==null) || 
             (this.itensRejeitados!=null &&
              this.itensRejeitados.equals(other.getItensRejeitados()))) &&
            ((this.errosIndividuais==null && other.getErrosIndividuais()==null) || 
             (this.errosIndividuais!=null &&
              java.util.Arrays.equals(this.errosIndividuais, other.getErrosIndividuais()))) &&
            ((this.numProtocolo==null && other.getNumProtocolo()==null) || 
             (this.numProtocolo!=null &&
              this.numProtocolo.equals(other.getNumProtocolo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigoProc() != null) {
            _hashCode += getCodigoProc().hashCode();
        }
        if (getCodRomaneio() != null) {
            _hashCode += getCodRomaneio().hashCode();
        }
        if (getItensProcessados() != null) {
            _hashCode += getItensProcessados().hashCode();
        }
        if (getItensRejeitados() != null) {
            _hashCode += getItensRejeitados().hashCode();
        }
        if (getErrosIndividuais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrosIndividuais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrosIndividuais(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumProtocolo() != null) {
            _hashCode += getNumProtocolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistraColetaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRomaneio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodRomaneio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itensProcessados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItensProcessados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itensRejeitados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItensRejeitados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errosIndividuais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrosIndividuais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "CriticaVolume"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumProtocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
