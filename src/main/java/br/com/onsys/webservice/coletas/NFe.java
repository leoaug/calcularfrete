/**
 * NFe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;
 
public class NFe  implements java.io.Serializable {
   
	
	private static final long serialVersionUID = 1L;

	private Integer nfeNumero;

    private Integer nfeSerie;

    private java.util.Date nfeData;

    private java.math.BigDecimal nfeValTotal;

    private java.math.BigDecimal nfeValProd;

    private Integer nfeCfop;

    private java.lang.String nfeChave;

    public NFe() {
    }

    public NFe(
    	   Integer nfeNumero,
    	   Integer nfeSerie,
           java.util.Date nfeData,
           java.math.BigDecimal nfeValTotal,
           java.math.BigDecimal nfeValProd,
           Integer nfeCfop,
           java.lang.String nfeChave) {
           this.nfeNumero = nfeNumero;
           this.nfeSerie = nfeSerie;
           this.nfeData = nfeData;
           this.nfeValTotal = nfeValTotal;
           this.nfeValProd = nfeValProd;
           this.nfeCfop = nfeCfop;
           this.nfeChave = nfeChave;
    }


    /**
     * Gets the nfeNumero value for this NFe.
     * 
     * @return nfeNumero
     */
    public Integer getNfeNumero() {
        return nfeNumero;
    }


    /**
     * Sets the nfeNumero value for this NFe.
     * 
     * @param nfeNumero
     */
    public void setNfeNumero(Integer nfeNumero) {
        this.nfeNumero = nfeNumero;
    }


    /**
     * Gets the nfeSerie value for this NFe.
     * 
     * @return nfeSerie
     */
    public Integer getNfeSerie() {
        return nfeSerie;
    }


    /**
     * Sets the nfeSerie value for this NFe.
     * 
     * @param nfeSerie
     */
    public void setNfeSerie(Integer nfeSerie) {
        this.nfeSerie = nfeSerie;
    }


    /**
     * Gets the nfeData value for this NFe.
     * 
     * @return nfeData
     */
    public java.util.Date getNfeData() {
        return nfeData;
    }


    /**
     * Sets the nfeData value for this NFe.
     * 
     * @param nfeData
     */
    public void setNfeData(java.util.Date nfeData) {
        this.nfeData = nfeData;
    }


    /**
     * Gets the nfeValTotal value for this NFe.
     * 
     * @return nfeValTotal
     */
    public java.math.BigDecimal getNfeValTotal() {
        return nfeValTotal;
    }


    /**
     * Sets the nfeValTotal value for this NFe.
     * 
     * @param nfeValTotal
     */
    public void setNfeValTotal(java.math.BigDecimal nfeValTotal) {
        this.nfeValTotal = nfeValTotal;
    }


    /**
     * Gets the nfeValProd value for this NFe.
     * 
     * @return nfeValProd
     */
    public java.math.BigDecimal getNfeValProd() {
        return nfeValProd;
    }


    /**
     * Sets the nfeValProd value for this NFe.
     * 
     * @param nfeValProd
     */
    public void setNfeValProd(java.math.BigDecimal nfeValProd) {
        this.nfeValProd = nfeValProd;
    }


    /**
     * Gets the nfeCfop value for this NFe.
     * 
     * @return nfeCfop
     */
    public Integer getNfeCfop() {
        return nfeCfop;
    }


    /**
     * Sets the nfeCfop value for this NFe.
     * 
     * @param nfeCfop
     */
    public void setNfeCfop(Integer nfeCfop) {
        this.nfeCfop = nfeCfop;
    }


    /**
     * Gets the nfeChave value for this NFe.
     * 
     * @return nfeChave
     */
    public java.lang.String getNfeChave() {
        return nfeChave;
    }


    /**
     * Sets the nfeChave value for this NFe.
     * 
     * @param nfeChave
     */
    public void setNfeChave(java.lang.String nfeChave) {
        this.nfeChave = nfeChave;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NFe)) return false;
        NFe other = (NFe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfeNumero==null && other.getNfeNumero()==null) || 
             (this.nfeNumero!=null &&
              this.nfeNumero.equals(other.getNfeNumero()))) &&
            ((this.nfeSerie==null && other.getNfeSerie()==null) || 
             (this.nfeSerie!=null &&
              this.nfeSerie.equals(other.getNfeSerie()))) &&
            ((this.nfeData==null && other.getNfeData()==null) || 
             (this.nfeData!=null &&
              this.nfeData.equals(other.getNfeData()))) &&
            ((this.nfeValTotal==null && other.getNfeValTotal()==null) || 
             (this.nfeValTotal!=null &&
              this.nfeValTotal.equals(other.getNfeValTotal()))) &&
            ((this.nfeValProd==null && other.getNfeValProd()==null) || 
             (this.nfeValProd!=null &&
              this.nfeValProd.equals(other.getNfeValProd()))) &&
            ((this.nfeCfop==null && other.getNfeCfop()==null) || 
             (this.nfeCfop!=null &&
              this.nfeCfop.equals(other.getNfeCfop()))) &&
            ((this.nfeChave==null && other.getNfeChave()==null) || 
             (this.nfeChave!=null &&
              this.nfeChave.equals(other.getNfeChave())));
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
        if (getNfeNumero() != null) {
            _hashCode += getNfeNumero().hashCode();
        }
        if (getNfeSerie() != null) {
            _hashCode += getNfeSerie().hashCode();
        }
        if (getNfeData() != null) {
            _hashCode += getNfeData().hashCode();
        }
        if (getNfeValTotal() != null) {
            _hashCode += getNfeValTotal().hashCode();
        }
        if (getNfeValProd() != null) {
            _hashCode += getNfeValProd().hashCode();
        }
        if (getNfeCfop() != null) {
            _hashCode += getNfeCfop().hashCode();
        }
        if (getNfeChave() != null) {
            _hashCode += getNfeChave().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NFe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NFe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeValTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeValTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeValProd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeValProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeCfop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeCfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfeChave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NfeChave"));
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
