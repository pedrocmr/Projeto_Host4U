package repositorio;


import java.util.ArrayList;

import modelo.Endereco;
import modelo.Hotel;
import modelo.Lugar;

public class RepositorioHotelArray implements IRepositorioHotel {
	
	private ArrayList <Hotel> hoteis;
	private Lugar l1;
	private Endereco end1;
	private Lugar l2;
	private Endereco end2;
	private Lugar l3;
	private Endereco end3;
	
		public RepositorioHotelArray() {

			hoteis = new ArrayList<Hotel>();
			
			l1 = new Lugar("Praia", "Porto de Galinhas", 50, 60);
			end1 = new Endereco("Rua do amor", 566, "Ipojuca", "PE");
			hoteis.add(new Hotel("Hotel Beira Mar", 1, 20, l1, 130, end1));
			
			l2 = new Lugar("Praia", "Boa Viagem", 100, 160);
			end2 = new Endereco("Avenida Boa Viagem", 235, "Recife", "PE");
			hoteis.add(new Hotel("Hotel Varanda", 2, 23, l2, 160, end2));
			
			l3 = new Lugar("Praia", "Tamandaré", 170, 290);
			end3 = new Endereco("Rua das Ostras", 669, "Tamandaré", "PE");
			hoteis.add(new Hotel("Hotel Urbano ", 3, 10, l3, 100, end3));
		}

		public ArrayList<Hotel> getHoteis() {
			return hoteis;
		}


		public void setHoteis(ArrayList<Hotel> hoteis) {
			this.hoteis = hoteis;
		}


		public ArrayList<Hotel> listarHoteis() {
			ArrayList<Hotel> ht = new ArrayList<Hotel>();
			for(Hotel h : hoteis) {
				ht.add(h);
			}

			return ht;
		}
		
		public ArrayList<Hotel> listarHoteisBV(){
			
			ArrayList<Hotel> bv = new ArrayList<Hotel>();
			
			for(Hotel h : hoteis) {
				if(h.getIdHotel() == 2) {
				bv.add(h);
				}
			}
				
			return bv;
		}
		
		public ArrayList<Hotel> listarHoteisTM() {

			ArrayList<Hotel> tm = new ArrayList<Hotel>();

			for (Hotel h : hoteis) {
				if (h.getIdHotel() == 3) {
					tm.add(h);
				}
			}

			return tm;
		}
		
		public ArrayList<Hotel> listarHoteisPG() {

			ArrayList<Hotel> pg = new ArrayList<Hotel>();

			for (Hotel h : hoteis) {
				if (h.getIdHotel() == 1) {
					pg.add(h);
				}
			}

			return pg;
		}
		
	}

