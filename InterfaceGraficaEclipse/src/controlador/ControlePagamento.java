package controlador;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import modelo.Pagamento;

public class ControlePagamento {

	Pagamento pagamento;

	public ControlePagamento(Pagamento p) {
		this.pagamento = p;
	}

	// MÉTODO QUE CALCULA O TOTAL A SER PAGO
	public double totalPagamento() {

		double cont = (pagamento.getReserva().getCheckin().until(pagamento.getReserva().getCheckout(),
				ChronoUnit.DAYS));
		pagamento.setValorTotal(pagamento.getReserva().getValorReserva() * Math.abs(cont)); // PRECISA PEGAR O VALOR DA
																							// RESERVA DO QUARTO
		return pagamento.getValorTotal();
	}

	// MÉTODO QUE VERIFICA SE O CARTÃO É VÁLIDO
	public boolean verificaCartao() {

		LocalDate data = LocalDate.now();

		if (pagamento.getNumeroCartao().length() == 16) {
			if (pagamento.getCvv().length() == 3) {
				if (pagamento.getValidadeCartao().getYear() > data.getYear()) {

				}
			}
			return true;
		}

		else if (pagamento.getNumeroCartao().length() == 16) {
			if (pagamento.getCvv().length() == 3) {
				if (pagamento.getValidadeCartao().getYear() == data.getYear()) {
					if (pagamento.getValidadeCartao().until(data, ChronoUnit.MONTHS) >= 0)
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
	public String aprovacao() {

		if (verificaCartao() == true) {
			return "Transação Aprovada!";
		}

		else {
			return "Cartão Inválido!";
		}
	}
}
