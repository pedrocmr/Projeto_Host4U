package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;
import repositorio.IRepositorioReserva;
import repositorio.RepositorioReservaArray;

public class ControleReserva implements IRepositorioReserva {

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
			
			if(verificaReserva(novaReserva)) {
				
				try {
					
					fileWriter = new FileWriter("src/reserva.txt",true);
					escrever = new BufferedWriter(fileWriter);
					escrever.write(novaReserva.getQuarto().getNumero().toString()+","+
									novaReserva.getQuarto().getHotel().getIdHotel()+","+
									novaReserva.getUsuario().getCpf()+","+
									novaReserva.getCheckin()+","+
									novaReserva.getCheckout()+"\n");
					escrever.close();
					fileWriter.close();
					
				}catch(IOException e) {
					
					e.printStackTrace();
					return false;
				}
				
				
				resultado = true;
			}	
									
		}else{
			
			
			return false;
		}
			
		return resultado;
	}
	
	private boolean verificaReserva(Reserva reserva) {
		
		boolean resultado = true;
		File arquivo = new File("src/reserva.txt");
		
			try {
			
				fileReader = new FileReader(arquivo);
				leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
			
				do {
				
					String [] vamosPorPartes = linha.split(",");
				
					LocalDate in = LocalDate.parse(vamosPorPartes[3]);
					LocalDate out = LocalDate.parse(vamosPorPartes[4]);
				
					if (reserva.getCheckin().isBefore(in) && reserva.getCheckout().isBefore(in) ||
						reserva.getCheckin().isAfter(out)) { 
					
					}else {
						
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
		
	}
	
	public ArrayList<Quarto> verificaReservaComDatas(int idHotel, LocalDate checkin, LocalDate checkout) {
		
		ArrayList<Quarto> disponiveis = new ArrayList<>();
		
		File arquivo = new File("src/reserva.txt");
		
			try {
			
				fileReader = new FileReader(arquivo);
				leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
			
				do {
				
					String [] vamosPorPartes = linha.split(",");
					
					if(idHotel == Integer.parseInt(vamosPorPartes[0])) {
						
						LocalDate in = LocalDate.parse(vamosPorPartes[3]);
						LocalDate out = LocalDate.parse(vamosPorPartes[4]);
						
						if (checkin.isBefore(in) && checkout.isBefore(in) ||
								checkin.isAfter(out)) { 
							
							
							}
						
					}
					
				
				
					if (linha != null) {
					
						linha = leitor.readLine();
				
					}
				
				}while(linha != null);
		
		} catch (IOException e) {
			
			System.out.println("erro" + e.getMessage());
		}
		
		return disponiveis;
		
	}
	private ArrayList buscaQuarto(int id) {
		
		ArrayList quartos;
		File hotel;
		
			switch (id) {
		
			case 1: {
			
				hotel = new File ("src/urbano.txt");
				break;
			}case 2:{
			
				hotel = new File ("src/beiraMar.txt");
				break;
			}case 3:{
			
				hotel = new File ("src/varanda.txt");
				break;
			}default:{
			
				return null;
			}
		}
			
			try {
				
				fileReader = new FileReader(hotel);
				leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
			
				do {
				
					String [] vamosPorPartes = linha.split(",");
				
					LocalDate in = LocalDate.parse(vamosPorPartes[3]);
					LocalDate out = LocalDate.parse(vamosPorPartes[4]);
				
					
				
					if (linha != null) {
					
						linha = leitor.readLine();
				
					}
				
				}while(linha != null);
		
		} catch (IOException e) {
			
			System.out.println("erro" + e.getMessage());
		}
			
		
			
			
		return null;
	}

	// MÉTODO CANCELAR RESERVAS
	public boolean cancelaReserva(Usuario usuario, Reserva reservaCancela) {
		
		if(reservaCancela == null) { 
			
			
			return false;
		}
		
		boolean resultado = false;
			
				if (duplicaReserva(reservaCancela.getQuarto().getNumero().toString()+","+
						reservaCancela.getQuarto().getHotel().getIdHotel()+","+
						reservaCancela.getUsuario().getCpf()+","+
						reservaCancela.getCheckin()+","+
						reservaCancela.getCheckout())) {
					
					File reserva = new File("src/reserva.txt");
					reserva.delete();
					escreveReserva();
					File apagaDuplicada = new File ("src/reservaDuplicada.txt");
					apagaDuplicada.delete();
					resultado = true;
				}
			
		return resultado;
	}
	
	private boolean duplicaReserva(String linha) {
		
		boolean resultado = false;
		
		try {
			File reservaDuplicada = new File ("src/reservaDuplicada.txt");	
			fileWriter = new FileWriter(reservaDuplicada);
			escrever = new BufferedWriter(fileWriter);
			fileReader = new FileReader("src/reserva.txt");
			leitor = new BufferedReader(fileReader);
			String linhaDaDuplicada = leitor.readLine();
			
			do {
			
				
				if(linhaDaDuplicada.equals(linha)) {
				
					resultado = true;
					
				}else {
					
					escrever.write(linhaDaDuplicada+"\n");
				}
				
				if(linhaDaDuplicada != null) {

					linhaDaDuplicada = leitor.readLine();
					
				}
			
			}while(linhaDaDuplicada != null);
			
			escrever.close();
			fileReader.close();
			fileWriter.close();
			leitor.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	
		return resultado;
	}
	
	private void escreveReserva() {
		
		try {
			File reservaNova = new File ("src/reserva.txt");
			fileWriter = new FileWriter(reservaNova);
			escrever = new BufferedWriter(fileWriter);
			fileReader = new FileReader("src/reservaDuplicada.txt");
			leitor = new BufferedReader(fileReader);
			String linhaDaDuplicada = leitor.readLine();
			
			do {
			
				escrever.write(linhaDaDuplicada+"\n");
			
				if(linhaDaDuplicada != null) {

					linhaDaDuplicada = leitor.readLine();
				}
			
			}while(linhaDaDuplicada != null);
			
			escrever.close();
			fileReader.close();
			fileWriter.close();
			leitor.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	// MÉTODO REMARCAR RESERVAS
	public boolean remarcarReserva(Usuario usuario, Reserva reservaCancela, Reserva reservaRemarca) {

		if (usuario == null || reservaCancela == null || reservaRemarca == null) {
			
			return false;
		}
		
		boolean resultado = false;
		
		if (cancelaReserva(usuario, reservaCancela)) {
			
			if(addReserva(reservaRemarca)) {
				
				resultado = true;
			}
		}
			
			
		return resultado;
	}

	@Override
	public ArrayList<Reserva> listarReservas(String usuarioCpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reserva> listarTodasReservas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reserva> listarReservas(int idHotel) {
		// TODO Auto-generated method stub
		return null;
	}
}