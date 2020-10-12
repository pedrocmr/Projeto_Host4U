package modelo;

import java.time.LocalDate;

public class Reserva extends EsqueletoHotel{

	private int quantidadeResevas;
	private Usuario usuario;
	LocalDate checkin;
	LocalDate checkout;
	
	//CONSTRUTOR
	public Reserva(Usuario usuario,LocalDate checkin, LocalDate checkout) {
		
		super();
		
		this.usuario = usuario;
		this.checkin = checkin;
		this.checkout = checkout;
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

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
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
}
