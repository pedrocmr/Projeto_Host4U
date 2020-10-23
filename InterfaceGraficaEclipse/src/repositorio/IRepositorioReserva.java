package repositorio;

import modelo.Reserva;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);
	
	boolean cancelarReserva(Reserva reservaCancela);
	
	void listarReservas();
	
	boolean remarcarReserva(Reserva reservaCancela, Reserva reservaRemarca);
}
