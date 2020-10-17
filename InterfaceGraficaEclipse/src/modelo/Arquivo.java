package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
	public static void main(String[] args) {
		
		File file = new File("src/arquivos");
		//file.mkdir();
		
		//criando o arquivo
		File arqCadastro = new File("src/cadastros.csv");
		String nome = "Rafael";
		
		try {
			//arqCadastro.createNewFile();
			FileReader ler = new FileReader(arqCadastro);
			BufferedReader leitor = new BufferedReader(ler);
			String linha = leitor.readLine();
			
			FileWriter fileWriter = new FileWriter(arqCadastro);
			BufferedWriter escrever = new BufferedWriter(fileWriter);
			escrever.write(nome);
			escrever.write("Testeeee");
			
			escrever.close(); //só salva no arquivo depois que fecha ele
			fileWriter.close();
			
			
			while(linha != null) {
				System.out.println(linha);
				linha = leitor.readLine();
			}
			
		} catch(IOException ex) {
			
		}
	
	}
}
