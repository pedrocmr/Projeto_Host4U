package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import modelo.Reserva;
import modelo.Usuario;
import repositorio.RepositorioReservaArray;

public class ControleReserva {

	RepositorioReservaArray repo;
	private FileWriter fileWriter;
	private FileReader fileReader;
	private BufferedReader leitor;
	private BufferedWriter escrever;

	public ControleReserva() {
		
		repo = new RepositorioReservaArray();
	}

	// MÉTODO PARA PREENCHER RESERVAS
	public boolean addReserva(Reserva novaReserva) {
		
		boolean resultado = false;
		
		if (novaReserva != null) {
			
			boolean jaReservada = false;
			
			for (Reserva existente : repo.getReservas()) {

				if (existente.getQuarto().getHotel().equals(novaReserva.getQuarto().getHotel()) == true) {
					
				
					if(existente.getQuarto().getNumero() == novaReserva.getQuarto().getNumero()){
					
						if((novaReserva.getCheckin().isBefore(existente.getCheckin()) == true) &&
							(novaReserva.getCheckout().isBefore(existente.getCheckin()) == true) ||
							novaReserva.getCheckin().isAfter(existente.getCheckout()) == true) {
						
						}else {
							
							jaReservada = true;
						}
					}
						
					if(jaReservada == false) {
						
						repo.getReservas().add(novaReserva);
					
						resultado = true;
					}			
				}
			}
		}
		
		
		
		return resultado;
		

	} //fim da adiciona reserva
	
	public boolean verificaReserva(Reserva reserva) {
		boolean resultado = false;
		File arquivo = new File("src/reserva.txt");
		
		try {
			
			
			fileReader = new FileReader(arquivo);
			leitor = new BufferedReader(fileReader);
			String linha = leitor.readLine();
			
			do {
				
				String [] vamosPorPartes = linha.split(",");
				
				
				if (reserva.getCheckin().equals(vamosPorPartes[2]) && reserva.getCheckout().equals(vamosPorPartes[3]) ) { //se já houver essa data
					
					resultado = false;
				}
				
				if (linha != null) {
					
					linha = leitor.readLine();
				
				}
				
			}while(linha != null);
		
		} catch (IOException e) {
			
			System.out.println("erro" + e.getMessage());
		}
		
		return resultado;
		
	}//fim da verifica reserva

	// MÉTODO CANCELAR RESERVAS
	public boolean cancelaReserva(Usuario usuario, Reserva reservaCancela) {
		
		if(reservaCancela == null) { 
			
			return false;
		}
			
		boolean resultado = false;
		
		for (Iterator<Reserva> iterator = repo.getReservas().iterator(); iterator.hasNext();) {
				
			Reserva existente = iterator.next();
				
				if(existente.equals(reservaCancela)) {
					
					iterator.remove();
					resultado = true;
				}
			}
		
		return resultado;
		
	}

	// MÉTODO REMARCAR RESERVAS
	public boolean remarcarReserva(Usuario usuario, Reserva reservaCancela, Reserva reservaRemarca) {

		if (usuario == null || reservaCancela == null || reservaRemarca == null) {
			
			return false;
		}
		
		boolean resultado = false;
		
		if (cancelaReserva(usuario, reservaCancela)) {
			
			//cadastrado
			
			if (addReserva(reservaRemarca)) {
				
				resultado = true;
			}
		
		}/*else {
			
			naoCadastrado = true;
		}
		
		boolean naoCadastrado = false;
		
		if(naoCadastrado) { 
		 * 
		 * //posso alterar pra tentar mostrar algum erro na tela, dizendo que nao ha cadastro
		}*/
		
		return resultado;
	}
}