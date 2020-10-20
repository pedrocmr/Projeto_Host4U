package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

	private Usuario usuario;
	LocalDate checkin;
	LocalDate checkout;

	// CONSTRUTOR
	public Reserva(Usuario usuario, LocalDate checkin, LocalDate checkout) {

		this.usuario = usuario;
		this.checkin = checkin;
		this.checkout = checkout;

	}

	// METODOS GETTERS E SETTERS
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY - HH:mm:ss");

		String in = checkin.format(formatador);
		String out = checkout.format(formatador);

		return "Reserva [Usuário: " + usuario.getNome() + ", Check-in: " + in + ", Check-out: " + out + "]";
	}

}
