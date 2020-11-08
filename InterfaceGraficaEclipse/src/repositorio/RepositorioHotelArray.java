package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Hotel;
import modelo.Quarto;

public class RepositorioHotelArray implements IRepositorioHotel {

	private ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
	private FileReader fileReader;
	private BufferedReader leitor;
	

	public RepositorioHotelArray() {
		
		File addHotel = new File("src/hotel.txt");
		RepositorioLugarArray repoLug = new RepositorioLugarArray();
		RepositorioEndereco repoEnd = new RepositorioEndereco();
		
		try {

			fileReader = new FileReader(addHotel);
			leitor = new BufferedReader(fileReader);
			String linha = leitor.readLine();
			int i = 0;
			do {


				String[] vamosPorPartes = linha.split(",");

				hoteis.add(new Hotel(vamosPorPartes[0],Integer.parseInt(vamosPorPartes[1]),Integer.parseInt(vamosPorPartes[2]), 
						repoLug.getLugares().get(i),Integer.parseInt(vamosPorPartes[4]), repoEnd.getEnderecos().get(i)));
				
							
				if (linha != null) {

					linha = leitor.readLine();
				}

				i++;
				
			} while (linha != null);

		} catch (IOException e) {

			System.out.println("erro" + e.getMessage());
		}
		
	}
	
	public void addQuartoNoHotel() {

		File hotel = new File("src/quarto.txt");
		

		try {

			fileReader = new FileReader(hotel);
			
			leitor = new BufferedReader(fileReader);
			
			String linha = leitor.readLine();
			
			int i = 0;

			do {

				String[] vamosPorPartes = linha.split(",");

				 hoteis.get(i)
				 .getQuartos()
						.add(new Quarto(Integer.parseInt(vamosPorPartes[1]), Integer.parseInt(vamosPorPartes[2]),
								this.getHoteis().get(i), Integer.parseInt(vamosPorPartes[5]),
								Double.parseDouble(vamosPorPartes[6]), Double.parseDouble(vamosPorPartes[3]),
								Double.parseDouble(vamosPorPartes[4])));

	      
				
				if (linha.equals("pular")) {

					linha = leitor.readLine();

				}
				
				i++;

			} while (linha != null);
			

			for (Quarto biu : hoteis.get(i).getQuartos()) {

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
	
	public Hotel listarHotelPG(Integer id){
		
		System.out.println(hoteis.get(0));
		return hoteis.get(0);
	}
	public Hotel listarHotelBV(Integer id){
		
		System.out.println(hoteis.get(1));
		return hoteis.get(1);
	}
	
	public Hotel listarHotelTM(Integer id){
		
		System.out.println(hoteis.get(2));
		return hoteis.get(2);
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
