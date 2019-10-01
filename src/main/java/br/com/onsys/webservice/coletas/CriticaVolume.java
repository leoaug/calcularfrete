/**
 * CriticaVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;
 
public class CriticaVolume  implements java.io.Serializable {
    private java.lang.String pedido;

    private java.lang.String idCliente;

    private Integer codigoErro;

    private java.lang.String descricaoErro;

    public CriticaVolume() {
    }

    public CriticaVolume(
           java.lang.String pedido,
           java.lang.String idCliente,
           Integer codigoErro,
           java.lang.String descricaoErro) {
           this.pedido = pedido;
           this.idCliente = idCliente;
           this.codigoErro = codigoErro;
           this.descricaoErro = descricaoErro;
    }


    /**
     * Gets the pedido value for this CriticaVolume.
     * 
     * @return pedido
     */
    public java.lang.String getPedido() {
        return pedido;
    }


    /**
     * Sets the pedido value for this CriticaVolume.
     * 
     * @param pedido
     */
    public void setPedido(java.lang.String pedido) {
        this.pedido = pedido;
    }


    /**
     * Gets the idCliente value for this CriticaVolume.
     * 
     * @return idCliente
     */
    public java.lang.String getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this CriticaVolume.
     * 
     * @param idCliente
     */
    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the codigoErro value for this CriticaVolume.
     * 
     * @return codigoErro
     */
    public Integer getCodigoErro() {
        return codigoErro;
    }


    /**
     * Sets the codigoErro value for this CriticaVolume.
     * 
     * @param codigoErro
     */
    public void setCodigoErro(Integer codigoErro) {
        this.codigoErro = codigoErro;
    }


    /**
     * Gets the descricaoErro value for this CriticaVolume.
     * 
     * @return descricaoErro
     */
    public java.lang.String getDescricaoErro() {
        return descricaoErro;
    }


    /**
     * Sets the descricaoErro value for this CriticaVolume.
     * 
     * @param descricaoErro
     */
    public void setDescricaoErro(java.lang.String descricaoErro) {
        this.descricaoErro = descricaoErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriticaVolume)) return false;
        CriticaVolume other = (CriticaVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pedido==null && other.getPedido()==null) || 
             (this.pedido!=null &&
              this.pedido.equals(other.getPedido()))) &&
            ((this.idCliente==null && other.getIdCliente()==null) || 
             (this.idCliente!=null &&
              this.idCliente.equals(other.getIdCliente()))) &&
            ((this.codigoErro==null && other.getCodigoErro()==null) || 
             (this.codigoErro!=null &&
              this.codigoErro.equals(other.getCodigoErro()))) &&
            ((this.descricaoErro==null && other.getDescricaoErro()==null) || 
             (this.descricaoErro!=null &&
              this.descricaoErro.equals(other.getDescricaoErro())));
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
        if (getPedido() != null) {
            _hashCode += getPedido().hashCode();
        }
        if (getIdCliente() != null) {
            _hashCode += getIdCliente().hashCode();
        }
        if (getCodigoErro() != null) {
            _hashCode += getCodigoErro().hashCode();
        }
        if (getDescricaoErro() != null) {
            _hashCode += getDescricaoErro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriticaVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "CriticaVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescricaoErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
