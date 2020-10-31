package modelo;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, int num, String city, String state) {
		this.logradouro = logradouro;
		this.numero = num;
		this.cidade = city;
		this.estado = state;
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

	@Override
	public String toString() {
		return "Logradouro: " + logradouro + ", Número: " + numero + ", Cidade: " + cidade + ", Estado: "
				+ estado;
	}

}
