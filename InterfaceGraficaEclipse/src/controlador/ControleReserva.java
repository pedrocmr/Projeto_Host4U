package controlador;

import java.time.LocalDate;

import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class ControleReserva {

	

	public ControleReserva() {
		
	}

	// MÉTODO PARA PREENCHER RESERVAS
	public void preencheReserva(Usuario usuario, LocalDate checkin, LocalDate checkout) {

		quarto.getReserva().add(new Reserva(usuario, checkin, checkout));

	}

	// MÉTODO CANCELAR RESERVAS
	public void cancelaReserva(LocalDate checkin) {

		
	}

	// MÉTODO REMARCAR RESERVAS
	public void remarcarReserva(LocalDate checkin, LocalDate checkout) {

		for (int i = 0; i < quarto.getReserva().size(); i++) {

			quarto.getReserva().get(i).setCheckin(checkin);
			quarto.getReserva().get(i).setCheckout(checkout);

<<<<<<< HEAD
=======
		}
	}

	// MÉTODO LISTAR RESERVAS
	public void listaReservas() {

		for (int i = 0; i < quarto.getReserva().size(); i++) {

			System.out.println(quarto.getReserva().get(i));
>>>>>>> parent of fd150d3... Merge branch 'DEV-Telas_Renan'
		}
	}

}
