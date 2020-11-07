package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Endereco;
import modelo.Lugar;

public class RepositorioEndereco {
	
	private ArrayList<Endereco> enderecos;
	private FileReader fileReader;
	private BufferedReader leitor;
	
	public RepositorioEndereco() {
	
		enderecos = new ArrayList<>();
		preencheArray();
	}
	
public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

private void preencheArray() {
	
	File endereco = new File("src/endereco.txt");
	 

	try {

		fileReader = new FileReader(endereco);
		leitor = new BufferedReader(fileReader);
		String linha = leitor.readLine();

		do {

			String[] vamosPorPartes = linha.split(",");
			
			
			enderecos.add(new Endereco(vamosPorPartes[0],Integer.parseInt(vamosPorPartes[1]), vamosPorPartes[2], vamosPorPartes[3]));
			
			if (linha != null) {

				linha = leitor.readLine();

			}

		} while (linha != null);

		

	} catch (IOException e) {

		System.out.println("erro" + e.getMessage());
	}
	
}

}
