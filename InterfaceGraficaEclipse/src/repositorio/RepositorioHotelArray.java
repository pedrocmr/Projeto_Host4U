package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import controlador.ControleHotel;
import modelo.Endereco;
import modelo.Hotel;
import modelo.Lugar;
import modelo.Quarto;

public class RepositorioHotelArray implements IRepositorioHotel {

	private ArrayList<Hotel> hoteis;
	private Lugar l1;
	private Endereco end1;
	private Lugar l2;
	private Endereco end2;
	private Lugar l3;
	private Endereco end3;
	private FileReader fileReader;
	private BufferedReader leitor;

	public RepositorioHotelArray() {

			hoteis = new ArrayList<Hotel>();
			
			l1 = new Lugar("Praia", "Porto de Galinhas", 50, 60);
			end1 = new Endereco("Rua do amor", 566, "Ipojuca", "PE");
			hoteis.add(new Hotel("Hotel Beira Mar", 1, 20, l1, 130, end1));
			Quarto quarto = new Quarto(1, 2, hoteis.get(0), 3, 100, 300, 75);
			ControleHotel ch = new ControleHotel(hoteis.get(0));
			ch.adicionaQuartos(quarto);
			
			l2 = new Lugar("Praia","Boa Viagem", 100, 160);
			end2 = new Endereco("Avenida Boa Viagem", 235, "Recife", "PE");
			hoteis.add(new Hotel("Hotel Varanda", 2, 23, l2, 160, end2));
			
			l3 = new Lugar("Praia","Tamandaré", 170, 290);
			end3 = new Endereco("Rua das Ostras", 669,"Tamandaré", "PE");
			hoteis.add(new Hotel("Hotel Urbano ", 3, 10, l3, 100, end3));
			
			
			File hotel = new File("src/urbano.txt");
			
			try {
	
				 fileReader = new FileReader(hotel);
				 leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
			
			
				
				do {
					
					String [] vamosPorPartes = linha.split(",");
					
					hoteis.get(2).getQuartos().add(new Quarto(Integer.parseInt(vamosPorPartes[1]),
							Integer.parseInt(vamosPorPartes[2]),this.getHoteis().get(1),Integer.parseInt(vamosPorPartes[5]),
							Double.parseDouble(vamosPorPartes[6]),Double.parseDouble(vamosPorPartes[3]),
							Double.parseDouble(vamosPorPartes[4])));
					
					if (linha != null) {
					
						linha = leitor.readLine();
				
					}
				
				}while(linha != null);
				//fileReader.close();
				//leitor.close();
				
					for (Quarto biu : hoteis.get(2).getQuartos()) {
					
					System.out.println(biu);
					}
					
		} catch (IOException e) {
			
			System.out.println("erro" + e.getMessage());
		}		
	}

	public ArrayList<Hotel> getHoteis() {
		return hoteis;
	}

	public void setHoteis(ArrayList<Hotel> hoteis) {
		this.hoteis = hoteis;
	}

	public ArrayList<Hotel> listarHoteis() {
		ArrayList<Hotel> ht = new ArrayList<Hotel>();
		for (Hotel h : hoteis) {
			ht.add(h);
		}

		return ht;
	}

	public ArrayList<Quarto> listarQuartos() {
		ArrayList<Quarto> quartos = new ArrayList<Quarto>();
		for (Quarto q : quartos) {
			hoteis.get(0).getQuartos().add(q);
			quartos.add(q);
		}
		return quartos;
	}
}
