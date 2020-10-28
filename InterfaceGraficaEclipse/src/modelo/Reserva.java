package modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Reserva {
	
    Quarto quarto;
	Usuario usuario;
	LocalDate checkin;
	LocalDate checkout;

	// CONSTRUTOR
	public Reserva(Usuario usuario, Quarto quarto, LocalDate checkin, LocalDate checkout) {
		
		
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
	
	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
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
	
	

	public boolean equals(Reserva reserva) {
		if (this == reserva)
			return true;
		if (reserva == null)
			return false;
		Reserva other = reserva;
		
		if (!usuario.getCpf().equals(reserva.getUsuario().getCpf())) {
		
			return false;
		}
		
		if(!quarto.equals(reserva.getQuarto())) {
			
			return false;
		}
		
		if (checkin == null) {
			if (other.checkin != null)
				return false;
			
		} else if (!checkin.equals(other.checkin))
			return false;
		
		if (checkout == null) {
			if (other.checkout != null)
				return false;
			
		} else if (!checkout.equals(other.checkout))
			return false;
		return true;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");

		String in = formatador.format(checkin);
		String out = formatador.format(checkout);

		return "Reserva [Usuário: " + usuario.getNome() + ", Check-in: " + in + ", Check-out: " + out + "]";
	}

}
