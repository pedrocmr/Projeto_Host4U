package controlador;

import modelo.Cadastro;

public class TesteControles {

	public static void main(String[] args) {

		Cadastro cad = new Cadastro("Edu", "9", "Eduardo", "Macho");
		Cadastro cad2 = new Cadastro("Renan", "9", "paix�o", "Macho");
		Cadastro cad3 = new Cadastro("Raf�o", "9", "Lind�o", "Macho");
		Cadastro cad4 = new Cadastro("Pipico", "9", "Pipic�o", "Melhor do mundo");

		ControleCadastro ccad = new ControleCadastro(cad);
		
		
		ccad.dadoCadastro(cad);
		ccad.dadoCadastro(cad2);
		ccad.dadoCadastro(cad3);
		ccad.dadoCadastro(cad4);

	}

}
