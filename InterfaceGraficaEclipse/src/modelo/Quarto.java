package modelo;

public class Quarto {

	private int ocupacaoMaximaPessoas;
	private int andar;
	private int numero;
	private Hotel hotel;
	private String preferenciaCamas;
	private double valorSuite;
	private int numeroCamas;
	private double valorReserva;

	public Quarto(int numero, int andar, Hotel hotel, int ocupacaoMaximaPessoas, double valorSuite, double valorDiariaUnidade,
			double valorDeAdicaoPorPessoa) {

		this.valorSuite = valorSuite;
		this.valorReserva = valorDiariaUnidade;

		if (ocupacaoMaximaPessoas > 1) {

			this.valorReserva += ocupacaoMaximaPessoas * valorDeAdicaoPorPessoa + valorSuite;
		} else {

			ocupacaoMaximaPessoas = 1;
		}

		if (andar < 0) {
			andar = 0;
		}
		if (numero < 0) {

			numero *= -1;
		}

		this.hotel = hotel;
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
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
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


	public double getValorSuite() {
		return valorSuite;
	}

	public void setValorSuite(double valorSuite) {
		this.valorSuite = valorSuite;
	}

	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	}

	public void setPreferenciaCamas(String preferenciaCamas) {

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
	
	
	public boolean equals(Quarto quarto) {
		if (this == quarto)
			return true;
		if (quarto == null)
			return false;
		
		if (this.getHotel().equals(quarto.getHotel()) == true){
			
			if( (this.getNumero() == quarto.getNumero())) {

				
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Ocupação máxima de pessoas: " + ocupacaoMaximaPessoas + ", Andar: " + andar + ", Número: "
				+ numero + ", Valor da suíte: " + valorSuite + ", Número de camas: "
				+ numeroCamas + ", Valor da reserva: " + valorReserva;
	}

}
