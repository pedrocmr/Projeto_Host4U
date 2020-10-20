package modelo;

import java.util.ArrayList;

public class Hotel {
	
	private String nome;
	private int idHotel;
	private Endereco endereco;
	private ArrayList<Quarto> quartos; // a corre��o q o prof mandou
	private int andares;
	private LugarProximo lugarProximo;
	
	
		
	public Hotel(String nome, int idHotel, int andares, LugarProximo lugarProximo) {
		
		this.nome = nome;
		this.idHotel = idHotel;
		this.andares = andares;
		this.endereco = new Endereco();
		this.lugarProximo = lugarProximo;
		
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
	
	public LugarProximo getLugarProximo() {
		return this.lugarProximo;
	}
	
	public void setLugarProximo(LugarProximo lp) {
		this.lugarProximo = lp;
	}



	
	
	
	
}
