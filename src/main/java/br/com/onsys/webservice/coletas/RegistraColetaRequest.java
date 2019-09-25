/**
 * RegistraColetaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class RegistraColetaRequest  implements java.io.Serializable {
    private java.lang.String codRemessa;

    private br.com.onsys.webservice.coletas.Encomenda[] encomendas;

    public RegistraColetaRequest() {
    }

    public RegistraColetaRequest(
           java.lang.String codRemessa,
           br.com.onsys.webservice.coletas.Encomenda[] encomendas) {
           this.codRemessa = codRemessa;
           this.encomendas = encomendas;
    }


    /**
     * Gets the codRemessa value for this RegistraColetaRequest.
     * 
     * @return codRemessa
     */
    public java.lang.String getCodRemessa() {
        return codRemessa;
    }


    /**
     * Sets the codRemessa value for this RegistraColetaRequest.
     * 
     * @param codRemessa
     */
    public void setCodRemessa(java.lang.String codRemessa) {
        this.codRemessa = codRemessa;
    }


    /**
     * Gets the encomendas value for this RegistraColetaRequest.
     * 
     * @return encomendas
     */
    public br.com.onsys.webservice.coletas.Encomenda[] getEncomendas() {
        return encomendas;
    }


    /**
     * Sets the encomendas value for this RegistraColetaRequest.
     * 
     * @param encomendas
     */
    public void setEncomendas(br.com.onsys.webservice.coletas.Encomenda[] encomendas) {
        this.encomendas = encomendas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistraColetaRequest)) return false;
        RegistraColetaRequest other = (RegistraColetaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codRemessa==null && other.getCodRemessa()==null) || 
             (this.codRemessa!=null &&
              this.codRemessa.equals(other.getCodRemessa()))) &&
            ((this.encomendas==null && other.getEncomendas()==null) || 
             (this.encomendas!=null &&
              java.util.Arrays.equals(this.encomendas, other.getEncomendas())));
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
        if (getCodRemessa() != null) {
            _hashCode += getCodRemessa().hashCode();
        }
        if (getEncomendas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncomendas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncomendas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistraColetaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRemessa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodRemessa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encomendas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Encomendas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Encomenda"));
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
