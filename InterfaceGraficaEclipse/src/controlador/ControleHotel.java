package controlador;

import modelo.Hotel;
import modelo.LugarProximo;
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
	
	public void adicionaLugares(LugarProximo... lugar) {

		if (lugar != null) {
			for (LugarProximo l : lugar) {

				hotel.getLugaresProximos().add(l);
			}
		
		}
	}

}
