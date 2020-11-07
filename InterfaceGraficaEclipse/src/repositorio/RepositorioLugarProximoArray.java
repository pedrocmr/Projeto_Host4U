package repositorio;

import java.util.ArrayList;

import modelo.Hotel;
import modelo.Lugar;
import modelo.LugarProximo;

public class RepositorioLugarProximoArray {
	
	
	private ArrayList<LugarProximo> lugaresProximos;
	
	public boolean adicionaLugaresProximos(Hotel hotel, Lugar lugar) {
		
		boolean resultado = false;
		
		if (verificaLugaresProximos(lugar.getLatitude(), lugar.getLongitude())) {
			
			
			lugaresProximos.add(new LugarProximo(hotel, lugar));
			resultado = true;
		}
		
		
		return resultado;
	}
	
	private boolean verificaLugaresProximos(double latitude, double longitude) {
		
		boolean resultado = true;
		
		for (LugarProximo existente : lugaresProximos) {

			if((existente.getLugar().getLatitude() == latitude) && (existente.getLugar().getLongitude() == longitude)) {
				
				resultado = false;
				
			}
		}
	
		return resultado;
	}

	public ArrayList<LugarProximo> getLugaresProximos() {
		return lugaresProximos;
	}

}
