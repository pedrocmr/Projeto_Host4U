package controlador;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import modelo.Pagamento;

public class ControlePagamento {

	Pagamento pagamento;

	public ControlePagamento(Pagamento p) {
		this.pagamento = p;
	}

	// M�TODO QUE CALCULA O TOTAL A SER PAGO
	public double totalPagamento() {

		double cont = (pagamento.getReserva().getCheckin().until(pagamento.getReserva().getCheckout(),
				ChronoUnit.DAYS));
		pagamento.setValorTotal(pagamento.getReserva().getValorReserva() * Math.abs(cont)); // PRECISA PEGAR O VALOR DA
																							// RESERVA DO QUARTO
		return pagamento.getValorTotal();
	}

	// M�TODO QUE VERIFICA SE O CART�O � V�LIDO
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

	// M�TODO QUE DIZ SE A RESERVA FOI APROVADA
	public String aprovacao() {

		if (verificaCartao() == true) {
			return "Transa��o Aprovada!";
		}

		else {
			return "Cart�o Inv�lido!";
		}
	}
}
