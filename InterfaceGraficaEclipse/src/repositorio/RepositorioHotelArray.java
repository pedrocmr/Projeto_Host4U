package repositorio;

import java.util.ArrayList;

import modelo.Endereco;
import modelo.Hotel;
import modelo.Lugar;

public class RepositorioHotelArray implements IRepositorioHotel {
	private ArrayList <Hotel> hoteis;
	private Lugar l1;
	private Endereco end1;
	
	public RepositorioHotelArray() {
		
		hoteis = new ArrayList<Hotel>();
		l1 = new Lugar("Praia", "Porto de Galinhas", 50, 60);
		end1 = new Endereco("Rua do amor", 566, "Ipojuca", "PE");
		hoteis.add(new Hotel("Hotel Beira Mar", 1, 20, l1, 130, end1));
	}
	
	public ArrayList<Hotel> listarHoteis() {
		ArrayList<Hotel> ht = new ArrayList<Hotel>();
		for(Hotel h : hoteis) {
			ht.add(h);
		}
		
		return ht;
	}
}
