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
		pagamento.setValorTotal(pagamento.getReserva().getQuarto().getValorReserva() * Math.abs(cont));

		return pagamento.getValorTotal();
	}

	// MÉTODO QUE VERIFICA SE O CARTÃO É VÁLIDO
	public boolean verificaCartao() {

		LocalDate data = LocalDate.now();

		if (pagamento.getNumeroCartao().length() == 16 
				&& !pagamento.getNumeroCartao().equals("0000000000000000")
				&& !pagamento.getNumeroCartao().equals("1111111111111111")
				&& !pagamento.getNumeroCartao().equals("2222222222222222")
				&& !pagamento.getNumeroCartao().equals("3333333333333333")
				&& !pagamento.getNumeroCartao().equals("4444444444444444")
				&& !pagamento.getNumeroCartao().equals("5555555555555555")
				&& !pagamento.getNumeroCartao().equals("6666666666666666")
				&& !pagamento.getNumeroCartao().equals("7777777777777777")
				&& !pagamento.getNumeroCartao().equals("8888888888888888")
				&& !pagamento.getNumeroCartao().equals("9999999999999999")) {
			if (pagamento.getCvv().length() == 3) {
				if (pagamento.getValidadeCartao().getYear() > data.getYear()) {

				}
			}
			return true;
		}

		else if (pagamento.getNumeroCartao().length() == 16 
				&& !pagamento.getNumeroCartao().equals("0000000000000000")
				&& !pagamento.getNumeroCartao().equals("1111111111111111")
				&& !pagamento.getNumeroCartao().equals("2222222222222222")
				&& !pagamento.getNumeroCartao().equals("3333333333333333")
				&& !pagamento.getNumeroCartao().equals("4444444444444444")
				&& !pagamento.getNumeroCartao().equals("5555555555555555")
				&& !pagamento.getNumeroCartao().equals("6666666666666666")
				&& !pagamento.getNumeroCartao().equals("7777777777777777")
				&& !pagamento.getNumeroCartao().equals("8888888888888888")
				&& !pagamento.getNumeroCartao().equals("9999999999999999")) {
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
}
