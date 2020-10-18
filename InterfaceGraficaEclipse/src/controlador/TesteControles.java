package controlador;

import java.time.LocalDateTime;

import modelo.Cadastro;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class TesteControles {

	public static void main(String[] args) {

		// TESTANDO CONTROLE CADASTRO
		Cadastro cad = new Cadastro("Edu", "9", "Eduardo", "Macho");
		Cadastro cad2 = new Cadastro("Renan", "9", "paixão", "Macho");
		Cadastro cad3 = new Cadastro("Rafão", "9", "Lindão", "Macho");
		Cadastro cad4 = new Cadastro("Pipico", "9", "Pipicão", "Melhor do mundo");

		ControleCadastro ccad = new ControleCadastro(cad);

		/*
		 * ccad.dadoCadastro(cad); ccad.dadoCadastro(cad2); ccad.dadoCadastro(cad3);
		 * ccad.dadoCadastro(cad4);
		 */

		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		
		// TESTANDO RESERVA E CONTROLE RESERVA
		Usuario user = new Usuario(cad);
		Usuario user2 = new Usuario(cad2);

		// CRIANDO AS DATAS DE CHECK-IN E CHECK-OUT
		LocalDateTime checkin = LocalDateTime.of(2020, 11, 19, 10, 05, 12);
		LocalDateTime checkout = LocalDateTime.of(2020, 12, 20, 11, 15, 50);

		LocalDateTime checkin1 = LocalDateTime.of(2020, 11, 23, 11, 45, 19);
		LocalDateTime checkout1 = LocalDateTime.of(2020, 11, 30, 19, 15, 50);

		// CRIANDO RESERVA
		Reserva reserva1 = new Reserva(user, checkin, checkout);
		Reserva reserva2 = new Reserva(user2, checkin, checkout);

		System.out.println(reserva1 + "\n");

		// CRIANDO QUARTO
		Quarto quarto1 = new Quarto(12, 3, 2, 134.0, 100.0, 12.5);
		Quarto quarto2 = new Quarto(17, 6, 3, 134.0, 100.0, 17.5);

		// CONTROLE RESERVA
		ControleReserva cr = new ControleReserva(quarto1);

		// MÉTODO PARA PREENCHER A RESERVA
		cr.preencheReserva(user, checkin, checkout);
		cr.preencheReserva(user2, checkin, checkout);

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
