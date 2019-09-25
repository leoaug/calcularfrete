/**
 * CalcularFreteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice;

public class CalcularFreteResponse  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codigoProc;

    private br.com.onsys.webservice.DadosFrete dadosFrete;

    private java.lang.String erroConsultaFrete;

    public CalcularFreteResponse() {
    }

    public CalcularFreteResponse(
           org.apache.axis.types.NonNegativeInteger codigoProc,
           br.com.onsys.webservice.DadosFrete dadosFrete,
           java.lang.String erroConsultaFrete) {
           this.codigoProc = codigoProc;
           this.dadosFrete = dadosFrete;
           this.erroConsultaFrete = erroConsultaFrete;
    }


    /**
     * Gets the codigoProc value for this CalcularFreteResponse.
     * 
     * @return codigoProc
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoProc() {
        return codigoProc;
    }


    /**
     * Sets the codigoProc value for this CalcularFreteResponse.
     * 
     * @param codigoProc
     */
    public void setCodigoProc(org.apache.axis.types.NonNegativeInteger codigoProc) {
        this.codigoProc = codigoProc;
    }


    /**
     * Gets the dadosFrete value for this CalcularFreteResponse.
     * 
     * @return dadosFrete
     */
    public br.com.onsys.webservice.DadosFrete getDadosFrete() {
        return dadosFrete;
    }


    /**
     * Sets the dadosFrete value for this CalcularFreteResponse.
     * 
     * @param dadosFrete
     */
    public void setDadosFrete(br.com.onsys.webservice.DadosFrete dadosFrete) {
        this.dadosFrete = dadosFrete;
    }


    /**
     * Gets the erroConsultaFrete value for this CalcularFreteResponse.
     * 
     * @return erroConsultaFrete
     */
    public java.lang.String getErroConsultaFrete() {
        return erroConsultaFrete;
    }


    /**
     * Sets the erroConsultaFrete value for this CalcularFreteResponse.
     * 
     * @param erroConsultaFrete
     */
    public void setErroConsultaFrete(java.lang.String erroConsultaFrete) {
        this.erroConsultaFrete = erroConsultaFrete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalcularFreteResponse)) return false;
        CalcularFreteResponse other = (CalcularFreteResponse) obj;
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
            ((this.dadosFrete==null && other.getDadosFrete()==null) || 
             (this.dadosFrete!=null &&
              this.dadosFrete.equals(other.getDadosFrete()))) &&
            ((this.erroConsultaFrete==null && other.getErroConsultaFrete()==null) || 
             (this.erroConsultaFrete!=null &&
              this.erroConsultaFrete.equals(other.getErroConsultaFrete())));
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
        if (getDadosFrete() != null) {
            _hashCode += getDadosFrete().hashCode();
        }
        if (getErroConsultaFrete() != null) {
            _hashCode += getErroConsultaFrete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalcularFreteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "calcularFreteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DadosFrete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "DadosFrete"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erroConsultaFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErroConsultaFrete"));
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
