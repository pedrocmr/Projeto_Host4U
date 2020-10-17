package modelo;

import java.time.LocalDateTime;

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

	public Reserva() {

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
		return "Reserva [Usuário: " + usuario + ", Check-in: " + checkin + ", Check-out: " + checkout + "]";
	}

}
