package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuario;
import repositorio.RepositorioUsuarioArray;

public class ControleCadastro {

	Usuario usuario;
	private static FileWriter fileWriter;
	private static FileReader fileReader;
	private static BufferedReader leitor;
	private BufferedWriter escrever;
	
	//construtor
		public ControleCadastro() { 
			//this.usuario = usuario;
			escrever = new BufferedWriter(fileWriter);
			
		}
		
		public boolean verificaCadastro(String cpf) {
			
			File arquivo = new File("src/arquivo.txt");
			Boolean resultado = false;
			
			
			try {
				
				fileReader = new FileReader(arquivo);
				leitor = new BufferedReader(fileReader);
				String linha = leitor.readLine();
				
				
				do {
					
					String [] vamosPorPartes = linha.split(",");
					
					if (cpf.equals(vamosPorPartes[3])) {
						
						resultado = false;
						return false;
					}
					
					if (linha != null) {
						
						linha = leitor.readLine();
					
					}
					
				}while(linha != null);
			
			} catch (IOException e) {
				
				System.out.println("erro" + e.getMessage());
			}
			
			return true;
			
		}
		
		public boolean adicionaUsuario(Usuario user) {
			
			Boolean resultado = false;
			
			if(verificaCadastro(user.getCpf()) == true) {
				String linhaDados = user.getLogin() + "," + user.getSenha() + "," + user.getNome() + "," + user.getCpf()+ "," + user.getSexo();			
					
				try {
				
					escrever.write(linhaDados + "\n");
					
					escrever.close();
					 fileWriter.close();
					 resultado = true;
					 
			 	} catch (IOException e) {
					
					System.out.println("erro" + e.getMessage());
					resultado = false;
				}
			 }
			 
			return resultado;
		}
		
		
		
		
}		
	
