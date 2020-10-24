package repositorio;

import java.util.ArrayList;
import modelo.Reserva;

public class RepositorioReservaArray implements IRepositorioReserva {

	ArrayList<Reserva> reservas;

	public RepositorioReservaArray() {

		this.reservas = new ArrayList<Reserva>();
	}


	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	@Override
	public ArrayList<Reserva> listarTodasReservas() {
		
		
		return reservas;

	}

	@Override
	public ArrayList<Reserva> listarReservas(String cpf) {
		
		
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")||
		        cpf.equals("33333333333") || cpf.equals("44444444444") ||
		        cpf.equals("55555555555") || cpf.equals("66666666666") ||
		        cpf.equals("77777777777") || cpf.equals("88888888888") ||
		        cpf.equals("99999999999") || (cpf.length() != 11)){
		             
				return null;
			}
		
		ArrayList<Reserva> reservasPorUsuario = new ArrayList<>();
		
		for (Reserva existente : reservas) {
			
			if(existente.getUsuario().getCpf().equals(cpf)) {
				
				reservasPorUsuario.add(existente);
			}
		}
		
		return reservasPorUsuario;
	}

	@Override
	public ArrayList<Reserva> listarReservas(int idHotel) {
		
		if(idHotel < 0) {
			
			idHotel *= -1;
		}
		
		ArrayList<Reserva> reservasPorHotel = new ArrayList<>();
		
		for (Reserva existente : reservas) {
			
			if(existente.getQuarto().getHotel().getIdHotel() == idHotel) {
				
				reservasPorHotel.add(existente);
			}
		}
		
		return reservasPorHotel;		
	}
}