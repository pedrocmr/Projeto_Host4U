package controlador;

import modelo.Usuario;
import modelo.Quarto;
import modelo.Reserva;

public class TesteControles {

	public static void main(String[] args) {

		// TESTANDO CONTROLE CADASTRO
		Usuario cad = new Usuario("Edu", "9", "Eduardo", "123", "Macho");
		Usuario cad2 = new Usuario("Renan", "9", "paix�o", "1212309", "Macho");
		Usuario cad3 = new Usuario("Raf�o", "9", "Lind�o", "1", "Macho");
		Usuario cad4 = new Usuario("Pipico", "9", "Pipic�o", "12312312309", "Melhor do mundo");

		ControleCadastro ccad = new ControleCadastro();

	}

}
