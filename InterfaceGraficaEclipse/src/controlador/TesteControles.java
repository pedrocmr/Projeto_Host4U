package controlador;

import modelo.Cadastro;

public class TesteControles {

	public static void main(String[] args) {

		Cadastro cad = new Cadastro("Edu", "9", "Eduardo","12364577809", "Macho");
		Cadastro cad2 = new Cadastro("Renan", "9", "paixão","12364577809", "Macho");
		Cadastro cad3 = new Cadastro("Rafão", "9", "Lindão","12364577809", "Macho");
		Cadastro cad4 = new Cadastro("Pipico", "9", "Pipicão","12364577809", "Melhor do mundo");

		ControleCadastro ccad = new ControleCadastro(cad);
		
		
		ccad.dadoCadastroAdiciona(cad2);
		ccad.lerDadoCadastro();

	}

}
