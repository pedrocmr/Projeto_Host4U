package modelo;

public class Quarto {

	private Integer ocupacaoMaximaPessoas;
	private Integer andar;
	private Integer numero;
	private Hotel hotel;
	private String preferenciaCamas;
	private double valorSuite;
	private Integer numeroCamas;
	private double valorReserva;

	public Quarto(Integer numero, Integer andar, Hotel hotel, Integer ocupacaoMaximaPessoas, double valorSuite,
			double valorDiariaUnidade, double valorDeAdicaoPorPessoa) {

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

	public Quarto() {
		
	}
	public Integer getOcupacaoMaximaPessoas() {
		return ocupacaoMaximaPessoas;
	}

	public void setOcupacaoMaximaPessoas(Integer ocupacaoMaximaPessoas) {
		this.ocupacaoMaximaPessoas = ocupacaoMaximaPessoas;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getPreferenciaCamas() {
		return preferenciaCamas;
	}

	public void setPreferenciaCamas(String preferenciaCamas) {
		this.preferenciaCamas = preferenciaCamas;
	}

	public Double getValorSuite() {
		return valorSuite;
	}

	public void setValorSuite(Double valorSuite) {
		this.valorSuite = valorSuite;
	}

	public Integer getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(Integer numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public double getValorReserva() {
		return valorReserva;
	}

	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	}

	public boolean equals(Quarto quarto) {
		if (this == quarto)
			return true;
		if (quarto == null)
			return false;

		if (this.getHotel().equals(quarto.getHotel()) == true) {

			if ((this.getNumero() == quarto.getNumero())) {

				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Ocupação máxima de pessoas: " + ocupacaoMaximaPessoas + ", Andar: " + andar + ", Número: " + numero
				+ ", Valor da suíte: " + valorSuite + ", Número de camas: " + numeroCamas + ", Valor da reserva: "
				+ valorReserva;
	}

}
