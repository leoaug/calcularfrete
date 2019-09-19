package br.com.onsys.bean;

import java.io.Serializable;

public class CalcularFreteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipoServico;
	private String cepDestino;
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cepDestino == null) ? 0 : cepDestino.hashCode());
		result = prime * result + ((tipoServico == null) ? 0 : tipoServico.hashCode());
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
		CalcularFreteBean other = (CalcularFreteBean) obj;
		if (cepDestino == null) {
			if (other.cepDestino != null)
				return false;
		} else if (!cepDestino.equals(other.cepDestino))
			return false;
		if (tipoServico == null) {
			if (other.tipoServico != null)
				return false;
		} else if (!tipoServico.equals(other.tipoServico))
			return false;
		return true;
	}
	
	

}
