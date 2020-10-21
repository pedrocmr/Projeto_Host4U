package repositorio;

import java.util.ArrayList;

import modelo.Reserva;

public class RepositorioReservaArray implements IRepositorioReserva {

	ArrayList<Reserva> reservas;

	public RepositorioReservaArray() {

		this.reservas = new ArrayList<Reserva>();
	}

	@Override
	public boolean addReserva(Reserva novaReserva) {
		boolean resultado = false;
		
		if (novaReserva != null) {
			
			boolean jaReservada = false;
			
			for (Reserva nova : reservas) {

				if (nova.getQuarto().getHotel().equals(novaReserva.getQuarto().getHotel()) == true) {
					
				
					if(nova.getQuarto().getNumero() == novaReserva.getQuarto().getNumero()){
					
					if((novaReserva.getCheckin().isBefore(nova.getCheckin()) == true) &&
						(novaReserva.getCheckout().isBefore(nova.getCheckin()) == true) ||
						novaReserva.getCheckin().isAfter(nova.getCheckout()) == true) {
						
						reservas.add(novaReserva);
						
						}else {
							
							jaReservada = true;
						}
					
					}
					
					
					if(jaReservada == false) {
						
						reservas.add(novaReserva);
					
					}else {
						
						if(reservas.contains(novaReserva)) {
							
							reservas.remove(novaReserva);						}
					}
				
				}
				
			}
		}
		
		
		
		return resultado;
		
	}

	@Override
	public boolean cancelarReserva() {

		return false;
	}

	@Override
	public void listarReservas() {
		for (Reserva r : reservas) {
			System.out.println(r);
		}

	}

	@Override
	public void remarcarReserva() {

	}

}
