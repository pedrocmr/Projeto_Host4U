package modelo;

import java.util.ArrayList;

public class Hotel {

	private String nome;
	private int idHotel;
	private Endereco endereco;
	private ArrayList<Quarto> quartos;
	private int andares;
	private Lugar lugar;

	public Hotel(String nome, int idHotel, int andares, Lugar lugar) {

		this.nome = nome;
		this.idHotel = idHotel;
		this.andares = andares;
		this.endereco = new Endereco();
		this.lugar = lugar;

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
		return this.lugar;
	}

	public void setLugarProximo(Lugar lugar) {
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
		return "Nome: " + nome + ", Id.Hotel: " + idHotel + ", Endereço: " + endereco + ", Quartos: "
				+ quartos.size() + ", Andares: " + andares + ", Lugares Próximos: " + lugar;
	}

}
