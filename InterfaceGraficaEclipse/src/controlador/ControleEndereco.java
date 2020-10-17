package controlador;

import modelo.Endereco;

public class ControleEndereco {

	
	Endereco endereco;

	public ControleEndereco(Endereco endereco) {
		
		this.endereco = endereco;
	}
	
	public void preencherEndereco(String logradouro, String cidade, String estado, int numero) {
		
		endereco.setLogradouro(logradouro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setNumero(numero);
	}
	
	
}
