package modelo;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String Cidade;
	private String estado;
	
	public Endereco (int idHotel) {
		
		if (idHotel == 1) {  				//aqui usei o id do hotel, pensando q todos os hoteis se chamarão Host4U
		
			this.logradouro = "Rua da Aurora";
			this.numero = 6621;
			this.Cidade = "Recife";
			this.estado = "PE";
	
		}
	}

	@Override
	public String toString() {
		return  ""+logradouro + ", numero " + numero + ", " + Cidade + "-" + estado;
	}
}
