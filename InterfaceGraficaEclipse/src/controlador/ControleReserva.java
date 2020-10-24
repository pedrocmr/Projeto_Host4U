package controlador;

import java.time.LocalDate;

import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;
import repositorio.RepositorioReservaArray;

public class ControleReserva {

	private RepositorioReservaArray repo;

	public ControleReserva() {
		
	}

	// M�TODO PARA PREENCHER RESERVAS
	public void preencheReserva(Usuario usuario, LocalDate checkin, LocalDate checkout) {

		quarto.getReserva().add(new Reserva(usuario, checkin, checkout));

	}

	// M�TODO CANCELAR RESERVAS
	public void cancelaReserva(LocalDate checkin) {

		
	}

	// M�TODO REMARCAR RESERVAS
	public void remarcarReserva(LocalDate checkin, LocalDate checkout) {

		 // PRECISA ADICIONAR AS CONDI��ES

			for (Reserva r : reservas) {

				r.setCheckin(checkin);
				r.setCheckout(checkout);
			}
		
	}

}
