/**
 * StatusTotal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;
 
public class StatusTotal  implements java.io.Serializable {
    private Integer codStatus;

    private java.lang.String descStatus;

    private java.util.Calendar dataStatus;

    public StatusTotal() {
    }

    public StatusTotal(
           Integer codStatus,
           java.lang.String descStatus,
           java.util.Calendar dataStatus) {
           this.codStatus = codStatus;
           this.descStatus = descStatus;
           this.dataStatus = dataStatus;
    }


    /**
     * Gets the codStatus value for this StatusTotal.
     * 
     * @return codStatus
     */
    public Integer getCodStatus() {
        return codStatus;
    }


    /**
     * Sets the codStatus value for this StatusTotal.
     * 
     * @param codStatus
     */
    public void setCodStatus(Integer codStatus) {
        this.codStatus = codStatus;
    }


    /**
     * Gets the descStatus value for this StatusTotal.
     * 
     * @return descStatus
     */
    public java.lang.String getDescStatus() {
        return descStatus;
    }


    /**
     * Sets the descStatus value for this StatusTotal.
     * 
     * @param descStatus
     */
    public void setDescStatus(java.lang.String descStatus) {
        this.descStatus = descStatus;
    }


    /**
     * Gets the dataStatus value for this StatusTotal.
     * 
     * @return dataStatus
     */
    public java.util.Calendar getDataStatus() {
        return dataStatus;
    }


    /**
     * Sets the dataStatus value for this StatusTotal.
     * 
     * @param dataStatus
     */
    public void setDataStatus(java.util.Calendar dataStatus) {
        this.dataStatus = dataStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusTotal)) return false;
        StatusTotal other = (StatusTotal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codStatus==null && other.getCodStatus()==null) || 
             (this.codStatus!=null &&
              this.codStatus.equals(other.getCodStatus()))) &&
            ((this.descStatus==null && other.getDescStatus()==null) || 
             (this.descStatus!=null &&
              this.descStatus.equals(other.getDescStatus()))) &&
            ((this.dataStatus==null && other.getDataStatus()==null) || 
             (this.dataStatus!=null &&
              this.dataStatus.equals(other.getDataStatus())));
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
        if (getCodStatus() != null) {
            _hashCode += getCodStatus().hashCode();
        }
        if (getDescStatus() != null) {
            _hashCode += getDescStatus().hashCode();
        }
        if (getDataStatus() != null) {
            _hashCode += getDataStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusTotal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusTotal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
