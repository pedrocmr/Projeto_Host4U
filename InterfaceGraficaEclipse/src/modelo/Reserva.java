package modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

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
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");

		String in = formatador.format(checkin);
		String out = formatador.format(checkout);

		return "Reserva [Usuário: " + usuario.getNome() + ", Check-in: " + in + ", Check-out: " + out + "]";
	}

}
