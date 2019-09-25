/**
 * NF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class NF  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger nfNumero;

    private org.apache.axis.types.NonNegativeInteger nfSerie;

    private java.util.Date nfData;

    private java.math.BigDecimal nfValTotal;

    private java.math.BigDecimal nfValBc;

    private java.math.BigDecimal nfValIcms;

    private java.math.BigDecimal nfValBcSt;

    private java.math.BigDecimal nfValIcmsSt;

    private java.math.BigDecimal nfValProd;

    private org.apache.axis.types.NonNegativeInteger nfCfop;

    public NF() {
    }

    public NF(
           org.apache.axis.types.NonNegativeInteger nfNumero,
           org.apache.axis.types.NonNegativeInteger nfSerie,
           java.util.Date nfData,
           java.math.BigDecimal nfValTotal,
           java.math.BigDecimal nfValBc,
           java.math.BigDecimal nfValIcms,
           java.math.BigDecimal nfValBcSt,
           java.math.BigDecimal nfValIcmsSt,
           java.math.BigDecimal nfValProd,
           org.apache.axis.types.NonNegativeInteger nfCfop) {
           this.nfNumero = nfNumero;
           this.nfSerie = nfSerie;
           this.nfData = nfData;
           this.nfValTotal = nfValTotal;
           this.nfValBc = nfValBc;
           this.nfValIcms = nfValIcms;
           this.nfValBcSt = nfValBcSt;
           this.nfValIcmsSt = nfValIcmsSt;
           this.nfValProd = nfValProd;
           this.nfCfop = nfCfop;
    }


    /**
     * Gets the nfNumero value for this NF.
     * 
     * @return nfNumero
     */
    public org.apache.axis.types.NonNegativeInteger getNfNumero() {
        return nfNumero;
    }


    /**
     * Sets the nfNumero value for this NF.
     * 
     * @param nfNumero
     */
    public void setNfNumero(org.apache.axis.types.NonNegativeInteger nfNumero) {
        this.nfNumero = nfNumero;
    }


    /**
     * Gets the nfSerie value for this NF.
     * 
     * @return nfSerie
     */
    public org.apache.axis.types.NonNegativeInteger getNfSerie() {
        return nfSerie;
    }


    /**
     * Sets the nfSerie value for this NF.
     * 
     * @param nfSerie
     */
    public void setNfSerie(org.apache.axis.types.NonNegativeInteger nfSerie) {
        this.nfSerie = nfSerie;
    }


    /**
     * Gets the nfData value for this NF.
     * 
     * @return nfData
     */
    public java.util.Date getNfData() {
        return nfData;
    }


    /**
     * Sets the nfData value for this NF.
     * 
     * @param nfData
     */
    public void setNfData(java.util.Date nfData) {
        this.nfData = nfData;
    }


    /**
     * Gets the nfValTotal value for this NF.
     * 
     * @return nfValTotal
     */
    public java.math.BigDecimal getNfValTotal() {
        return nfValTotal;
    }


    /**
     * Sets the nfValTotal value for this NF.
     * 
     * @param nfValTotal
     */
    public void setNfValTotal(java.math.BigDecimal nfValTotal) {
        this.nfValTotal = nfValTotal;
    }


    /**
     * Gets the nfValBc value for this NF.
     * 
     * @return nfValBc
     */
    public java.math.BigDecimal getNfValBc() {
        return nfValBc;
    }


    /**
     * Sets the nfValBc value for this NF.
     * 
     * @param nfValBc
     */
    public void setNfValBc(java.math.BigDecimal nfValBc) {
        this.nfValBc = nfValBc;
    }


    /**
     * Gets the nfValIcms value for this NF.
     * 
     * @return nfValIcms
     */
    public java.math.BigDecimal getNfValIcms() {
        return nfValIcms;
    }


    /**
     * Sets the nfValIcms value for this NF.
     * 
     * @param nfValIcms
     */
    public void setNfValIcms(java.math.BigDecimal nfValIcms) {
        this.nfValIcms = nfValIcms;
    }


    /**
     * Gets the nfValBcSt value for this NF.
     * 
     * @return nfValBcSt
     */
    public java.math.BigDecimal getNfValBcSt() {
        return nfValBcSt;
    }


    /**
     * Sets the nfValBcSt value for this NF.
     * 
     * @param nfValBcSt
     */
    public void setNfValBcSt(java.math.BigDecimal nfValBcSt) {
        this.nfValBcSt = nfValBcSt;
    }


    /**
     * Gets the nfValIcmsSt value for this NF.
     * 
     * @return nfValIcmsSt
     */
    public java.math.BigDecimal getNfValIcmsSt() {
        return nfValIcmsSt;
    }


    /**
     * Sets the nfValIcmsSt value for this NF.
     * 
     * @param nfValIcmsSt
     */
    public void setNfValIcmsSt(java.math.BigDecimal nfValIcmsSt) {
        this.nfValIcmsSt = nfValIcmsSt;
    }


    /**
     * Gets the nfValProd value for this NF.
     * 
     * @return nfValProd
     */
    public java.math.BigDecimal getNfValProd() {
        return nfValProd;
    }


    /**
     * Sets the nfValProd value for this NF.
     * 
     * @param nfValProd
     */
    public void setNfValProd(java.math.BigDecimal nfValProd) {
        this.nfValProd = nfValProd;
    }


    /**
     * Gets the nfCfop value for this NF.
     * 
     * @return nfCfop
     */
    public org.apache.axis.types.NonNegativeInteger getNfCfop() {
        return nfCfop;
    }


    /**
     * Sets the nfCfop value for this NF.
     * 
     * @param nfCfop
     */
    public void setNfCfop(org.apache.axis.types.NonNegativeInteger nfCfop) {
        this.nfCfop = nfCfop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NF)) return false;
        NF other = (NF) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfNumero==null && other.getNfNumero()==null) || 
             (this.nfNumero!=null &&
              this.nfNumero.equals(other.getNfNumero()))) &&
            ((this.nfSerie==null && other.getNfSerie()==null) || 
             (this.nfSerie!=null &&
              this.nfSerie.equals(other.getNfSerie()))) &&
            ((this.nfData==null && other.getNfData()==null) || 
             (this.nfData!=null &&
              this.nfData.equals(other.getNfData()))) &&
            ((this.nfValTotal==null && other.getNfValTotal()==null) || 
             (this.nfValTotal!=null &&
              this.nfValTotal.equals(other.getNfValTotal()))) &&
            ((this.nfValBc==null && other.getNfValBc()==null) || 
             (this.nfValBc!=null &&
              this.nfValBc.equals(other.getNfValBc()))) &&
            ((this.nfValIcms==null && other.getNfValIcms()==null) || 
             (this.nfValIcms!=null &&
              this.nfValIcms.equals(other.getNfValIcms()))) &&
            ((this.nfValBcSt==null && other.getNfValBcSt()==null) || 
             (this.nfValBcSt!=null &&
              this.nfValBcSt.equals(other.getNfValBcSt()))) &&
            ((this.nfValIcmsSt==null && other.getNfValIcmsSt()==null) || 
             (this.nfValIcmsSt!=null &&
              this.nfValIcmsSt.equals(other.getNfValIcmsSt()))) &&
            ((this.nfValProd==null && other.getNfValProd()==null) || 
             (this.nfValProd!=null &&
              this.nfValProd.equals(other.getNfValProd()))) &&
            ((this.nfCfop==null && other.getNfCfop()==null) || 
             (this.nfCfop!=null &&
              this.nfCfop.equals(other.getNfCfop())));
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
        if (getNfNumero() != null) {
            _hashCode += getNfNumero().hashCode();
        }
        if (getNfSerie() != null) {
            _hashCode += getNfSerie().hashCode();
        }
        if (getNfData() != null) {
            _hashCode += getNfData().hashCode();
        }
        if (getNfValTotal() != null) {
            _hashCode += getNfValTotal().hashCode();
        }
        if (getNfValBc() != null) {
            _hashCode += getNfValBc().hashCode();
        }
        if (getNfValIcms() != null) {
            _hashCode += getNfValIcms().hashCode();
        }
        if (getNfValBcSt() != null) {
            _hashCode += getNfValBcSt().hashCode();
        }
        if (getNfValIcmsSt() != null) {
            _hashCode += getNfValIcmsSt().hashCode();
        }
        if (getNfValProd() != null) {
            _hashCode += getNfValProd().hashCode();
        }
        if (getNfCfop() != null) {
            _hashCode += getNfCfop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValBc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValBc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValBcSt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValBcSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfValProd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfValProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfCfop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfCfop"));
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
