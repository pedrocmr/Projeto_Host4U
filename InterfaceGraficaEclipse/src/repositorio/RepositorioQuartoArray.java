package repositorio;

import java.util.ArrayList;

import modelo.Quarto;

public class RepositorioQuartoArray {

	private ArrayList<Quarto> quartos;
	RepositorioHotelArray rp;
	
	
	public RepositorioQuartoArray() {
		
		quartos = new ArrayList<Quarto>();
		quartos.add(new Quarto(1, 1, rp.getHoteis().get(1), 3, 75.2, 100, 10.50));
	}

	public ArrayList<Quarto> listarQuartos(){
		
		ArrayList<Quarto> qt = new ArrayList<Quarto>();
		
		for(Quarto q : quartos) {
			qt.add(q);
		}
		
		return qt;
	}
}
