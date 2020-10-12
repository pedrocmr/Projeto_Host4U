package modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pagamento {

	// ATRIBUTOS
	private Reserva reserva;
	private Quarto quarto;
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

		SimpleDateFormat formatador = new SimpleDateFormat("MM/YYYY");
		String resultado = formatador.format(this.validadeCartao);
		return resultado;
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

	// MÉTODO QUE CALCULA O TOTAL A SER PAGO
	public double totalPagamento() {

		double cont = (reserva.checkin.until(reserva.checkout, ChronoUnit.DAYS));
		this.valorTotal = quarto.getValorReserva() * Math.abs(cont);
		return this.valorTotal;
	}

	// MÉTODO QUE VERIFICA SE O CARTÃO É VÁLIDO
	public boolean verificaCartao() {

		LocalDate data = LocalDate.now();

		if (numeroCartao.length() == 16) {
			if (cvv.length() == 3) {
				if (validadeCartao.getYear() > data.getYear()) {

				}
			}
			return true;
		}

		else if (numeroCartao.length() == 16) {
			if (cvv.length() == 3) {
				if (validadeCartao.getYear() == data.getYear()) {
					if (validadeCartao.until(data, ChronoUnit.MONTHS) >= 0)
						;
				}
			}
			return true;
		}

		else {
			return false;
		}
	}

	// MÉTODO QUE DIZ SE A RESERVA FOI APROVADA
	public void aprovacao() {

		if (verificaCartao() == true) {
			System.out.println("Reserva efeatuada!");
		}

		else {
			System.out.println("Reserva não efetuada");
		}
	}

}
