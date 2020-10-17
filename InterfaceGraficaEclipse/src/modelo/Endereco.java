package modelo;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	private String estado;
	
	public Endereco () {
		
	}

	@Override
	public String toString() {
		return  ""+logradouro + ", numero " + numero + ", " + cidade + "-" + estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
