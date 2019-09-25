/**
 * Agendamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class Agendamento  implements java.io.Serializable {
    private java.util.Date agData;

    private java.lang.String agPeriodo1;

    private java.lang.String agPeriodo2;

    public Agendamento() {
    }

    public Agendamento(
           java.util.Date agData,
           java.lang.String agPeriodo1,
           java.lang.String agPeriodo2) {
           this.agData = agData;
           this.agPeriodo1 = agPeriodo1;
           this.agPeriodo2 = agPeriodo2;
    }


    /**
     * Gets the agData value for this Agendamento.
     * 
     * @return agData
     */
    public java.util.Date getAgData() {
        return agData;
    }


    /**
     * Sets the agData value for this Agendamento.
     * 
     * @param agData
     */
    public void setAgData(java.util.Date agData) {
        this.agData = agData;
    }


    /**
     * Gets the agPeriodo1 value for this Agendamento.
     * 
     * @return agPeriodo1
     */
    public java.lang.String getAgPeriodo1() {
        return agPeriodo1;
    }


    /**
     * Sets the agPeriodo1 value for this Agendamento.
     * 
     * @param agPeriodo1
     */
    public void setAgPeriodo1(java.lang.String agPeriodo1) {
        this.agPeriodo1 = agPeriodo1;
    }


    /**
     * Gets the agPeriodo2 value for this Agendamento.
     * 
     * @return agPeriodo2
     */
    public java.lang.String getAgPeriodo2() {
        return agPeriodo2;
    }


    /**
     * Sets the agPeriodo2 value for this Agendamento.
     * 
     * @param agPeriodo2
     */
    public void setAgPeriodo2(java.lang.String agPeriodo2) {
        this.agPeriodo2 = agPeriodo2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Agendamento)) return false;
        Agendamento other = (Agendamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agData==null && other.getAgData()==null) || 
             (this.agData!=null &&
              this.agData.equals(other.getAgData()))) &&
            ((this.agPeriodo1==null && other.getAgPeriodo1()==null) || 
             (this.agPeriodo1!=null &&
              this.agPeriodo1.equals(other.getAgPeriodo1()))) &&
            ((this.agPeriodo2==null && other.getAgPeriodo2()==null) || 
             (this.agPeriodo2!=null &&
              this.agPeriodo2.equals(other.getAgPeriodo2())));
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
        if (getAgData() != null) {
            _hashCode += getAgData().hashCode();
        }
        if (getAgPeriodo1() != null) {
            _hashCode += getAgPeriodo1().hashCode();
        }
        if (getAgPeriodo2() != null) {
            _hashCode += getAgPeriodo2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Agendamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Agendamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agPeriodo1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgPeriodo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agPeriodo2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgPeriodo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
