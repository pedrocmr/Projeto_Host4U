package modelo;

public class Quarto {

	private int ocupacaoMaximaPessoas;
	private int andar;
	private int numero;
	private String preferenciaCamas;
	private boolean suite;
	private int numeroCamas;
	private double valorReserva;

	public Quarto(int numero, int andar, int ocupacaoMaximaPessoas, boolean suite, boolean valorSuite, double valorDiariaUnidade, double valorDeAdicaoPorPessoa) {

		
		
		if (ocupacaoMaximaPessoas > 1) {
			
			this.valorReserva = ocupacaoMaximaPessoas*valorDeAdicaoPorPessoa;
		}else {
			
			ocupacaoMaximaPessoas = 1;
		}
		
		if (andar < 0) {
			andar = 0;
		}
		if (numero < 0) {
			
			numero*=-1;
		}
		
		this.numero = numero;
		this.andar = andar;
		this.ocupacaoMaximaPessoas = ocupacaoMaximaPessoas;
		this.suite = suite;
		this.valorReserva = valorDiariaUnidade;
		
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

	public void setPreferenciaCamas(String preferenciaCamas) { // aqui vai ter q ser implementado junto cm alguma opção
																// de usuario, ainda n sei como
		this.preferenciaCamas = preferenciaCamas;
	}

	public boolean isSuite() {
		return suite;
	}

	public void setSuite(boolean suite) {
		this.suite = suite;
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

	public void setValorReserva(double valorReserva) { // falta colocar uma relação entre numero de ocupaçao maxima

		
		if (this.suite == false) {

			this.valorReserva = valorReserva;

		} else {

			this.valorReserva += 100;
		}
	}

	@Override
	public String toString() {
		return "Ocupação máxima de " + ocupacaoMaximaPessoas + ", no " + andar + "º andar. Suite"+suite
				+ ", numeroCamas=" + numeroCamas + ", valorReserva=" + valorReserva + "]";
	}

}
