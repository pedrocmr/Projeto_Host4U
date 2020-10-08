package modelo;

public class Teste {

	public static void main(String[] args) {
		
		LugarProximo portoDeGalinhas = new LugarProximo("Porto de Galinhas", "Praia", 8);
		
		Hotel hotel = new Hotel(1, 100,20, portoDeGalinhas);
		
		Quarto q1 = new Quarto(1,1,3,false);
		Quarto q2 = new Quarto(1,1,3,true);
		
		hotel.adicionaQuartos(q1,q2);
		System.out.println(hotel.getQuartos());
	}

}
