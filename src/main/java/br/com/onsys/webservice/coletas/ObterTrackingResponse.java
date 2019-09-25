/**
 * ObterTrackingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class ObterTrackingResponse  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codigoProc;

    private br.com.onsys.webservice.coletas.LoteRetorno[] arrayLoteRetorno;

    public ObterTrackingResponse() {
    }

    public ObterTrackingResponse(
           org.apache.axis.types.NonNegativeInteger codigoProc,
           br.com.onsys.webservice.coletas.LoteRetorno[] arrayLoteRetorno) {
           this.codigoProc = codigoProc;
           this.arrayLoteRetorno = arrayLoteRetorno;
    }


    /**
     * Gets the codigoProc value for this ObterTrackingResponse.
     * 
     * @return codigoProc
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoProc() {
        return codigoProc;
    }


    /**
     * Sets the codigoProc value for this ObterTrackingResponse.
     * 
     * @param codigoProc
     */
    public void setCodigoProc(org.apache.axis.types.NonNegativeInteger codigoProc) {
        this.codigoProc = codigoProc;
    }


    /**
     * Gets the arrayLoteRetorno value for this ObterTrackingResponse.
     * 
     * @return arrayLoteRetorno
     */
    public br.com.onsys.webservice.coletas.LoteRetorno[] getArrayLoteRetorno() {
        return arrayLoteRetorno;
    }


    /**
     * Sets the arrayLoteRetorno value for this ObterTrackingResponse.
     * 
     * @param arrayLoteRetorno
     */
    public void setArrayLoteRetorno(br.com.onsys.webservice.coletas.LoteRetorno[] arrayLoteRetorno) {
        this.arrayLoteRetorno = arrayLoteRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterTrackingResponse)) return false;
        ObterTrackingResponse other = (ObterTrackingResponse) obj;
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
            ((this.arrayLoteRetorno==null && other.getArrayLoteRetorno()==null) || 
             (this.arrayLoteRetorno!=null &&
              java.util.Arrays.equals(this.arrayLoteRetorno, other.getArrayLoteRetorno())));
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
        if (getArrayLoteRetorno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayLoteRetorno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayLoteRetorno(), i);
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
        new org.apache.axis.description.TypeDesc(ObterTrackingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "ObterTrackingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayLoteRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrayLoteRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "LoteRetorno"));
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
