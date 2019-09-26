/**
 * RegistraColetaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package br.com.onsys.webservice.coletas;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
 
@XmlRootElement(name = "RegistraColetaResponse", namespace = "urn:RegistraColeta")
@XmlType(name = "RegistraColetaResponse", namespace = "tns:RegistraColetaResponse",
propOrder = {"codigoProc","itensProcessados","itensRejeitados"})
//@XmlType(propOrder = {"codigoProc", "codRomaneio", "itensProcessados","itensRejeitados", "errosIndividuais","numProtocolo"})
@XmlAccessorType(XmlAccessType.FIELD)
public class RegistraColetaResponse  implements java.io.Serializable {
    
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "CodigoProc" , namespace = "urn:RegistraColeta")	
	@XmlSchemaType(name = "nonNegativeInteger")
	private org.apache.axis.types.NonNegativeInteger codigoProc;

	//@XmlElement(name = "CodRomaneio")
    //private java.lang.String codRomaneio;

	@XmlElement(name = "ItensProcessados")
    private org.apache.axis.types.NonNegativeInteger itensProcessados;

	@XmlElement(name = "ItensRejeitados")
    private org.apache.axis.types.NonNegativeInteger itensRejeitados;

	//@XmlElement(name = "ErrosIndividuais")
    //private br.com.onsys.webservice.coletas.CriticaVolume[] errosIndividuais;

	//@XmlElement(name = "NumProtocolo")
    //private org.apache.axis.types.NonNegativeInteger numProtocolo;

    public RegistraColetaResponse() {
    }

    /*
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RegistraColetaResponse.class, true);

        static {
            typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "RegistraColetaResponse"));
            org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("codigoProc");
            elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoProc"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
            elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("codRomaneio");
            elemField.setXmlName(new javax.xml.namespace.QName("", "CodRomaneio"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
            elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("itensProcessados");
            elemField.setXmlName(new javax.xml.namespace.QName("", "ItensProcessados"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
            elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("itensRejeitados");
            elemField.setXmlName(new javax.xml.namespace.QName("", "ItensRejeitados"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
            elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("errosIndividuais");
            elemField.setXmlName(new javax.xml.namespace.QName("", "ErrosIndividuais"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "CriticaVolume"));
            elemField.setMinOccurs(0);
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
            elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("numProtocolo");
            elemField.setXmlName(new javax.xml.namespace.QName("", "NumProtocolo"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
            elemField.setMinOccurs(0);
            elemField.setNillable(false);
            typeDesc.addFieldDesc(elemField);
        }
  */

    /**
     * Gets the codigoProc value for this RegistraColetaResponse.
     * 
     * @return codigoProc
     */
    
    public org.apache.axis.types.NonNegativeInteger getCodigoProc() {
        return codigoProc;
    }


    /**
     * Sets the codigoProc value for this RegistraColetaResponse.
     * 
     * @param codigoProc
     */
   
    public void setCodigoProc(org.apache.axis.types.NonNegativeInteger codigoProc) {
        this.codigoProc = codigoProc;
    }


    /**
     * Gets the codRomaneio value for this RegistraColetaResponse.
     * 
     * @return codRomaneio
     

    public java.lang.String getCodRomaneio() {
        return codRomaneio;
    }

 
    public void setCodRomaneio(java.lang.String codRomaneio) {
        this.codRomaneio = codRomaneio;
    }
*/

    /**
     * Gets the itensProcessados value for this RegistraColetaResponse.
     * 
     * @return itensProcessados
     */

    public org.apache.axis.types.NonNegativeInteger getItensProcessados() {
        return itensProcessados;
    }


    /**
     * Sets the itensProcessados value for this RegistraColetaResponse.
     * 
     * @param itensProcessados
     */
    
    public void setItensProcessados(org.apache.axis.types.NonNegativeInteger itensProcessados) {
        this.itensProcessados = itensProcessados;
    }


    /**
     * Gets the itensRejeitados value for this RegistraColetaResponse.
     * 
     * @return itensRejeitados
     */

    public org.apache.axis.types.NonNegativeInteger getItensRejeitados() {
        return itensRejeitados;
    }


    /**
     * Sets the itensRejeitados value for this RegistraColetaResponse.
     * 
     * @param itensRejeitados
     */
    
    public void setItensRejeitados(org.apache.axis.types.NonNegativeInteger itensRejeitados) {
        this.itensRejeitados = itensRejeitados;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProc == null) ? 0 : codigoProc.hashCode());
		result = prime * result + ((itensProcessados == null) ? 0 : itensProcessados.hashCode());
		result = prime * result + ((itensRejeitados == null) ? 0 : itensRejeitados.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistraColetaResponse other = (RegistraColetaResponse) obj;
		if (codigoProc == null) {
			if (other.codigoProc != null)
				return false;
		} else if (!codigoProc.equals(other.codigoProc))
			return false;
		if (itensProcessados == null) {
			if (other.itensProcessados != null)
				return false;
		} else if (!itensProcessados.equals(other.itensProcessados))
			return false;
		if (itensRejeitados == null) {
			if (other.itensRejeitados != null)
				return false;
		} else if (!itensRejeitados.equals(other.itensRejeitados))
			return false;
		return true;
	}


    /**
     * Gets the errosIndividuais value for this RegistraColetaResponse.
     * 
     * @return errosIndividuais
     

    public br.com.onsys.webservice.coletas.CriticaVolume[] getErrosIndividuais() {
        return errosIndividuais;
    }

    
    public void setErrosIndividuais(br.com.onsys.webservice.coletas.CriticaVolume[] errosIndividuais) {
        this.errosIndividuais = errosIndividuais;
    }
     */

    /**
     * Gets the numProtocolo value for this RegistraColetaResponse.
     * 
     * @return numProtocolo
     

    public org.apache.axis.types.NonNegativeInteger getNumProtocolo() {
        return numProtocolo;
    }

   
    public void setNumProtocolo(org.apache.axis.types.NonNegativeInteger numProtocolo) {
        this.numProtocolo = numProtocolo;
    }
     */

    
}
