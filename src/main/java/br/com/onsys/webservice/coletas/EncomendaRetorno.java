/**
 * EncomendaRetorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;

public class EncomendaRetorno  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger awb;

    private java.lang.String pedido;

    private org.apache.axis.types.NonNegativeInteger notaFiscal;

    private java.lang.String serieNotaFiscal;

    private java.lang.String idCliente;

    private java.lang.String codigoObjeto;

    private br.com.onsys.webservice.coletas.StatusTotal[] arrayStatusTotal;

    private br.com.onsys.webservice.coletas.StatusEct[] arrayStatusEct;

    public EncomendaRetorno() {
    }

    public EncomendaRetorno(
           org.apache.axis.types.NonNegativeInteger awb,
           java.lang.String pedido,
           org.apache.axis.types.NonNegativeInteger notaFiscal,
           java.lang.String serieNotaFiscal,
           java.lang.String idCliente,
           java.lang.String codigoObjeto,
           br.com.onsys.webservice.coletas.StatusTotal[] arrayStatusTotal,
           br.com.onsys.webservice.coletas.StatusEct[] arrayStatusEct) {
           this.awb = awb;
           this.pedido = pedido;
           this.notaFiscal = notaFiscal;
           this.serieNotaFiscal = serieNotaFiscal;
           this.idCliente = idCliente;
           this.codigoObjeto = codigoObjeto;
           this.arrayStatusTotal = arrayStatusTotal;
           this.arrayStatusEct = arrayStatusEct;
    }


    /**
     * Gets the awb value for this EncomendaRetorno.
     * 
     * @return awb
     */
    public org.apache.axis.types.NonNegativeInteger getAwb() {
        return awb;
    }


    /**
     * Sets the awb value for this EncomendaRetorno.
     * 
     * @param awb
     */
    public void setAwb(org.apache.axis.types.NonNegativeInteger awb) {
        this.awb = awb;
    }


    /**
     * Gets the pedido value for this EncomendaRetorno.
     * 
     * @return pedido
     */
    public java.lang.String getPedido() {
        return pedido;
    }


    /**
     * Sets the pedido value for this EncomendaRetorno.
     * 
     * @param pedido
     */
    public void setPedido(java.lang.String pedido) {
        this.pedido = pedido;
    }


    /**
     * Gets the notaFiscal value for this EncomendaRetorno.
     * 
     * @return notaFiscal
     */
    public org.apache.axis.types.NonNegativeInteger getNotaFiscal() {
        return notaFiscal;
    }


    /**
     * Sets the notaFiscal value for this EncomendaRetorno.
     * 
     * @param notaFiscal
     */
    public void setNotaFiscal(org.apache.axis.types.NonNegativeInteger notaFiscal) {
        this.notaFiscal = notaFiscal;
    }


    /**
     * Gets the serieNotaFiscal value for this EncomendaRetorno.
     * 
     * @return serieNotaFiscal
     */
    public java.lang.String getSerieNotaFiscal() {
        return serieNotaFiscal;
    }


    /**
     * Sets the serieNotaFiscal value for this EncomendaRetorno.
     * 
     * @param serieNotaFiscal
     */
    public void setSerieNotaFiscal(java.lang.String serieNotaFiscal) {
        this.serieNotaFiscal = serieNotaFiscal;
    }


    /**
     * Gets the idCliente value for this EncomendaRetorno.
     * 
     * @return idCliente
     */
    public java.lang.String getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this EncomendaRetorno.
     * 
     * @param idCliente
     */
    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the codigoObjeto value for this EncomendaRetorno.
     * 
     * @return codigoObjeto
     */
    public java.lang.String getCodigoObjeto() {
        return codigoObjeto;
    }


    /**
     * Sets the codigoObjeto value for this EncomendaRetorno.
     * 
     * @param codigoObjeto
     */
    public void setCodigoObjeto(java.lang.String codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }


    /**
     * Gets the arrayStatusTotal value for this EncomendaRetorno.
     * 
     * @return arrayStatusTotal
     */
    public br.com.onsys.webservice.coletas.StatusTotal[] getArrayStatusTotal() {
        return arrayStatusTotal;
    }


    /**
     * Sets the arrayStatusTotal value for this EncomendaRetorno.
     * 
     * @param arrayStatusTotal
     */
    public void setArrayStatusTotal(br.com.onsys.webservice.coletas.StatusTotal[] arrayStatusTotal) {
        this.arrayStatusTotal = arrayStatusTotal;
    }


    /**
     * Gets the arrayStatusEct value for this EncomendaRetorno.
     * 
     * @return arrayStatusEct
     */
    public br.com.onsys.webservice.coletas.StatusEct[] getArrayStatusEct() {
        return arrayStatusEct;
    }


    /**
     * Sets the arrayStatusEct value for this EncomendaRetorno.
     * 
     * @param arrayStatusEct
     */
    public void setArrayStatusEct(br.com.onsys.webservice.coletas.StatusEct[] arrayStatusEct) {
        this.arrayStatusEct = arrayStatusEct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncomendaRetorno)) return false;
        EncomendaRetorno other = (EncomendaRetorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awb==null && other.getAwb()==null) || 
             (this.awb!=null &&
              this.awb.equals(other.getAwb()))) &&
            ((this.pedido==null && other.getPedido()==null) || 
             (this.pedido!=null &&
              this.pedido.equals(other.getPedido()))) &&
            ((this.notaFiscal==null && other.getNotaFiscal()==null) || 
             (this.notaFiscal!=null &&
              this.notaFiscal.equals(other.getNotaFiscal()))) &&
            ((this.serieNotaFiscal==null && other.getSerieNotaFiscal()==null) || 
             (this.serieNotaFiscal!=null &&
              this.serieNotaFiscal.equals(other.getSerieNotaFiscal()))) &&
            ((this.idCliente==null && other.getIdCliente()==null) || 
             (this.idCliente!=null &&
              this.idCliente.equals(other.getIdCliente()))) &&
            ((this.codigoObjeto==null && other.getCodigoObjeto()==null) || 
             (this.codigoObjeto!=null &&
              this.codigoObjeto.equals(other.getCodigoObjeto()))) &&
            ((this.arrayStatusTotal==null && other.getArrayStatusTotal()==null) || 
             (this.arrayStatusTotal!=null &&
              java.util.Arrays.equals(this.arrayStatusTotal, other.getArrayStatusTotal()))) &&
            ((this.arrayStatusEct==null && other.getArrayStatusEct()==null) || 
             (this.arrayStatusEct!=null &&
              java.util.Arrays.equals(this.arrayStatusEct, other.getArrayStatusEct())));
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
        if (getAwb() != null) {
            _hashCode += getAwb().hashCode();
        }
        if (getPedido() != null) {
            _hashCode += getPedido().hashCode();
        }
        if (getNotaFiscal() != null) {
            _hashCode += getNotaFiscal().hashCode();
        }
        if (getSerieNotaFiscal() != null) {
            _hashCode += getSerieNotaFiscal().hashCode();
        }
        if (getIdCliente() != null) {
            _hashCode += getIdCliente().hashCode();
        }
        if (getCodigoObjeto() != null) {
            _hashCode += getCodigoObjeto().hashCode();
        }
        if (getArrayStatusTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayStatusTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayStatusTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrayStatusEct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayStatusEct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayStatusEct(), i);
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
        new org.apache.axis.description.TypeDesc(EncomendaRetorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "EncomendaRetorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Awb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notaFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotaFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieNotaFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SerieNotaFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoObjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayStatusTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrayStatusTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusTotal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayStatusEct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrayStatusEct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "StatusEct"));
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
