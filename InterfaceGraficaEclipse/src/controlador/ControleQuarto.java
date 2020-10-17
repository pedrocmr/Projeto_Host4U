package controlador;

import java.time.LocalDateTime;

import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;

public class ControleQuarto {

	Quarto quarto;

	public ControleQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	// M�TODO PARA PREENCHER RESERVAS
	public void preencheReserva(Usuario usuario, LocalDateTime checkin, LocalDateTime checkout) {

		quarto.getReserva().add(new Reserva(usuario, checkin, checkout));

	}

	// M�TODO CANCELAR RESERVAS
	public void cancelaReserva(LocalDateTime checkin) {
		
		for (int i = 0; i < quarto.getReserva().size(); i++) {
			
			if(quarto.getReserva().get(i).getCheckin().equals(checkin)) {
			quarto.getReserva().remove(i);
			}
		}
	}

	// M�TODO REMARCAR RESERVAS
	public void remarcarReserva(LocalDateTime checkin, LocalDateTime checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	// M�TODO LISTAR RESERVAS
	public void listaReservas() {

		for (Reserva res : reservas) {
			System.out.println(res);
		}
	}

}
