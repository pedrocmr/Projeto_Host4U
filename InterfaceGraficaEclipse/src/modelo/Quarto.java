package modelo;

import java.util.ArrayList;

public class Quarto {

	private int ocupacaoMaximaPessoas;
	private int andar;
	private int numero;
	private String preferenciaCamas;
	private ArrayList<Reserva> reserva;
	private double valorSuite;
	private int numeroCamas;
	private double valorReserva;

	public Quarto(int numero, int andar, int ocupacaoMaximaPessoas, double valorSuite, double valorDiariaUnidade, double valorDeAdicaoPorPessoa) {

		this.valorSuite = valorSuite;
		this.valorReserva = valorDiariaUnidade;
		
		if (ocupacaoMaximaPessoas > 1) {
			
			this.valorReserva += ocupacaoMaximaPessoas*valorDeAdicaoPorPessoa + valorSuite;
		}else {
			
			ocupacaoMaximaPessoas = 1;
		}
		
		if (andar < 0) {
			andar = 0;
		}
		if (numero < 0) {
			
			numero*=-1;
		}
		
		reserva = new ArrayList<>();
		this.numero = numero;
		this.andar = andar;
		this.ocupacaoMaximaPessoas = ocupacaoMaximaPessoas;
		
		
	}

	public int getOcupacaoMaximaPessoas() {
		return ocupacaoMaximaPessoas;
	}

	public void setOcupacaoMaximaPessoas(int ocupacaoMaximaPessoas) {
		this.ocupacaoMaximaPessoas = ocupacaoMaximaPessoas;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPreferenciaCamas() {
		return preferenciaCamas;
	}

	public ArrayList<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(ArrayList<Reserva> reserva) {
		this.reserva = reserva;
	}

	public double getValorSuite() {
		return valorSuite;
	}

	public void setValorSuite(double valorSuite) {
		this.valorSuite = valorSuite;
	}

	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	}

	public void setPreferenciaCamas(String preferenciaCamas) { // aqui vai ter q ser implementado junto cm alguma opção
																// de usuario, ainda n sei como
		this.preferenciaCamas = preferenciaCamas;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public double getValorReserva() {
		return valorReserva;
	}


	@Override
	public String toString() {
		return "Ocupação máxima de " + ocupacaoMaximaPessoas + ", no " + andar + "º andar. NumeroCamas=" + numeroCamas + ", valorReserva=" + valorReserva;
	}

}
