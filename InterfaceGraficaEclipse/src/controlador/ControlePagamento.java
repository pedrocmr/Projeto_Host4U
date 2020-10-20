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

			double cont = (reserva.checkin.until(reserva.checkout, ChronoUnit.DAYS));
			this.valorTotal = quarto.getValorReserva() * Math.abs(cont);
			return this.valorTotal;
		}

		// M�TODO QUE VERIFICA SE O CART�O � V�LIDO
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
