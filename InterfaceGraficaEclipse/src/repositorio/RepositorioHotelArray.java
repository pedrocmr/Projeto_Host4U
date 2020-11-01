package repositorio;


import java.util.ArrayList;

import modelo.Endereco;
import modelo.Hotel;
import modelo.Lugar;

public class RepositorioHotelArray implements IRepositorioHotel {
	private ArrayList <Hotel> hoteis;
	private Lugar l1;
	private Endereco end1;

		public RepositorioHotelArray() {

			hoteis = new ArrayList<Hotel>();
			l1 = new Lugar("Praia", "Porto de Galinhas", 50, 60);
			end1 = new Endereco("Rua do amor", 566, "Ipojuca", "PE");
			hoteis.add(new Hotel("Hotel Beira Mar", 1, 20, l1, 130, end1));
			
			Lugar l2 = new Lugar("Praia", "Boa Viagem", 80, 100);
			Endereco end2 = new Endereco("Rua da Ostra", 643, "Recife", "PE");
			hoteis.add(new Hotel("Hotel Tubarão", 2, 20, l2, 40, end2));
			
			Lugar l3 = new Lugar("Praia", "Carneiro", 20, 40);
			Endereco end3 = new Endereco("Rua do amor", 403, "Tamandaré", "PE");
			hoteis.add(new Hotel("Hotel Pé na Areia", 3, 10, l3, 20, end3));
		}

		public ArrayList<Hotel> listarHoteis() {
			ArrayList<Hotel> ht = new ArrayList<Hotel>();
			for(Hotel h : hoteis) {
				ht.add(h);
			}

			return ht;
		}
		
		public ArrayList<Hotel> listarHoteisPG(){
			ArrayList<Hotel> PG = new ArrayList<Hotel>();
			for(Hotel h : hoteis) {
				if(h.getIdHotel() == 1){
					PG.add(h);
				}
				
			}

			return PG;
			
		}
		
		public ArrayList<Hotel> listarHoteisBV(){
			ArrayList<Hotel> BV = new ArrayList<Hotel>();
			for(Hotel h : hoteis) {
				if(h.getIdHotel() == 2){
					BV.add(h);
				}
				
			}

			return BV;
			
		}
		
		public ArrayList<Hotel> listarHoteisTM(){
			ArrayList<Hotel> TM = new ArrayList<Hotel>();
			for(Hotel h : hoteis) {
				if(h.getIdHotel() == 3){
					TM.add(h);
				}
				
			}

			return TM;
			
		}
	}

