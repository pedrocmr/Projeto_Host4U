package repositorio;

import java.util.ArrayList;

import modelo.Reserva;

public interface IRepositorioReserva {

	
	ArrayList<Reserva> listarReservas(String usuarioCpf);
	
	ArrayList<Reserva> listarTodasReservas();
	
	ArrayList<Reserva> listarReservas (int idHotel);
	
}
