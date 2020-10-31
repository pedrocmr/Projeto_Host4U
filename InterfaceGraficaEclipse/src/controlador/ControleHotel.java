package controlador;

import modelo.Hotel;
import modelo.Lugar;
import modelo.LugarProximo;
import modelo.Quarto;
import repositorio.RepositorioLugarArray;

public class ControleHotel {

	Hotel hotel;
	private RepositorioLugarArray repLugar;
	

	public ControleHotel(Hotel hotel) {

		this.hotel = hotel;
		Lugar l1 = new Lugar("Praia", "Porto de Galinhas", 50, 60);
		
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

				// NECESSITA DE IMPLEMENTAÇÃO
			}

		}
	}

}
