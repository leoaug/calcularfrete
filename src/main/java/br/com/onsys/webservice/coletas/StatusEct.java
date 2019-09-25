/**
 * StatusEct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class StatusEct  implements java.io.Serializable {
    private java.lang.String ectTipo;

    private java.lang.String ectStatus;

    private java.util.Date ectData;

    private org.apache.axis.types.Time ectHora;

    private java.lang.String ectDescricao;

    private java.lang.String ectComentario;

    private java.lang.String ectLocal;

    private java.lang.String ectCodigo;

    private java.lang.String ectCidade;

    private java.lang.String ectUf;

    public StatusEct() {
    }

    public StatusEct(
           java.lang.String ectTipo,
           java.lang.String ectStatus,
           java.util.Date ectData,
           org.apache.axis.types.Time ectHora,
           java.lang.String ectDescricao,
           java.lang.String ectComentario,
           java.lang.String ectLocal,
           java.lang.String ectCodigo,
           java.lang.String ectCidade,
           java.lang.String ectUf) {
           this.ectTipo = ectTipo;
           this.ectStatus = ectStatus;
           this.ectData = ectData;
           this.ectHora = ectHora;
           this.ectDescricao = ectDescricao;
           this.ectComentario = ectComentario;
           this.ectLocal = ectLocal;
           this.ectCodigo = ectCodigo;
           this.ectCidade = ectCidade;
           this.ectUf = ectUf;
    }


    /**
     * Gets the ectTipo value for this StatusEct.
     * 
     * @return ectTipo
     */
    public java.lang.String getEctTipo() {
        return ectTipo;
    }


    /**
     * Sets the ectTipo value for this StatusEct.
     * 
     * @param ectTipo
     */
    public void setEctTipo(java.lang.String ectTipo) {
        this.ectTipo = ectTipo;
    }


    /**
     * Gets the ectStatus value for this StatusEct.
     * 
     * @return ectStatus
     */
    public java.lang.String getEctStatus() {
        return ectStatus;
    }


    /**
     * Sets the ectStatus value for this StatusEct.
     * 
     * @param ectStatus
     */
    public void setEctStatus(java.lang.String ectStatus) {
        this.ectStatus = ectStatus;
    }


    /**
     * Gets the ectData value for this StatusEct.
     * 
     * @return ectData
     */
    public java.util.Date getEctData() {
        return ectData;
    }


    /**
     * Sets the ectData value for this StatusEct.
     * 
     * @param ectData
     */
    public void setEctData(java.util.Date ectData) {
        this.ectData = ectData;
    }


    /**
     * Gets the ectHora value for this StatusEct.
     * 
     * @return ectHora
     */
    public org.apache.axis.types.Time getEctHora() {
        return ectHora;
    }


    /**
     * Sets the ectHora value for this StatusEct.
     * 
     * @param ectHora
     */
    public void setEctHora(org.apache.axis.types.Time ectHora) {
        this.ectHora = ectHora;
    }


    /**
     * Gets the ectDescricao value for this StatusEct.
     * 
     * @return ectDescricao
     */
    public java.lang.String getEctDescricao() {
        return ectDescricao;
    }


    /**
     * Sets the ectDescricao value for this StatusEct.
     * 
     * @param ectDescricao
     */
    public void setEctDescricao(java.lang.String ectDescricao) {
        this.ectDescricao = ectDescricao;
    }


    /**
     * Gets the ectComentario value for this StatusEct.
     * 
     * @return ectComentario
     */
    public java.lang.String getEctComentario() {
        return ectComentario;
    }


    /**
     * Sets the ectComentario value for this StatusEct.
     * 
     * @param ectComentario
     */
    public void setEctComentario(java.lang.String ectComentario) {
        this.ectComentario = ectComentario;
    }


    /**
     * Gets the ectLocal value for this StatusEct.
     * 
     * @return ectLocal
     */
    public java.lang.String getEctLocal() {
        return ectLocal;
    }


    /**
     * Sets the ectLocal value for this StatusEct.
     * 
     * @param ectLocal
     */
    public void setEctLocal(java.lang.String ectLocal) {
        this.ectLocal = ectLocal;
    }


    /**
     * Gets the ectCodigo value for this StatusEct.
     * 
     * @return ectCodigo
     */
    public java.lang.String getEctCodigo() {
        return ectCodigo;
    }


    /**
     * Sets the ectCodigo value for this StatusEct.
     * 
     * @param ectCodigo
     */
    public void setEctCodigo(java.lang.String ectCodigo) {
        this.ectCodigo = ectCodigo;
    }


    /**
     * Gets the ectCidade value for this StatusEct.
     * 
     * @return ectCidade
     */
    public java.lang.String getEctCidade() {
        return ectCidade;
    }


    /**
     * Sets the ectCidade value for this StatusEct.
     * 
     * @param ectCidade
     */
    public void setEctCidade(java.lang.String ectCidade) {
        this.ectCidade = ectCidade;
    }


    /**
     * Gets the ectUf value for this StatusEct.
     * 
     * @return ectUf
     */
    public java.lang.String getEctUf() {
        return ectUf;
    }


    /**
     * Sets the ectUf value for this StatusEct.
     * 
     * @param ectUf
     */
    public void setEctUf(java.lang.String ectUf) {
        this.ectUf = ectUf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusEct)) return false;
        StatusEct other = (StatusEct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ectTipo==null && other.getEctTipo()==null) || 
             (this.ectTipo!=null &&
              this.ectTipo.equals(other.getEctTipo()))) &&
            ((this.ectStatus==null && other.getEctStatus()==null) || 
             (this.ectStatus!=null &&
              this.ectStatus.equals(other.getEctStatus()))) &&
            ((this.ectData==null && other.getEctData()==null) || 
             (this.ectData!=null &&
              this.ectData.equals(other.getEctData()))) &&
            ((this.ectHora==null && other.getEctHora()==null) || 
             (this.ectHora!=null &&
              this.ectHora.equals(other.getEctHora()))) &&
            ((this.ectDescricao==null && other.getEctDescricao()==null) || 
             (this.ectDescricao!=null &&
              this.ectDescricao.equals(other.getEctDescricao()))) &&
            ((this.ectComentario==null && other.getEctComentario()==null) || 
             (this.ectComentario!=null &&
              this.ectComentario.equals(other.getEctComentario()))) &&
            ((this.ectLocal==null && other.getEctLocal()==null) || 
             (this.ectLocal!=null &&
              this.ectLocal.equals(other.getEctLocal()))) &&
            ((this.ectCodigo==null && other.getEctCodigo()==null) || 
             (this.ectCodigo!=null &&
              this.ectCodigo.equals(other.getEctCodigo()))) &&
            ((this.ectCidade==null && other.getEctCidade()==null) || 
             (this.ectCidade!=null &&
              this.ectCidade.equals(other.getEctCidade()))) &&
            ((this.ectUf==null && other.getEctUf()==null) || 
             (this.ectUf!=null &&
              this.ectUf.equals(other.getEctUf())));
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
        if (getEctTipo() != null) {
            _hashCode += getEctTipo().hashCode();
        }
        if (getEctStatus() != null) {
            _hashCode += getEctStatus().hashCode();
        }
        if (getEctData() != null) {
            _hashCode += getEctData().hashCode();
        }
        if (getEctHora() != null) {
            _hashCode += getEctHora().hashCode();
        }
        if (getEctDescricao() != null) {
            _hashCode += getEctDescricao().hashCode();
        }
        if (getEctComentario() != null) {
            _hashCode += getEctComentario().hashCode();
        }
        if (getEctLocal() != null) {
            _hashCode += getEctLocal().hashCode();
        }
        if (getEctCodigo() != null) {
            _hashCode += getEctCodigo().hashCode();
        }
        if (getEctCidade() != null) {
            _hashCode += getEctCidade().hashCode();
        }
        if (getEctUf() != null) {
            _hashCode += getEctUf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusEct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusEct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectDescricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctDescricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectComentario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctComentario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectCodigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctCodigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ectUf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EctUf"));
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
