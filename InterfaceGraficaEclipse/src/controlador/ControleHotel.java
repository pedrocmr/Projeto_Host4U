package controlador;

import modelo.Hotel;
import modelo.LugarProximo;
import modelo.Quarto;
import repositorio.RepositorioLugarArray;

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
               			
				//PREENCHER
			}

		}
	}

}
