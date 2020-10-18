package controlador;

import java.time.LocalDateTime;

import modelo.Usuario;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class TesteControles {

	public static void main(String[] args) {

		// TESTANDO CONTROLE CADASTRO
		Usuario cad = new Usuario("Edu", "9", "Eduardo","12312312309", "Macho");
		Usuario cad2 = new Usuario("Renan", "9", "paixão","12312312309", "Macho");
		Usuario cad3 = new Usuario("Rafão", "9", "Lindão","12312312309", "Macho");
		Usuario cad4 = new Usuario("Pipico", "9", "Pipicão","12312312309", "Melhor do mundo");

		ControleCadastro ccad = new ControleCadastro(cad);

		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		
		// TESTANDO RESERVA E CONTROLE RESERVA
		

		// CRIANDO AS DATAS DE CHECK-IN E CHECK-OUT
		LocalDateTime checkin = LocalDateTime.of(2020, 11, 19, 10, 05, 12);
		LocalDateTime checkout = LocalDateTime.of(2020, 12, 20, 11, 15, 50);

		LocalDateTime checkin1 = LocalDateTime.of(2020, 11, 23, 11, 45, 19);
		LocalDateTime checkout1 = LocalDateTime.of(2020, 11, 30, 19, 15, 50);

		// CRIANDO RESERVA
		Reserva reserva1 = new Reserva(cad, checkin, checkout);
		Reserva reserva2 = new Reserva(cad2, checkin, checkout);

		System.out.println(reserva1 + "\n");

		// CRIANDO QUARTO
		Quarto quarto1 = new Quarto(12, 3, 2, 134.0, 100.0, 12.5);
		Quarto quarto2 = new Quarto(17, 6, 3, 134.0, 100.0, 17.5);

		// CONTROLE RESERVA
		ControleReserva cr = new ControleReserva(quarto1);

		// MÉTODO PARA PREENCHER A RESERVA
		cr.preencheReserva(cad, checkin, checkout);
		cr.preencheReserva(cad, checkin, checkout);

		// MÉTODO QUE LISTA A RESERVA
		cr.listaReservas();

		// MÉTODO QUE CANCELA A RESERVA
		System.out.println("\n");
		cr.cancelaReserva(checkin);
		cr.listaReservas();

		// METODO QUE REMARCA A RESERVA
		cr.remarcarReserva(checkin1, checkout1);
		System.out.println("\n");
		cr.listaReservas();

	}

}
