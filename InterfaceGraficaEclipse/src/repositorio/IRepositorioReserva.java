package repositorio;

import modelo.Reserva;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);
	
	boolean cancelarReserva();
	
	void listarReservas();
	
	void remarcarReserva();
}
