/**
 * CalcularFreteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice;

public class CalcularFreteRequest  implements java.io.Serializable {
    
	private static final long serialVersionUID = 1L;

	private java.lang.String tipoServico;

    private org.apache.axis.types.NonNegativeInteger cepDestino;

    private java.lang.String peso;

    private java.lang.String valorDeclarado;

    private org.apache.axis.types.NonNegativeInteger tipoEntrega;

    private java.lang.Boolean servicoCOD;

    private org.apache.axis.types.NonNegativeInteger altura;

    private org.apache.axis.types.NonNegativeInteger largura;

    private org.apache.axis.types.NonNegativeInteger profundidade;

    public CalcularFreteRequest() {
    }

    public CalcularFreteRequest(
           java.lang.String tipoServico,
           org.apache.axis.types.NonNegativeInteger cepDestino,
           java.lang.String peso,
           java.lang.String valorDeclarado,
           org.apache.axis.types.NonNegativeInteger tipoEntrega,
           java.lang.Boolean servicoCOD,
           org.apache.axis.types.NonNegativeInteger altura,
           org.apache.axis.types.NonNegativeInteger largura,
           org.apache.axis.types.NonNegativeInteger profundidade) {
           this.tipoServico = tipoServico;
           this.cepDestino = cepDestino;
           this.peso = peso;
           this.valorDeclarado = valorDeclarado;
           this.tipoEntrega = tipoEntrega;
           this.servicoCOD = servicoCOD;
           this.altura = altura;
           this.largura = largura;
           this.profundidade = profundidade;
    }


    /**
     * Gets the tipoServico value for this CalcularFreteRequest.
     * 
     * @return tipoServico
     */
    public java.lang.String getTipoServico() {
        return tipoServico;
    }


    /**
     * Sets the tipoServico value for this CalcularFreteRequest.
     * 
     * @param tipoServico
     */
    public void setTipoServico(java.lang.String tipoServico) {
        this.tipoServico = tipoServico;
    }


    /**
     * Gets the cepDestino value for this CalcularFreteRequest.
     * 
     * @return cepDestino
     */
    public org.apache.axis.types.NonNegativeInteger getCepDestino() {
        return cepDestino;
    }


    /**
     * Sets the cepDestino value for this CalcularFreteRequest.
     * 
     * @param cepDestino
     */
    public void setCepDestino(org.apache.axis.types.NonNegativeInteger cepDestino) {
        this.cepDestino = cepDestino;
    }


    /**
     * Gets the peso value for this CalcularFreteRequest.
     * 
     * @return peso
     */
    public java.lang.String getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this CalcularFreteRequest.
     * 
     * @param peso
     */
    public void setPeso(java.lang.String peso) {
        this.peso = peso;
    }


    /**
     * Gets the valorDeclarado value for this CalcularFreteRequest.
     * 
     * @return valorDeclarado
     */
    public java.lang.String getValorDeclarado() {
        return valorDeclarado;
    }


    /**
     * Sets the valorDeclarado value for this CalcularFreteRequest.
     * 
     * @param valorDeclarado
     */
    public void setValorDeclarado(java.lang.String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }


    /**
     * Gets the tipoEntrega value for this CalcularFreteRequest.
     * 
     * @return tipoEntrega
     */
    public org.apache.axis.types.NonNegativeInteger getTipoEntrega() {
        return tipoEntrega;
    }


    /**
     * Sets the tipoEntrega value for this CalcularFreteRequest.
     * 
     * @param tipoEntrega
     */
    public void setTipoEntrega(org.apache.axis.types.NonNegativeInteger tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }


    /**
     * Gets the servicoCOD value for this CalcularFreteRequest.
     * 
     * @return servicoCOD
     */
    public java.lang.Boolean getServicoCOD() {
        return servicoCOD;
    }


    /**
     * Sets the servicoCOD value for this CalcularFreteRequest.
     * 
     * @param servicoCOD
     */
    public void setServicoCOD(java.lang.Boolean servicoCOD) {
        this.servicoCOD = servicoCOD;
    }


    /**
     * Gets the altura value for this CalcularFreteRequest.
     * 
     * @return altura
     */
    public org.apache.axis.types.NonNegativeInteger getAltura() {
        return altura;
    }


    /**
     * Sets the altura value for this CalcularFreteRequest.
     * 
     * @param altura
     */
    public void setAltura(org.apache.axis.types.NonNegativeInteger altura) {
        this.altura = altura;
    }


    /**
     * Gets the largura value for this CalcularFreteRequest.
     * 
     * @return largura
     */
    public org.apache.axis.types.NonNegativeInteger getLargura() {
        return largura;
    }


    /**
     * Sets the largura value for this CalcularFreteRequest.
     * 
     * @param largura
     */
    public void setLargura(org.apache.axis.types.NonNegativeInteger largura) {
        this.largura = largura;
    }


    /**
     * Gets the profundidade value for this CalcularFreteRequest.
     * 
     * @return profundidade
     */
    public org.apache.axis.types.NonNegativeInteger getProfundidade() {
        return profundidade;
    }


    /**
     * Sets the profundidade value for this CalcularFreteRequest.
     * 
     * @param profundidade
     */
    public void setProfundidade(org.apache.axis.types.NonNegativeInteger profundidade) {
        this.profundidade = profundidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalcularFreteRequest)) return false;
        CalcularFreteRequest other = (CalcularFreteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoServico==null && other.getTipoServico()==null) || 
             (this.tipoServico!=null &&
              this.tipoServico.equals(other.getTipoServico()))) &&
            ((this.cepDestino==null && other.getCepDestino()==null) || 
             (this.cepDestino!=null &&
              this.cepDestino.equals(other.getCepDestino()))) &&
            ((this.peso==null && other.getPeso()==null) || 
             (this.peso!=null &&
              this.peso.equals(other.getPeso()))) &&
            ((this.valorDeclarado==null && other.getValorDeclarado()==null) || 
             (this.valorDeclarado!=null &&
              this.valorDeclarado.equals(other.getValorDeclarado()))) &&
            ((this.tipoEntrega==null && other.getTipoEntrega()==null) || 
             (this.tipoEntrega!=null &&
              this.tipoEntrega.equals(other.getTipoEntrega()))) &&
            ((this.servicoCOD==null && other.getServicoCOD()==null) || 
             (this.servicoCOD!=null &&
              this.servicoCOD.equals(other.getServicoCOD()))) &&
            ((this.altura==null && other.getAltura()==null) || 
             (this.altura!=null &&
              this.altura.equals(other.getAltura()))) &&
            ((this.largura==null && other.getLargura()==null) || 
             (this.largura!=null &&
              this.largura.equals(other.getLargura()))) &&
            ((this.profundidade==null && other.getProfundidade()==null) || 
             (this.profundidade!=null &&
              this.profundidade.equals(other.getProfundidade())));
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
        if (getTipoServico() != null) {
            _hashCode += getTipoServico().hashCode();
        }
        if (getCepDestino() != null) {
            _hashCode += getCepDestino().hashCode();
        }
        if (getPeso() != null) {
            _hashCode += getPeso().hashCode();
        }
        if (getValorDeclarado() != null) {
            _hashCode += getValorDeclarado().hashCode();
        }
        if (getTipoEntrega() != null) {
            _hashCode += getTipoEntrega().hashCode();
        }
        if (getServicoCOD() != null) {
            _hashCode += getServicoCOD().hashCode();
        }
        if (getAltura() != null) {
            _hashCode += getAltura().hashCode();
        }
        if (getLargura() != null) {
            _hashCode += getLargura().hashCode();
        }
        if (getProfundidade() != null) {
            _hashCode += getProfundidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalcularFreteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_calculo_frete.total", "calcularFreteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CepDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServicoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Altura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Largura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profundidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Profundidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
