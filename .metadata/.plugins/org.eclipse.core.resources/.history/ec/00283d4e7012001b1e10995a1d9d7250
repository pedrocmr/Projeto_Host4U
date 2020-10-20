package modelo;

import java.util.ArrayList;

public class Hotel {
	
	private String nome;
	private int idHotel;
	private int qtdQuartos;
	private Endereco endereco;
	private ArrayList<Quarto> quartos; // a correção q o prof mandou
	private int andares;
	private ArrayList<LugarProximo> lugaresProximos;
	
		
	public Hotel(String nome, int idHotel, int qtdQuartos, int andares) {
		
		this.nome = nome;
		this.idHotel = idHotel;
		this.qtdQuartos = qtdQuartos;
		this.andares = andares;
		this.lugaresProximos = new ArrayList<>();		
		this.endereco = new Endereco();
		this.quartos = new ArrayList<>(qtdQuartos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public ArrayList<LugarProximo> getLugaresProximos() {
		return lugaresProximos;
	}

	
	
	
	
}
