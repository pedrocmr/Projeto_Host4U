package modelo;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String Cidade;
	private String estado;
	
	public Endereco () {
		
	}

	@Override
	public String toString() {
		return  ""+logradouro + ", numero " + numero + ", " + Cidade + "-" + estado;
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
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void preencherEndereco(String logradouro, String cidade, String estado, int numero) {
		
		this.logradouro = logradouro;
		this.Cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		
		
	}
	
	
}
