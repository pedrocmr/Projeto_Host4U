package repositorio;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.ArrayList;

=======
>>>>>>> parent of fd150d3... Merge branch 'DEV-Telas_Renan'
import modelo.Reserva;
import modelo.Usuario;

public interface IRepositorioReserva {

	boolean addReserva(Reserva reserva);
<<<<<<< HEAD

	boolean cancelarReserva(Reserva reservaCancela);

	ArrayList<Reserva> listarReservasUsuario(Usuario usuario);

	void remarcarReserva(LocalDate checkin, LocalDate checkout);
=======
	
	boolean cancelarReserva(Reserva reservaCancela);
	
	void listarReservas();
	
	boolean remarcarReserva(Reserva reservaCancela, Reserva reservaRemarca);
>>>>>>> parent of fd150d3... Merge branch 'DEV-Telas_Renan'
}
