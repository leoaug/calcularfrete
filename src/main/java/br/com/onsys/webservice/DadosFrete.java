/**
 * DadosFrete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice;

public class DadosFrete  implements java.io.Serializable {
  
	private static final long serialVersionUID = 1L;

	private java.lang.String prazo;

    private java.lang.String valorServico;

    public DadosFrete() {
    }

    public DadosFrete(
           java.lang.String prazo,
           java.lang.String valorServico) {
           this.prazo = prazo;
           this.valorServico = valorServico;
    }


    /**
     * Gets the prazo value for this DadosFrete.
     * 
     * @return prazo
     */
    public java.lang.String getPrazo() {
        return prazo;
    }


    /**
     * Sets the prazo value for this DadosFrete.
     * 
     * @param prazo
     */
    public void setPrazo(java.lang.String prazo) {
        this.prazo = prazo;
    }


    /**
     * Gets the valorServico value for this DadosFrete.
     * 
     * @return valorServico
     */
    public java.lang.String getValorServico() {
        return valorServico;
    }


    /**
     * Sets the valorServico value for this DadosFrete.
     * 
     * @param valorServico
     */
    public void setValorServico(java.lang.String valorServico) {
        this.valorServico = valorServico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosFrete)) return false;
        DadosFrete other = (DadosFrete) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prazo==null && other.getPrazo()==null) || 
             (this.prazo!=null &&
              this.prazo.equals(other.getPrazo()))) &&
            ((this.valorServico==null && other.getValorServico()==null) || 
             (this.valorServico!=null &&
              this.valorServico.equals(other.getValorServico())));
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
        if (getPrazo() != null) {
            _hashCode += getPrazo().hashCode();
        }
        if (getValorServico() != null) {
            _hashCode += getValorServico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosFrete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "DadosFrete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Prazo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorServico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorServico"));
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
