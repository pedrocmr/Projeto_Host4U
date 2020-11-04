package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Usuario;

public class ControleCadastro {

	Usuario usuario;
	private static FileWriter fileWriter;
	private static FileReader fileReader;
	private static BufferedReader leitor;
	private BufferedWriter escrever;
	
	
	//construtor
		public ControleCadastro() { 
			
		}
		
		private boolean verificaCadastro(String cpf) {
			
			System.out.println(validarCpf(cpf));
			if(validarCpf(cpf).equals("Erro")) {
				return false;
			}
			
			Boolean resultado = true;
			
			try {
				
				
				File arquivo = new File("src/arquivo.txt");
				fileReader = new FileReader(arquivo);
				leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
				
				do {
					
					resultado = true;
					String [] vamosPorPartes = linha.split(",");
					
					
					if (cpf.equals(vamosPorPartes[3])) {
						
						resultado = false;
					}
					
					if (linha != null) {
						
						linha = leitor.readLine();
					
					}
					
				}while(linha != null);
			
			} catch (IOException e) {
				
				System.out.println("erro" + e.getMessage());
				resultado = false;
			}
			
			return resultado;
			
		} // fim da verifica cpf
		
		public boolean adicionaUsuario(Usuario user) {
			
			Boolean resultado = false;
			
			if(verificaCadastro(user.getCpf()) == true) {
				
				String linhaDados = user.getLogin() + "," + user.getSenha() + "," + user.getNome() + "," + user.getCpf()+ "," + user.getSexo();			
					
				try {
					File arquivo = new File("src/arquivo.txt");
					fileWriter = new FileWriter(arquivo, true);
					escrever = new BufferedWriter(fileWriter);
					escrever.write(linhaDados + "\n");
					escrever.close();
					 fileWriter.close();
					 resultado = true;
					 
			 	} catch (IOException e) {
					
					System.out.println("erro" + e.getMessage());
					resultado = false;
				}
			 
		
			} else {
				 resultado = false;
		 }
		
		
		return resultado;		
		
	}
		
		
		private String validarCpf(String cpf) {
			
			
			if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")||
			        cpf.equals("33333333333") || cpf.equals("44444444444") ||
			        cpf.equals("55555555555") || cpf.equals("66666666666") ||
			        cpf.equals("77777777777") || cpf.equals("88888888888") ||
			        cpf.equals("99999999999") || (cpf.length() != 11)){
			             
					return "Erro";
				
				}
			
			try {
			   Double intCpf = Double.parseDouble(cpf);
			     return cpf;
			} catch (NumberFormatException e) {
			    System.out.println("Cpf não pode conter letras!");
			}
			
			return "Erro";

		}
		
		public boolean atualiza(Usuario u) {
			File arquivo = new File("src/arquivo.txt");
			String linhaDados = u.getLogin() + "," + u.getSenha() + "," + u.getNome() + "," + u.getCpf()+ "," + u.getSexo();			
			
			try {
				fileWriter = new FileWriter(arquivo);
				escrever = new BufferedWriter(fileWriter);
				escrever.write(linhaDados);

				escrever.write(linhaDados + "\n");
				escrever.close();
				fileWriter.close();
				 
				 
				 return true;
			} catch (IOException e ) {
				System.out.println("erro" + e.getMessage());
			}
		
			return true;
		}
		
		
		
}		
	
