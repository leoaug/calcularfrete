/**
 * LoteRetorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class LoteRetorno  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codRetorno;

    private java.util.Date dataGeracao;

    private br.com.onsys.webservice.coletas.EncomendaRetorno[] arrayEncomendaRetorno;

    public LoteRetorno() {
    }

    public LoteRetorno(
           org.apache.axis.types.NonNegativeInteger codRetorno,
           java.util.Date dataGeracao,
           br.com.onsys.webservice.coletas.EncomendaRetorno[] arrayEncomendaRetorno) {
           this.codRetorno = codRetorno;
           this.dataGeracao = dataGeracao;
           this.arrayEncomendaRetorno = arrayEncomendaRetorno;
    }


    /**
     * Gets the codRetorno value for this LoteRetorno.
     * 
     * @return codRetorno
     */
    public org.apache.axis.types.NonNegativeInteger getCodRetorno() {
        return codRetorno;
    }


    /**
     * Sets the codRetorno value for this LoteRetorno.
     * 
     * @param codRetorno
     */
    public void setCodRetorno(org.apache.axis.types.NonNegativeInteger codRetorno) {
        this.codRetorno = codRetorno;
    }


    /**
     * Gets the dataGeracao value for this LoteRetorno.
     * 
     * @return dataGeracao
     */
    public java.util.Date getDataGeracao() {
        return dataGeracao;
    }


    /**
     * Sets the dataGeracao value for this LoteRetorno.
     * 
     * @param dataGeracao
     */
    public void setDataGeracao(java.util.Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }


    /**
     * Gets the arrayEncomendaRetorno value for this LoteRetorno.
     * 
     * @return arrayEncomendaRetorno
     */
    public br.com.onsys.webservice.coletas.EncomendaRetorno[] getArrayEncomendaRetorno() {
        return arrayEncomendaRetorno;
    }


    /**
     * Sets the arrayEncomendaRetorno value for this LoteRetorno.
     * 
     * @param arrayEncomendaRetorno
     */
    public void setArrayEncomendaRetorno(br.com.onsys.webservice.coletas.EncomendaRetorno[] arrayEncomendaRetorno) {
        this.arrayEncomendaRetorno = arrayEncomendaRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoteRetorno)) return false;
        LoteRetorno other = (LoteRetorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codRetorno==null && other.getCodRetorno()==null) || 
             (this.codRetorno!=null &&
              this.codRetorno.equals(other.getCodRetorno()))) &&
            ((this.dataGeracao==null && other.getDataGeracao()==null) || 
             (this.dataGeracao!=null &&
              this.dataGeracao.equals(other.getDataGeracao()))) &&
            ((this.arrayEncomendaRetorno==null && other.getArrayEncomendaRetorno()==null) || 
             (this.arrayEncomendaRetorno!=null &&
              java.util.Arrays.equals(this.arrayEncomendaRetorno, other.getArrayEncomendaRetorno())));
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
        if (getCodRetorno() != null) {
            _hashCode += getCodRetorno().hashCode();
        }
        if (getDataGeracao() != null) {
            _hashCode += getDataGeracao().hashCode();
        }
        if (getArrayEncomendaRetorno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayEncomendaRetorno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayEncomendaRetorno(), i);
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
        new org.apache.axis.description.TypeDesc(LoteRetorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "LoteRetorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataGeracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataGeracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayEncomendaRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrayEncomendaRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "EncomendaRetorno"));
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
