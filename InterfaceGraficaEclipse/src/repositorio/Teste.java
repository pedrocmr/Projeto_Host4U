package repositorio;

import java.time.LocalDate;

import controlador.ControleReserva;
import modelo.Hotel;
import modelo.Lugar;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class Teste {
	
	
	public static void main(String[]args) {
		
		
		Usuario u1 = new Usuario("renan", "1234", "renan", "12345678909", "masculino");
		
		Lugar l1 = new Lugar("Praia", "Porto de galinhas", 11.1,23.43);
		
		//Hotel h1 = new Hotel("nome", 2, 10, l1);
		//Quarto q1 = new Quarto(1, 1, h1, 3, 120, 200, 50);
		
		LocalDate dIn1 = LocalDate.of(2020, 10, 25);
		LocalDate dout1 = LocalDate.of(2020, 10, 29);
		
		ControleReserva ctReserva = new ControleReserva();
		
		
		RepositorioReservaArray repoReserva = new RepositorioReservaArray();
		RepositorioUsuarioArray repoUsuario = new RepositorioUsuarioArray();
		
		//Reserva r1 = new Reserva(u1, q1, dIn1, dout1);
		//repoUsuario.addUsuario(u1);
		System.out.println(repoUsuario.getUsuarios());
	//	ctReserva.preencheReserva(u1, dIn1, dout1);
		
		
	}

}
