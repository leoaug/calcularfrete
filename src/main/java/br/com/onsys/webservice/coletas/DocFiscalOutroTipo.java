/**
 * DocFiscalOutroTipo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class DocFiscalOutroTipo  implements java.io.Serializable {
    private java.lang.String nfoTipo;

    private java.lang.String nfoDescricao;

    private org.apache.axis.types.NonNegativeInteger nfoNumero;

    private java.util.Date nfoData;

    private java.math.BigDecimal nfoValTotal;

    private java.math.BigDecimal nfoValProd;

    private org.apache.axis.types.NonNegativeInteger nfoCfop;

    public DocFiscalOutroTipo() {
    }

    public DocFiscalOutroTipo(
           java.lang.String nfoTipo,
           java.lang.String nfoDescricao,
           org.apache.axis.types.NonNegativeInteger nfoNumero,
           java.util.Date nfoData,
           java.math.BigDecimal nfoValTotal,
           java.math.BigDecimal nfoValProd,
           org.apache.axis.types.NonNegativeInteger nfoCfop) {
           this.nfoTipo = nfoTipo;
           this.nfoDescricao = nfoDescricao;
           this.nfoNumero = nfoNumero;
           this.nfoData = nfoData;
           this.nfoValTotal = nfoValTotal;
           this.nfoValProd = nfoValProd;
           this.nfoCfop = nfoCfop;
    }


    /**
     * Gets the nfoTipo value for this DocFiscalOutroTipo.
     * 
     * @return nfoTipo
     */
    public java.lang.String getNfoTipo() {
        return nfoTipo;
    }


    /**
     * Sets the nfoTipo value for this DocFiscalOutroTipo.
     * 
     * @param nfoTipo
     */
    public void setNfoTipo(java.lang.String nfoTipo) {
        this.nfoTipo = nfoTipo;
    }


    /**
     * Gets the nfoDescricao value for this DocFiscalOutroTipo.
     * 
     * @return nfoDescricao
     */
    public java.lang.String getNfoDescricao() {
        return nfoDescricao;
    }


    /**
     * Sets the nfoDescricao value for this DocFiscalOutroTipo.
     * 
     * @param nfoDescricao
     */
    public void setNfoDescricao(java.lang.String nfoDescricao) {
        this.nfoDescricao = nfoDescricao;
    }


    /**
     * Gets the nfoNumero value for this DocFiscalOutroTipo.
     * 
     * @return nfoNumero
     */
    public org.apache.axis.types.NonNegativeInteger getNfoNumero() {
        return nfoNumero;
    }


    /**
     * Sets the nfoNumero value for this DocFiscalOutroTipo.
     * 
     * @param nfoNumero
     */
    public void setNfoNumero(org.apache.axis.types.NonNegativeInteger nfoNumero) {
        this.nfoNumero = nfoNumero;
    }


    /**
     * Gets the nfoData value for this DocFiscalOutroTipo.
     * 
     * @return nfoData
     */
    public java.util.Date getNfoData() {
        return nfoData;
    }


    /**
     * Sets the nfoData value for this DocFiscalOutroTipo.
     * 
     * @param nfoData
     */
    public void setNfoData(java.util.Date nfoData) {
        this.nfoData = nfoData;
    }


    /**
     * Gets the nfoValTotal value for this DocFiscalOutroTipo.
     * 
     * @return nfoValTotal
     */
    public java.math.BigDecimal getNfoValTotal() {
        return nfoValTotal;
    }


    /**
     * Sets the nfoValTotal value for this DocFiscalOutroTipo.
     * 
     * @param nfoValTotal
     */
    public void setNfoValTotal(java.math.BigDecimal nfoValTotal) {
        this.nfoValTotal = nfoValTotal;
    }


    /**
     * Gets the nfoValProd value for this DocFiscalOutroTipo.
     * 
     * @return nfoValProd
     */
    public java.math.BigDecimal getNfoValProd() {
        return nfoValProd;
    }


    /**
     * Sets the nfoValProd value for this DocFiscalOutroTipo.
     * 
     * @param nfoValProd
     */
    public void setNfoValProd(java.math.BigDecimal nfoValProd) {
        this.nfoValProd = nfoValProd;
    }


    /**
     * Gets the nfoCfop value for this DocFiscalOutroTipo.
     * 
     * @return nfoCfop
     */
    public org.apache.axis.types.NonNegativeInteger getNfoCfop() {
        return nfoCfop;
    }


    /**
     * Sets the nfoCfop value for this DocFiscalOutroTipo.
     * 
     * @param nfoCfop
     */
    public void setNfoCfop(org.apache.axis.types.NonNegativeInteger nfoCfop) {
        this.nfoCfop = nfoCfop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocFiscalOutroTipo)) return false;
        DocFiscalOutroTipo other = (DocFiscalOutroTipo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfoTipo==null && other.getNfoTipo()==null) || 
             (this.nfoTipo!=null &&
              this.nfoTipo.equals(other.getNfoTipo()))) &&
            ((this.nfoDescricao==null && other.getNfoDescricao()==null) || 
             (this.nfoDescricao!=null &&
              this.nfoDescricao.equals(other.getNfoDescricao()))) &&
            ((this.nfoNumero==null && other.getNfoNumero()==null) || 
             (this.nfoNumero!=null &&
              this.nfoNumero.equals(other.getNfoNumero()))) &&
            ((this.nfoData==null && other.getNfoData()==null) || 
             (this.nfoData!=null &&
              this.nfoData.equals(other.getNfoData()))) &&
            ((this.nfoValTotal==null && other.getNfoValTotal()==null) || 
             (this.nfoValTotal!=null &&
              this.nfoValTotal.equals(other.getNfoValTotal()))) &&
            ((this.nfoValProd==null && other.getNfoValProd()==null) || 
             (this.nfoValProd!=null &&
              this.nfoValProd.equals(other.getNfoValProd()))) &&
            ((this.nfoCfop==null && other.getNfoCfop()==null) || 
             (this.nfoCfop!=null &&
              this.nfoCfop.equals(other.getNfoCfop())));
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
        if (getNfoTipo() != null) {
            _hashCode += getNfoTipo().hashCode();
        }
        if (getNfoDescricao() != null) {
            _hashCode += getNfoDescricao().hashCode();
        }
        if (getNfoNumero() != null) {
            _hashCode += getNfoNumero().hashCode();
        }
        if (getNfoData() != null) {
            _hashCode += getNfoData().hashCode();
        }
        if (getNfoValTotal() != null) {
            _hashCode += getNfoValTotal().hashCode();
        }
        if (getNfoValProd() != null) {
            _hashCode += getNfoValProd().hashCode();
        }
        if (getNfoCfop() != null) {
            _hashCode += getNfoCfop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocFiscalOutroTipo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalOutroTipo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoDescricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoDescricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoValTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoValTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoValProd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoValProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfoCfop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfoCfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
