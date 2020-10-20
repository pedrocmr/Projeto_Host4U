package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import modelo.Usuario;


public class ControleCadastro {


	private static FileWriter fileWriter;
	private static FileReader fileReader;
	private static BufferedReader leitor;
	private static BufferedWriter escrever;
	//construtor
		
		public ControleCadastro() {}
		
	
	public void dadoCadastroAdiciona(Usuario usuario) {
		
		
		try {
			File arquivo = new File("src/arquivo.txt");
			String linhaDados;
			fileWriter = new FileWriter(arquivo,true);
			escrever = new BufferedWriter(fileWriter);
			
			
			
			if(verificaCadastro(usuario.getCpf())) {
				
				JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Information", JOptionPane.INFORMATION_MESSAGE);
				linhaDados = usuario.getLogin() + "," + usuario.getSenha() + "," + usuario.getNome() + "," + usuario.getCpf()+ "," + usuario.getSexo();			
				escrever.write(linhaDados + "\n");
				
			}else{
				
				JOptionPane.showMessageDialog(null, "Usuário já cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			
			escrever.close();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void lerDadoCadastro() {
		
		File arquivo = new File("src/arquivo.txt");
		try {
			fileReader = new FileReader(arquivo);
			leitor = new BufferedReader(fileReader);
			String linha = leitor.readLine();
			while(linha != null) {
			System.out.println(linha);
			linha = leitor.readLine();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean verificaCadastro(String cpf) {
		
		File arquivo = new File("src/arquivo.txt");
		
		
		try {
			
			fileReader = new FileReader(arquivo);
			leitor = new BufferedReader(fileReader);
			String linha = leitor.readLine();
			
			
			do {
				
				String [] vamosPorPartes = linha.split(",");
				
				if (cpf.equals(vamosPorPartes[3])) {
					
					return false;
				}
				
				if (linha != null) {
					
					linha = leitor.readLine();
				
				}
				
			}while(linha != null);
		
		} catch (IOException e) {
			
			System.out.println("erro"+e.getMessage());
		}
		
		return true;
		
	}
	
	
	
	
	
}
