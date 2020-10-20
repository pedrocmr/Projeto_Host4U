package controlador;

import java.time.LocalDate;

import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class ControleReserva {

	Quarto quarto;

	public ControleReserva(Quarto quarto) {
		this.quarto = quarto;
	}

	// M�TODO PARA PREENCHER RESERVAS
	public void preencheReserva(Usuario usuario, LocalDate checkin, LocalDate checkout) {

		quarto.getReserva().add(new Reserva(usuario, checkin, checkout));

	}

	// M�TODO CANCELAR RESERVAS
	public void cancelaReserva(LocalDate checkin) {

		for (int i = 0; i < quarto.getReserva().size(); i++) {

			if (quarto.getReserva().get(i).getCheckin().equals(checkin)) {
				quarto.getReserva().remove(i);
			}
		}
	}

	// M�TODO REMARCAR RESERVAS
	public void remarcarReserva(LocalDate checkin, LocalDate checkout) {

		for (int i = 0; i < quarto.getReserva().size(); i++) {

			quarto.getReserva().get(i).setCheckin(checkin);
			quarto.getReserva().get(i).setCheckout(checkout);

		}
	}

	// M�TODO LISTAR RESERVAS
	public void listaReservas() {

		for (int i = 0; i < quarto.getReserva().size(); i++) {

			System.out.println(quarto.getReserva().get(i));
		}
	}

}
