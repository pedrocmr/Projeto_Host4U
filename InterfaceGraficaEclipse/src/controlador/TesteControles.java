package controlador;

import java.time.LocalDate;

import modelo.Endereco;
import modelo.Hotel;
import modelo.Lugar;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class TesteControles {

	public static void main(String[] args) {
		
		Lugar lugar = new Lugar("shopping", "EduMar", 1231.2, 123.2);
		Endereco end = new Endereco("Rua doze", 1, "Recife", "PE");
		Hotel rafaels = new Hotel("casa de Rafael", 1,1,lugar,120,end);
		Quarto quinze = new Quarto(1, 2, rafaels, 3, 100, 300, 75);
		Hotel eduardos = new Hotel("casa de Eduardo", 3,5,lugar,160,end);
		// TESTANDO CONTROLE CADASTRO
		Usuario cad = new Usuario("Edu", "9", "Eduardo", "123", "Macho");
		Usuario cad2 = new Usuario("Renan", "9", "paixão", "12123091232", "Macho");
		Usuario cad3 = new Usuario("Rafão", "9", "Lindão", "1", "Macho");
		Usuario cad4 = new Usuario("Pipico", "9", "Pipicão", "12312312309", "Melhor do mundo");
        ControleHotel ch = new ControleHotel(rafaels);
		Reserva r = new Reserva(cad2, quinze,LocalDate.of(2020, 12, 11), LocalDate.of(2020, 12, 30));
		Reserva s = new Reserva(cad2, quinze,LocalDate.of(2021, 1, 11), LocalDate.of(2021, 1, 30));
		ControleReserva cresera = new ControleReserva();
		
        ch.adicionaQuartos(quinze);	
        System.out.println(rafaels.getQuartos());
        //cresera.addReserva(r);
        //cresera.remarcarReserva(cad2, r, s);
        
	}

}
