/**
 * Cod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class Cod  implements java.io.Serializable {
    private java.lang.String formaPagto;

    private org.apache.axis.types.NonNegativeInteger parcelas;

    private java.math.BigDecimal valor;
 
    public Cod() {
    }

    public Cod(
           java.lang.String formaPagto,
           org.apache.axis.types.NonNegativeInteger parcelas,
           java.math.BigDecimal valor) {
           this.formaPagto = formaPagto;
           this.parcelas = parcelas;
           this.valor = valor;
    }


    /**
     * Gets the formaPagto value for this Cod.
     * 
     * @return formaPagto
     */
    public java.lang.String getFormaPagto() {
        return formaPagto;
    }


    /**
     * Sets the formaPagto value for this Cod.
     * 
     * @param formaPagto
     */
    public void setFormaPagto(java.lang.String formaPagto) {
        this.formaPagto = formaPagto;
    }


    /**
     * Gets the parcelas value for this Cod.
     * 
     * @return parcelas
     */
    public org.apache.axis.types.NonNegativeInteger getParcelas() {
        return parcelas;
    }


    /**
     * Sets the parcelas value for this Cod.
     * 
     * @param parcelas
     */
    public void setParcelas(org.apache.axis.types.NonNegativeInteger parcelas) {
        this.parcelas = parcelas;
    }


    /**
     * Gets the valor value for this Cod.
     * 
     * @return valor
     */
    public java.math.BigDecimal getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Cod.
     * 
     * @param valor
     */
    public void setValor(java.math.BigDecimal valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cod)) return false;
        Cod other = (Cod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formaPagto==null && other.getFormaPagto()==null) || 
             (this.formaPagto!=null &&
              this.formaPagto.equals(other.getFormaPagto()))) &&
            ((this.parcelas==null && other.getParcelas()==null) || 
             (this.parcelas!=null &&
              this.parcelas.equals(other.getParcelas()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getFormaPagto() != null) {
            _hashCode += getFormaPagto().hashCode();
        }
        if (getParcelas() != null) {
            _hashCode += getParcelas().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Cod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormaPagto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
