package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {

	private Usuario usuario;
	LocalDateTime checkin;
	LocalDateTime checkout;

	// CONSTRUTOR
	public Reserva(Usuario usuario, LocalDateTime checkin, LocalDateTime checkout) {

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

	public LocalDateTime getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDateTime checkin) {
		this.checkin = checkin;
	}

	public LocalDateTime getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDateTime checkout) {
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY - HH:mm:ss");

		String in = checkin.format(formatador);
		String out = checkout.format(formatador);

		return "Reserva [Usuário: " + usuario.cadastro.getNome() + ", Check-in: " + in + ", Check-out: " + out + "]";
	}

}
