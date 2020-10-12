package modelo;

import java.util.ArrayList;

public abstract class EsqueletoHotel { //todos hoteis vao herdar essa classe, no projeto acho q uns 3 tá bom
	
	

	private String nome;
	private Endereco endereco;
	private int idHotel;
	private int qtdQuartos;
	private ArrayList<Quarto> quartos; //a correção q o prof mandou
	private int andares;
	private ArrayList <LugarProximo> lugaresProximos; //aqui pensei q uma lista de lugares podia ser melhor, pois podem ter novos lugares
													 //surgindo e ter varios lugares legais por perto, antes só podia ser um
													//falta um getLugares proximos
									
	public EsqueletoHotel() {}
	public EsqueletoHotel(String nome, int idHotel, int qtdQuartos, int andares, LugarProximo lugarProximo) {
		
		this.nome = nome;
		this.idHotel = idHotel;
		this.qtdQuartos = qtdQuartos;
		this.endereco = new Endereco();			
		this.quartos = new ArrayList<>(qtdQuartos);	//aloca uma quantidade inicial de quartos
		this.andares = andares;
		this.lugaresProximos = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public ArrayList<Quarto> getQuartos() { 
			return quartos;
	}
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public void adicionaQuartos(Quarto... quarto) { //esse tipo de implementação permite adicionar um ou mais quartos (...) 
		
		for (Quarto q : quarto) {
			
			this.quartos.add(q);
		}
	}
	

	

}
