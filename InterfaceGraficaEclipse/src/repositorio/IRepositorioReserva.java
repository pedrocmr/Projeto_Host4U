package repositorio;

import java.util.ArrayList;

import modelo.Reserva;
import modelo.Usuario;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);

	boolean cancelarReserva(Reserva reservaCancela);

	ArrayList<Reserva> listarReservasUsuario(Usuario usuario);

}
