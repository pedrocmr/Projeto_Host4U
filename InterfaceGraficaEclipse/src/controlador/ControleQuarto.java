package controlador;

import java.time.LocalDateTime;

import modelo.Quarto;
import modelo.Usuario;

public class ControleQuarto {
	
	Quarto quarto;

	public ControleQuarto(Quarto quarto) {					
		this.quarto = quarto;
	}
	
	public void preencheReserva(Usuario usuario, LocalDateTime checkin, LocalDateTime checkout) {
		
		quarto.getReserva().setUsuario(usuario);
		quarto.getReserva().setCheckin(checkin);
		quarto.getReserva().setCheckout(checkout);
		
	}

}
