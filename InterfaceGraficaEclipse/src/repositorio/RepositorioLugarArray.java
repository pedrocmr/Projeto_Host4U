package repositorio;

import java.util.ArrayList;

import modelo.Lugar;

public class RepositorioLugarArray implements IRepositorioLugar {
	
	private ArrayList <Lugar> lugares;
	
	public RepositorioLugarArray() {
		
		lugares = new ArrayList<>();
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
	public void listarLugares() {
	
		
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
		
}

	
	

