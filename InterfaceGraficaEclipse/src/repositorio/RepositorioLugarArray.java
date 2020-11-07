package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Lugar;
import modelo.Quarto;

public class RepositorioLugarArray implements IRepositorioLugar {
	
	private ArrayList <Lugar> lugares;
	private FileReader fileReader;
	private BufferedReader leitor;
	
	public RepositorioLugarArray() {
		
		lugares = new ArrayList<>();
		adicionaLugar();
	}

	public boolean adicionaLugar (String tipoDeLugar, String nomeDoLugar, double latitude, double longitude) {
		
		boolean resultado = false;
			
		if(verificaLugar(latitude, longitude)) {
			
			
			lugares.add(new Lugar (tipoDeLugar,nomeDoLugar,latitude,longitude));
			resultado = true;
		}
		
		return resultado;
	}

	private boolean verificaLugar(double latitude, double  longitude) {
		
		boolean resultado = true;
		
			for (Lugar existente : lugares) {
			
			
				if ((latitude == existente.getLatitude()) && (longitude == existente.getLongitude())) {
				
						resultado = false;
				
				}
			}
		
		return resultado;
	}

	@Override
	public ArrayList<Lugar> listarLugares() {
	
		ArrayList<Lugar> lug = new ArrayList<>();
		
		for(Lugar l : lugares) {
			lug.add(l);
		}
		
		return lug;
	}

	@Override
	public boolean buscaLugar(String nome) {
		
		boolean resultado = false;
		
		for(Lugar existente : lugares) {
			
			if (existente.getNomeDoLugar().contentEquals(nome)) {
				
				
				
			}
			
			
		}
		
		
		return resultado;
	}
	
	public double getDistancia(Lugar lugar1, Lugar lugar2) {

		    final int R = 6371;

		    double latDistance = Math.toRadians(lugar1.getLatitude() - lugar2.getLatitude());
		    double lonDistance = Math.toRadians(lugar1.getLongitude() - lugar2.getLongitude());
		    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
		            + Math.cos(Math.toRadians(lugar2.getLatitude())) * Math.cos(Math.toRadians(lugar1.getLatitude()))
		            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		    double distance = R * c * 1000;

		    distance = Math.pow(distance, 2);

		    return Math.sqrt(distance) * 0.001;
	}
	
private void adicionaLugar() {
		
		File lugar = new File("src/lugar.txt");
		Lugar carpina;

		try {

			fileReader = new FileReader(lugar);
			leitor = new BufferedReader(fileReader);
			String linha = leitor.readLine();

			do {

				String[] vamosPorPartes = linha.split(",");
				
				
				lugares.add(new Lugar(vamosPorPartes[0], vamosPorPartes[1], Double.parseDouble(vamosPorPartes[2]), Double.parseDouble(vamosPorPartes[3])));
				

				if (linha != null) {

					linha = leitor.readLine();

				}

			} while (linha != null);

			

		} catch (IOException e) {

			System.out.println("erro" + e.getMessage());
		}
		
	}

public ArrayList<Lugar> getLugares() {
	return lugares;
}
		
}

	
	

