/**
 * Encomenda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.onsys.webservice.coletas;
 
public class Encomenda  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger tipoServico;

    private org.apache.axis.types.NonNegativeInteger tipoEntrega;

    private java.math.BigDecimal peso;

    private org.apache.axis.types.NonNegativeInteger volumes;

    private java.lang.String condFrete;

    private java.lang.String pedido;

    private java.lang.String idCliente;

    private java.lang.String natureza;

    private java.lang.String tipoVolumes;

    private org.apache.axis.types.NonNegativeInteger isencaoIcms;

    private java.lang.String infoColeta;

    private java.lang.String destNome;

    private java.lang.String destCpfCnpj;

    private java.lang.String destIe;

    private java.lang.String destEnd;

    private java.lang.String destEndNum;

    private java.lang.String destCompl;

    private java.lang.String destPontoRef;

    private java.lang.String destBairro;

    private java.lang.String destCidade;

    private java.lang.String destEstado;

    private java.lang.String destPais;

    private org.apache.axis.types.NonNegativeInteger destCep;

    private java.lang.String destEmail;

    private org.apache.axis.types.NonNegativeInteger destDdd;

    private org.apache.axis.types.NonNegativeInteger destTelefone1;

    private org.apache.axis.types.NonNegativeInteger destTelefone2;

    private org.apache.axis.types.NonNegativeInteger destTelefone3;

    private java.lang.String campanha;

    private br.com.onsys.webservice.coletas.Cod cod;

    private br.com.onsys.webservice.coletas.Agendamento agendamento;

    private br.com.onsys.webservice.coletas.NF[] docFiscalNF;

    private br.com.onsys.webservice.coletas.NFe[] docFiscalNFe;

    private br.com.onsys.webservice.coletas.DocFiscalOutroTipo[] docFiscalO;

    private java.lang.String CNPJ;

    public Encomenda() {
    }

    public Encomenda(
           org.apache.axis.types.NonNegativeInteger tipoServico,
           org.apache.axis.types.NonNegativeInteger tipoEntrega,
           java.math.BigDecimal peso,
           org.apache.axis.types.NonNegativeInteger volumes,
           java.lang.String condFrete,
           java.lang.String pedido,
           java.lang.String idCliente,
           java.lang.String natureza,
           java.lang.String tipoVolumes,
           org.apache.axis.types.NonNegativeInteger isencaoIcms,
           java.lang.String infoColeta,
           java.lang.String destNome,
           java.lang.String destCpfCnpj,
           java.lang.String destIe,
           java.lang.String destEnd,
           java.lang.String destEndNum,
           java.lang.String destCompl,
           java.lang.String destPontoRef,
           java.lang.String destBairro,
           java.lang.String destCidade,
           java.lang.String destEstado,
           java.lang.String destPais,
           org.apache.axis.types.NonNegativeInteger destCep,
           java.lang.String destEmail,
           org.apache.axis.types.NonNegativeInteger destDdd,
           org.apache.axis.types.NonNegativeInteger destTelefone1,
           org.apache.axis.types.NonNegativeInteger destTelefone2,
           org.apache.axis.types.NonNegativeInteger destTelefone3,
           java.lang.String campanha,
           br.com.onsys.webservice.coletas.Cod cod,
           br.com.onsys.webservice.coletas.Agendamento agendamento,
           br.com.onsys.webservice.coletas.NF[] docFiscalNF,
           br.com.onsys.webservice.coletas.NFe[] docFiscalNFe,
           br.com.onsys.webservice.coletas.DocFiscalOutroTipo[] docFiscalO,
           java.lang.String CNPJ) {
           this.tipoServico = tipoServico;
           this.tipoEntrega = tipoEntrega;
           this.peso = peso;
           this.volumes = volumes;
           this.condFrete = condFrete;
           this.pedido = pedido;
           this.idCliente = idCliente;
           this.natureza = natureza;
           this.tipoVolumes = tipoVolumes;
           this.isencaoIcms = isencaoIcms;
           this.infoColeta = infoColeta;
           this.destNome = destNome;
           this.destCpfCnpj = destCpfCnpj;
           this.destIe = destIe;
           this.destEnd = destEnd;
           this.destEndNum = destEndNum;
           this.destCompl = destCompl;
           this.destPontoRef = destPontoRef;
           this.destBairro = destBairro;
           this.destCidade = destCidade;
           this.destEstado = destEstado;
           this.destPais = destPais;
           this.destCep = destCep;
           this.destEmail = destEmail;
           this.destDdd = destDdd;
           this.destTelefone1 = destTelefone1;
           this.destTelefone2 = destTelefone2;
           this.destTelefone3 = destTelefone3;
           this.campanha = campanha;
           this.cod = cod;
           this.agendamento = agendamento;
           this.docFiscalNF = docFiscalNF;
           this.docFiscalNFe = docFiscalNFe;
           this.docFiscalO = docFiscalO;
           this.CNPJ = CNPJ;
    }


    /**
     * Gets the tipoServico value for this Encomenda.
     * 
     * @return tipoServico
     */
    public org.apache.axis.types.NonNegativeInteger getTipoServico() {
        return tipoServico;
    }


    /**
     * Sets the tipoServico value for this Encomenda.
     * 
     * @param tipoServico
     */
    public void setTipoServico(org.apache.axis.types.NonNegativeInteger tipoServico) {
        this.tipoServico = tipoServico;
    }


    /**
     * Gets the tipoEntrega value for this Encomenda.
     * 
     * @return tipoEntrega
     */
    public org.apache.axis.types.NonNegativeInteger getTipoEntrega() {
        return tipoEntrega;
    }


    /**
     * Sets the tipoEntrega value for this Encomenda.
     * 
     * @param tipoEntrega
     */
    public void setTipoEntrega(org.apache.axis.types.NonNegativeInteger tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }


    /**
     * Gets the peso value for this Encomenda.
     * 
     * @return peso
     */
    public java.math.BigDecimal getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this Encomenda.
     * 
     * @param peso
     */
    public void setPeso(java.math.BigDecimal peso) {
        this.peso = peso;
    }


    /**
     * Gets the volumes value for this Encomenda.
     * 
     * @return volumes
     */
    public org.apache.axis.types.NonNegativeInteger getVolumes() {
        return volumes;
    }


    /**
     * Sets the volumes value for this Encomenda.
     * 
     * @param volumes
     */
    public void setVolumes(org.apache.axis.types.NonNegativeInteger volumes) {
        this.volumes = volumes;
    }


    /**
     * Gets the condFrete value for this Encomenda.
     * 
     * @return condFrete
     */
    public java.lang.String getCondFrete() {
        return condFrete;
    }


    /**
     * Sets the condFrete value for this Encomenda.
     * 
     * @param condFrete
     */
    public void setCondFrete(java.lang.String condFrete) {
        this.condFrete = condFrete;
    }


    /**
     * Gets the pedido value for this Encomenda.
     * 
     * @return pedido
     */
    public java.lang.String getPedido() {
        return pedido;
    }


    /**
     * Sets the pedido value for this Encomenda.
     * 
     * @param pedido
     */
    public void setPedido(java.lang.String pedido) {
        this.pedido = pedido;
    }


    /**
     * Gets the idCliente value for this Encomenda.
     * 
     * @return idCliente
     */
    public java.lang.String getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this Encomenda.
     * 
     * @param idCliente
     */
    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the natureza value for this Encomenda.
     * 
     * @return natureza
     */
    public java.lang.String getNatureza() {
        return natureza;
    }


    /**
     * Sets the natureza value for this Encomenda.
     * 
     * @param natureza
     */
    public void setNatureza(java.lang.String natureza) {
        this.natureza = natureza;
    }


    /**
     * Gets the tipoVolumes value for this Encomenda.
     * 
     * @return tipoVolumes
     */
    public java.lang.String getTipoVolumes() {
        return tipoVolumes;
    }


    /**
     * Sets the tipoVolumes value for this Encomenda.
     * 
     * @param tipoVolumes
     */
    public void setTipoVolumes(java.lang.String tipoVolumes) {
        this.tipoVolumes = tipoVolumes;
    }


    /**
     * Gets the isencaoIcms value for this Encomenda.
     * 
     * @return isencaoIcms
     */
    public org.apache.axis.types.NonNegativeInteger getIsencaoIcms() {
        return isencaoIcms;
    }


    /**
     * Sets the isencaoIcms value for this Encomenda.
     * 
     * @param isencaoIcms
     */
    public void setIsencaoIcms(org.apache.axis.types.NonNegativeInteger isencaoIcms) {
        this.isencaoIcms = isencaoIcms;
    }


    /**
     * Gets the infoColeta value for this Encomenda.
     * 
     * @return infoColeta
     */
    public java.lang.String getInfoColeta() {
        return infoColeta;
    }


    /**
     * Sets the infoColeta value for this Encomenda.
     * 
     * @param infoColeta
     */
    public void setInfoColeta(java.lang.String infoColeta) {
        this.infoColeta = infoColeta;
    }


    /**
     * Gets the destNome value for this Encomenda.
     * 
     * @return destNome
     */
    public java.lang.String getDestNome() {
        return destNome;
    }


    /**
     * Sets the destNome value for this Encomenda.
     * 
     * @param destNome
     */
    public void setDestNome(java.lang.String destNome) {
        this.destNome = destNome;
    }


    /**
     * Gets the destCpfCnpj value for this Encomenda.
     * 
     * @return destCpfCnpj
     */
    public java.lang.String getDestCpfCnpj() {
        return destCpfCnpj;
    }


    /**
     * Sets the destCpfCnpj value for this Encomenda.
     * 
     * @param destCpfCnpj
     */
    public void setDestCpfCnpj(java.lang.String destCpfCnpj) {
        this.destCpfCnpj = destCpfCnpj;
    }


    /**
     * Gets the destIe value for this Encomenda.
     * 
     * @return destIe
     */
    public java.lang.String getDestIe() {
        return destIe;
    }


    /**
     * Sets the destIe value for this Encomenda.
     * 
     * @param destIe
     */
    public void setDestIe(java.lang.String destIe) {
        this.destIe = destIe;
    }


    /**
     * Gets the destEnd value for this Encomenda.
     * 
     * @return destEnd
     */
    public java.lang.String getDestEnd() {
        return destEnd;
    }


    /**
     * Sets the destEnd value for this Encomenda.
     * 
     * @param destEnd
     */
    public void setDestEnd(java.lang.String destEnd) {
        this.destEnd = destEnd;
    }


    /**
     * Gets the destEndNum value for this Encomenda.
     * 
     * @return destEndNum
     */
    public java.lang.String getDestEndNum() {
        return destEndNum;
    }


    /**
     * Sets the destEndNum value for this Encomenda.
     * 
     * @param destEndNum
     */
    public void setDestEndNum(java.lang.String destEndNum) {
        this.destEndNum = destEndNum;
    }


    /**
     * Gets the destCompl value for this Encomenda.
     * 
     * @return destCompl
     */
    public java.lang.String getDestCompl() {
        return destCompl;
    }


    /**
     * Sets the destCompl value for this Encomenda.
     * 
     * @param destCompl
     */
    public void setDestCompl(java.lang.String destCompl) {
        this.destCompl = destCompl;
    }


    /**
     * Gets the destPontoRef value for this Encomenda.
     * 
     * @return destPontoRef
     */
    public java.lang.String getDestPontoRef() {
        return destPontoRef;
    }


    /**
     * Sets the destPontoRef value for this Encomenda.
     * 
     * @param destPontoRef
     */
    public void setDestPontoRef(java.lang.String destPontoRef) {
        this.destPontoRef = destPontoRef;
    }


    /**
     * Gets the destBairro value for this Encomenda.
     * 
     * @return destBairro
     */
    public java.lang.String getDestBairro() {
        return destBairro;
    }


    /**
     * Sets the destBairro value for this Encomenda.
     * 
     * @param destBairro
     */
    public void setDestBairro(java.lang.String destBairro) {
        this.destBairro = destBairro;
    }


    /**
     * Gets the destCidade value for this Encomenda.
     * 
     * @return destCidade
     */
    public java.lang.String getDestCidade() {
        return destCidade;
    }


    /**
     * Sets the destCidade value for this Encomenda.
     * 
     * @param destCidade
     */
    public void setDestCidade(java.lang.String destCidade) {
        this.destCidade = destCidade;
    }


    /**
     * Gets the destEstado value for this Encomenda.
     * 
     * @return destEstado
     */
    public java.lang.String getDestEstado() {
        return destEstado;
    }


    /**
     * Sets the destEstado value for this Encomenda.
     * 
     * @param destEstado
     */
    public void setDestEstado(java.lang.String destEstado) {
        this.destEstado = destEstado;
    }


    /**
     * Gets the destPais value for this Encomenda.
     * 
     * @return destPais
     */
    public java.lang.String getDestPais() {
        return destPais;
    }


    /**
     * Sets the destPais value for this Encomenda.
     * 
     * @param destPais
     */
    public void setDestPais(java.lang.String destPais) {
        this.destPais = destPais;
    }


    /**
     * Gets the destCep value for this Encomenda.
     * 
     * @return destCep
     */
    public org.apache.axis.types.NonNegativeInteger getDestCep() {
        return destCep;
    }


    /**
     * Sets the destCep value for this Encomenda.
     * 
     * @param destCep
     */
    public void setDestCep(org.apache.axis.types.NonNegativeInteger destCep) {
        this.destCep = destCep;
    }


    /**
     * Gets the destEmail value for this Encomenda.
     * 
     * @return destEmail
     */
    public java.lang.String getDestEmail() {
        return destEmail;
    }


    /**
     * Sets the destEmail value for this Encomenda.
     * 
     * @param destEmail
     */
    public void setDestEmail(java.lang.String destEmail) {
        this.destEmail = destEmail;
    }


    /**
     * Gets the destDdd value for this Encomenda.
     * 
     * @return destDdd
     */
    public org.apache.axis.types.NonNegativeInteger getDestDdd() {
        return destDdd;
    }


    /**
     * Sets the destDdd value for this Encomenda.
     * 
     * @param destDdd
     */
    public void setDestDdd(org.apache.axis.types.NonNegativeInteger destDdd) {
        this.destDdd = destDdd;
    }


    /**
     * Gets the destTelefone1 value for this Encomenda.
     * 
     * @return destTelefone1
     */
    public org.apache.axis.types.NonNegativeInteger getDestTelefone1() {
        return destTelefone1;
    }


    /**
     * Sets the destTelefone1 value for this Encomenda.
     * 
     * @param destTelefone1
     */
    public void setDestTelefone1(org.apache.axis.types.NonNegativeInteger destTelefone1) {
        this.destTelefone1 = destTelefone1;
    }


    /**
     * Gets the destTelefone2 value for this Encomenda.
     * 
     * @return destTelefone2
     */
    public org.apache.axis.types.NonNegativeInteger getDestTelefone2() {
        return destTelefone2;
    }


    /**
     * Sets the destTelefone2 value for this Encomenda.
     * 
     * @param destTelefone2
     */
    public void setDestTelefone2(org.apache.axis.types.NonNegativeInteger destTelefone2) {
        this.destTelefone2 = destTelefone2;
    }


    /**
     * Gets the destTelefone3 value for this Encomenda.
     * 
     * @return destTelefone3
     */
    public org.apache.axis.types.NonNegativeInteger getDestTelefone3() {
        return destTelefone3;
    }


    /**
     * Sets the destTelefone3 value for this Encomenda.
     * 
     * @param destTelefone3
     */
    public void setDestTelefone3(org.apache.axis.types.NonNegativeInteger destTelefone3) {
        this.destTelefone3 = destTelefone3;
    }


    /**
     * Gets the campanha value for this Encomenda.
     * 
     * @return campanha
     */
    public java.lang.String getCampanha() {
        return campanha;
    }


    /**
     * Sets the campanha value for this Encomenda.
     * 
     * @param campanha
     */
    public void setCampanha(java.lang.String campanha) {
        this.campanha = campanha;
    }


    /**
     * Gets the cod value for this Encomenda.
     * 
     * @return cod
     */
    public br.com.onsys.webservice.coletas.Cod getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this Encomenda.
     * 
     * @param cod
     */
    public void setCod(br.com.onsys.webservice.coletas.Cod cod) {
        this.cod = cod;
    }


    /**
     * Gets the agendamento value for this Encomenda.
     * 
     * @return agendamento
     */
    public br.com.onsys.webservice.coletas.Agendamento getAgendamento() {
        return agendamento;
    }


    /**
     * Sets the agendamento value for this Encomenda.
     * 
     * @param agendamento
     */
    public void setAgendamento(br.com.onsys.webservice.coletas.Agendamento agendamento) {
        this.agendamento = agendamento;
    }


    /**
     * Gets the docFiscalNF value for this Encomenda.
     * 
     * @return docFiscalNF
     */
    public br.com.onsys.webservice.coletas.NF[] getDocFiscalNF() {
        return docFiscalNF;
    }


    /**
     * Sets the docFiscalNF value for this Encomenda.
     * 
     * @param docFiscalNF
     */
    public void setDocFiscalNF(br.com.onsys.webservice.coletas.NF[] docFiscalNF) {
        this.docFiscalNF = docFiscalNF;
    }


    /**
     * Gets the docFiscalNFe value for this Encomenda.
     * 
     * @return docFiscalNFe
     */
    public br.com.onsys.webservice.coletas.NFe[] getDocFiscalNFe() {
        return docFiscalNFe;
    }


    /**
     * Sets the docFiscalNFe value for this Encomenda.
     * 
     * @param docFiscalNFe
     */
    public void setDocFiscalNFe(br.com.onsys.webservice.coletas.NFe[] docFiscalNFe) {
        this.docFiscalNFe = docFiscalNFe;
    }


    /**
     * Gets the docFiscalO value for this Encomenda.
     * 
     * @return docFiscalO
     */
    public br.com.onsys.webservice.coletas.DocFiscalOutroTipo[] getDocFiscalO() {
        return docFiscalO;
    }


    /**
     * Sets the docFiscalO value for this Encomenda.
     * 
     * @param docFiscalO
     */
    public void setDocFiscalO(br.com.onsys.webservice.coletas.DocFiscalOutroTipo[] docFiscalO) {
        this.docFiscalO = docFiscalO;
    }


    /**
     * Gets the CNPJ value for this Encomenda.
     * 
     * @return CNPJ
     */
    public java.lang.String getCNPJ() {
        return CNPJ;
    }


    /**
     * Sets the CNPJ value for this Encomenda.
     * 
     * @param CNPJ
     */
    public void setCNPJ(java.lang.String CNPJ) {
        this.CNPJ = CNPJ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Encomenda)) return false;
        Encomenda other = (Encomenda) obj;
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
            ((this.tipoEntrega==null && other.getTipoEntrega()==null) || 
             (this.tipoEntrega!=null &&
              this.tipoEntrega.equals(other.getTipoEntrega()))) &&
            ((this.peso==null && other.getPeso()==null) || 
             (this.peso!=null &&
              this.peso.equals(other.getPeso()))) &&
            ((this.volumes==null && other.getVolumes()==null) || 
             (this.volumes!=null &&
              this.volumes.equals(other.getVolumes()))) &&
            ((this.condFrete==null && other.getCondFrete()==null) || 
             (this.condFrete!=null &&
              this.condFrete.equals(other.getCondFrete()))) &&
            ((this.pedido==null && other.getPedido()==null) || 
             (this.pedido!=null &&
              this.pedido.equals(other.getPedido()))) &&
            ((this.idCliente==null && other.getIdCliente()==null) || 
             (this.idCliente!=null &&
              this.idCliente.equals(other.getIdCliente()))) &&
            ((this.natureza==null && other.getNatureza()==null) || 
             (this.natureza!=null &&
              this.natureza.equals(other.getNatureza()))) &&
            ((this.tipoVolumes==null && other.getTipoVolumes()==null) || 
             (this.tipoVolumes!=null &&
              this.tipoVolumes.equals(other.getTipoVolumes()))) &&
            ((this.isencaoIcms==null && other.getIsencaoIcms()==null) || 
             (this.isencaoIcms!=null &&
              this.isencaoIcms.equals(other.getIsencaoIcms()))) &&
            ((this.infoColeta==null && other.getInfoColeta()==null) || 
             (this.infoColeta!=null &&
              this.infoColeta.equals(other.getInfoColeta()))) &&
            ((this.destNome==null && other.getDestNome()==null) || 
             (this.destNome!=null &&
              this.destNome.equals(other.getDestNome()))) &&
            ((this.destCpfCnpj==null && other.getDestCpfCnpj()==null) || 
             (this.destCpfCnpj!=null &&
              this.destCpfCnpj.equals(other.getDestCpfCnpj()))) &&
            ((this.destIe==null && other.getDestIe()==null) || 
             (this.destIe!=null &&
              this.destIe.equals(other.getDestIe()))) &&
            ((this.destEnd==null && other.getDestEnd()==null) || 
             (this.destEnd!=null &&
              this.destEnd.equals(other.getDestEnd()))) &&
            ((this.destEndNum==null && other.getDestEndNum()==null) || 
             (this.destEndNum!=null &&
              this.destEndNum.equals(other.getDestEndNum()))) &&
            ((this.destCompl==null && other.getDestCompl()==null) || 
             (this.destCompl!=null &&
              this.destCompl.equals(other.getDestCompl()))) &&
            ((this.destPontoRef==null && other.getDestPontoRef()==null) || 
             (this.destPontoRef!=null &&
              this.destPontoRef.equals(other.getDestPontoRef()))) &&
            ((this.destBairro==null && other.getDestBairro()==null) || 
             (this.destBairro!=null &&
              this.destBairro.equals(other.getDestBairro()))) &&
            ((this.destCidade==null && other.getDestCidade()==null) || 
             (this.destCidade!=null &&
              this.destCidade.equals(other.getDestCidade()))) &&
            ((this.destEstado==null && other.getDestEstado()==null) || 
             (this.destEstado!=null &&
              this.destEstado.equals(other.getDestEstado()))) &&
            ((this.destPais==null && other.getDestPais()==null) || 
             (this.destPais!=null &&
              this.destPais.equals(other.getDestPais()))) &&
            ((this.destCep==null && other.getDestCep()==null) || 
             (this.destCep!=null &&
              this.destCep.equals(other.getDestCep()))) &&
            ((this.destEmail==null && other.getDestEmail()==null) || 
             (this.destEmail!=null &&
              this.destEmail.equals(other.getDestEmail()))) &&
            ((this.destDdd==null && other.getDestDdd()==null) || 
             (this.destDdd!=null &&
              this.destDdd.equals(other.getDestDdd()))) &&
            ((this.destTelefone1==null && other.getDestTelefone1()==null) || 
             (this.destTelefone1!=null &&
              this.destTelefone1.equals(other.getDestTelefone1()))) &&
            ((this.destTelefone2==null && other.getDestTelefone2()==null) || 
             (this.destTelefone2!=null &&
              this.destTelefone2.equals(other.getDestTelefone2()))) &&
            ((this.destTelefone3==null && other.getDestTelefone3()==null) || 
             (this.destTelefone3!=null &&
              this.destTelefone3.equals(other.getDestTelefone3()))) &&
            ((this.campanha==null && other.getCampanha()==null) || 
             (this.campanha!=null &&
              this.campanha.equals(other.getCampanha()))) &&
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.agendamento==null && other.getAgendamento()==null) || 
             (this.agendamento!=null &&
              this.agendamento.equals(other.getAgendamento()))) &&
            ((this.docFiscalNF==null && other.getDocFiscalNF()==null) || 
             (this.docFiscalNF!=null &&
              java.util.Arrays.equals(this.docFiscalNF, other.getDocFiscalNF()))) &&
            ((this.docFiscalNFe==null && other.getDocFiscalNFe()==null) || 
             (this.docFiscalNFe!=null &&
              java.util.Arrays.equals(this.docFiscalNFe, other.getDocFiscalNFe()))) &&
            ((this.docFiscalO==null && other.getDocFiscalO()==null) || 
             (this.docFiscalO!=null &&
              java.util.Arrays.equals(this.docFiscalO, other.getDocFiscalO()))) &&
            ((this.CNPJ==null && other.getCNPJ()==null) || 
             (this.CNPJ!=null &&
              this.CNPJ.equals(other.getCNPJ())));
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
        if (getTipoEntrega() != null) {
            _hashCode += getTipoEntrega().hashCode();
        }
        if (getPeso() != null) {
            _hashCode += getPeso().hashCode();
        }
        if (getVolumes() != null) {
            _hashCode += getVolumes().hashCode();
        }
        if (getCondFrete() != null) {
            _hashCode += getCondFrete().hashCode();
        }
        if (getPedido() != null) {
            _hashCode += getPedido().hashCode();
        }
        if (getIdCliente() != null) {
            _hashCode += getIdCliente().hashCode();
        }
        if (getNatureza() != null) {
            _hashCode += getNatureza().hashCode();
        }
        if (getTipoVolumes() != null) {
            _hashCode += getTipoVolumes().hashCode();
        }
        if (getIsencaoIcms() != null) {
            _hashCode += getIsencaoIcms().hashCode();
        }
        if (getInfoColeta() != null) {
            _hashCode += getInfoColeta().hashCode();
        }
        if (getDestNome() != null) {
            _hashCode += getDestNome().hashCode();
        }
        if (getDestCpfCnpj() != null) {
            _hashCode += getDestCpfCnpj().hashCode();
        }
        if (getDestIe() != null) {
            _hashCode += getDestIe().hashCode();
        }
        if (getDestEnd() != null) {
            _hashCode += getDestEnd().hashCode();
        }
        if (getDestEndNum() != null) {
            _hashCode += getDestEndNum().hashCode();
        }
        if (getDestCompl() != null) {
            _hashCode += getDestCompl().hashCode();
        }
        if (getDestPontoRef() != null) {
            _hashCode += getDestPontoRef().hashCode();
        }
        if (getDestBairro() != null) {
            _hashCode += getDestBairro().hashCode();
        }
        if (getDestCidade() != null) {
            _hashCode += getDestCidade().hashCode();
        }
        if (getDestEstado() != null) {
            _hashCode += getDestEstado().hashCode();
        }
        if (getDestPais() != null) {
            _hashCode += getDestPais().hashCode();
        }
        if (getDestCep() != null) {
            _hashCode += getDestCep().hashCode();
        }
        if (getDestEmail() != null) {
            _hashCode += getDestEmail().hashCode();
        }
        if (getDestDdd() != null) {
            _hashCode += getDestDdd().hashCode();
        }
        if (getDestTelefone1() != null) {
            _hashCode += getDestTelefone1().hashCode();
        }
        if (getDestTelefone2() != null) {
            _hashCode += getDestTelefone2().hashCode();
        }
        if (getDestTelefone3() != null) {
            _hashCode += getDestTelefone3().hashCode();
        }
        if (getCampanha() != null) {
            _hashCode += getCampanha().hashCode();
        }
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getAgendamento() != null) {
            _hashCode += getAgendamento().hashCode();
        }
        if (getDocFiscalNF() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocFiscalNF());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocFiscalNF(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocFiscalNFe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocFiscalNFe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocFiscalNFe(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocFiscalO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocFiscalO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocFiscalO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCNPJ() != null) {
            _hashCode += getCNPJ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Encomenda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Encomenda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Volumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CondFrete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pedido"));
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
        elemField.setFieldName("natureza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Natureza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoVolumes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoVolumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isencaoIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsencaoIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoColeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InfoColeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestCpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destIe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestIe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destEndNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestEndNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destPontoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestPontoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destBairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestBairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destPais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestCep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestDdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destTelefone1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestTelefone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destTelefone2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestTelefone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destTelefone3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestTelefone3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campanha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Campanha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Cod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Agendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "Agendamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docFiscalNF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocFiscalNF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docFiscalNFe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocFiscalNFe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "NFe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docFiscalO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocFiscalO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edi.totalexpress.com.br/soap/webservice_v24.total", "DocFiscalOutroTipo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CNPJ"));
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
