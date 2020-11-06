package controlador;

import java.time.LocalDate;

import modelo.Reserva;
import repositorio.RepositorioReservaArray;

public class ControleRelatorioAdmin {
	
	RepositorioReservaArray repo;
	
	
	Reserva dias;
	LocalDate checkIn = dias.getCheckin();
	
	
	public int QuantidadeTotalReservas() {
		
	
		int totalReservas = 0;
		for(Reserva r : repo.getReservas()) {
			
			totalReservas++;
			r.getUsuario();
		 
		}
		
		
		return totalReservas;
	}
	
	
	
	
	
}
