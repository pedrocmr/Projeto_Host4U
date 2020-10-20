package repositorio;

import java.util.ArrayList;

import modelo.Reserva;

public class RepositorioReservaArray implements IRepositorioReserva {

	ArrayList<Reserva> reservas;

	@Override
	public void addReserva() {

		// reservas.add();
	}

	@Override
	public void cancelarReserva() {

		// reservas.remove();
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
