package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reserva extends EsqueletoHotel{

	private int quantidadeResevas;
	private Usuario usuario;
	LocalDateTime checkin;
	LocalDateTime checkout;
	private ArrayList<Reserva> reservas;
	private int cancelar;
	
	//CONSTRUTOR
	public Reserva(Usuario usuario,LocalDateTime checkin, LocalDateTime checkout) {
		
		super();
		
		this.usuario = usuario;
		this.checkin = checkin;
		this.checkout = checkout;
		this.reservas = new ArrayList<>();
	}

	//METODOS GETTERS E SETTERS
	public int getQuantidadeResevas() {
		return quantidadeResevas;
	}

	public Reserva(String nome, int idHotel, int qtdQuartos, int andares, LugarProximo lugarProximo) {
		super(nome, idHotel, qtdQuartos, andares, lugarProximo);
		// TODO Auto-generated constructor stub
	}

	public void setQuantidadeResevas(int quantidadeResevas) {
		this.quantidadeResevas = quantidadeResevas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDateTime checkin) {
		this.checkin = checkin;
	}

	public LocalDateTime getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDateTime checkout) {
		this.checkout = checkout;
	}
	
	public boolean verificaDisponiblidadeQuartos() {
		
		if(getQuartos().size() > 0) {
			
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	public int adicionarReservas() {
		
		if(verificaDisponiblidadeQuartos() == true) {
			this.quantidadeResevas++;
		}
		
		return this.quantidadeResevas;
	}
	
	public void reservar(Reserva... reservas) {
		for(Reserva res : reservas) {
			this.reservas.add(res);
			
		}
	}
	
	public void cancelar(int cancelar) {
		for(Reserva res : reservas) {
			this.reservas.remove(cancelar);
			
		}
	}
}
