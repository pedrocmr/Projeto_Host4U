package modelo;

import java.util.ArrayList;

public class Hotel {

	private String nome;
	private int idHotel;
	private Endereco endereco;
	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	private int andares;
	private Lugar lugar;
	private Integer qtdQuartos = quartos.size();

	public Hotel(String nome, int idHotel, int andares, Lugar lugar, Integer qtdQuartos, Endereco endereco) {

		this.nome = nome;
		this.idHotel = idHotel;
		this.andares = andares;
		this.endereco = endereco;
		this.lugar = lugar;
		this.qtdQuartos = qtdQuartos;

	}
	
	public Hotel() {
		
	}
	
	public Integer getQtdQuartos() {
		return qtdQuartos;
	}
	public void setQtdQuartos(Integer novaqtdQuartos) {
		this.qtdQuartos = novaqtdQuartos;
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
	
	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public boolean equals(Hotel hotel) {
		if (this == hotel)
			return true;
		if (hotel == null)
			return false;
		
		if (idHotel != hotel.idHotel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Id.Hotel: " + idHotel + ", Endere�o: " + endereco + ", Quartos: "
				+ qtdQuartos + ", Andares: " + andares + ", Lugares Pr�ximos: " + lugar;
	}

}
