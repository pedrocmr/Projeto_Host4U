package controlador;

import java.time.LocalDate;

import modelo.Hotel;
import modelo.Lugar;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class TesteControles {

	public static void main(String[] args) {
		
		Lugar lugar = new Lugar("shopping", "EduMar", 1231.2, 123.2);
		Hotel rafaels = new Hotel("casa de Rafael", 1,1,lugar);
		Quarto quinze = new Quarto(1, 2, rafaels, 3, 100, 300, 75);
		// TESTANDO CONTROLE CADASTRO
		Usuario cad = new Usuario("Edu", "9", "Eduardo", "123", "Macho");
		Usuario cad2 = new Usuario("Renan", "9", "paix�o", "12123091232", "Macho");
		Usuario cad3 = new Usuario("Raf�o", "9", "Lind�o", "1", "Macho");
		Usuario cad4 = new Usuario("Pipico", "9", "Pipic�o", "12312312309", "Melhor do mundo");

		Reserva r = new Reserva(cad2, quinze,LocalDate.of(2020, 12, 11), LocalDate.of(2020, 12, 30));
	
	
		System.out.println(r.getCheckin());
		
		ControleReserva cresera = new ControleReserva();
		
		
		cresera.cancelaReserva(r.getUsuario(), r);
		
		
	}

}
