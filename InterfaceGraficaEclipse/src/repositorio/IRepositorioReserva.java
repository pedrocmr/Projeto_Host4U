package repositorio;

import modelo.Reserva;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);
	
	boolean cancelarReserva(Reserva reservaCancela);
	
	void listarReservas();
	
	void remarcarReserva();
}
