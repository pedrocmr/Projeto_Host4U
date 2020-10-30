package modelo;

import java.time.LocalDate;

public class Pagamento {

	// ATRIBUTOS
	private Reserva reserva;
	private String tipoPagamento;
	private String numeroCartao;
	private String titularCartao;
	private String cvv;
	LocalDate validadeCartao;
	private int parcelas;
	private double valorTotal;

	// CONSTRUTOR
	public Pagamento(Reserva reserva, String tipoPagamento, String numeroCartao, String titularCartao, String cvv,
			LocalDate validadeCartao, int parcelas, double valorTotal) {

		this.reserva = reserva;
		this.tipoPagamento = tipoPagamento;
		this.numeroCartao = numeroCartao;
		this.titularCartao = titularCartao;
		this.cvv = cvv;
		this.validadeCartao = validadeCartao;
		this.parcelas = parcelas;
		this.valorTotal = valorTotal;
	}
	
	public Pagamento() {}

	// GETTERS E SETTERS
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public LocalDate getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(LocalDate validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Pagamento [Reserva: " + reserva + ", Pagamento: " + tipoPagamento + ", Número do Cartão: "
				+ numeroCartao + ", Titular do Cartão: " + titularCartao + ", CVV: " + cvv + ", Validade do Cartão: "
				+ getValidadeCartao() + ", Parcelas: " + parcelas + ", Valor Total = " + valorTotal + "]";
	}

}
