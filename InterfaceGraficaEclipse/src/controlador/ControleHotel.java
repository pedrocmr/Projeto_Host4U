package controlador;

import modelo.Hotel;
import modelo.Quarto;

public class ControleHotel {

	Hotel hotel;

	public ControleHotel(Hotel hotel) {

		this.hotel = hotel;
	}

	public void adicionaQuartos(Quarto... quarto) {

		if (quarto != null) {

			for (Quarto q : quarto) {

				hotel.getQuartos().add(q);

			}
		}
	}
	
	public Quarto getQuarto(int numero) {
		
		Quarto quarto = null;
		
		for(Quarto existente : hotel.getQuartos()) {
			
			if ((existente.getHotel().getIdHotel() == this.hotel.getIdHotel()) && (existente.getNumero() == numero)) {
				
				
				quarto = existente;
			}
			
			
		}
			
		
		return quarto;
	}
}
