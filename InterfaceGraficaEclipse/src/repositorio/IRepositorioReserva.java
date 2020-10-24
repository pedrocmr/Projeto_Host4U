package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Reserva;
import modelo.Usuario;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);

	boolean cancelarReserva(Reserva reservaCancela);

	ArrayList<Reserva> listarReservasUsuario(Usuario usuario);

	void remarcarReserva(LocalDate checkin, LocalDate checkout);
}
