package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuario;

public class RepositorioUsuarioArray implements IRepositorioUsuario {

	
	private ArrayList<Usuario> usuarios;
	private BufferedReader br;
	
	public RepositorioUsuarioArray() {
		
		usuarios = new ArrayList<>();
		usuarios.add(new Usuario ("renan", "12345678", "paixao", "12345678910","masculino"));
	}
	
	public ArrayList<Usuario> listarUsuarios() {
		
		try {
			File arquivo = new File ("src/arquivo.txt");
			FileReader fr = new FileReader(arquivo);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			do{
				
				String [] vamosPorPartes = linha.split(",");
				
				if(vamosPorPartes.length == 5) {
					usuarios.add(new Usuario(vamosPorPartes[0],vamosPorPartes[1],vamosPorPartes[2],
							vamosPorPartes[3],vamosPorPartes[4]));
				}
				
				if(linha != null) {
					
					linha = br.readLine();
				}
				
			}while(linha != null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return usuarios; 
	}

	@Override
	public void addUsuario(Usuario usuarioAdd) {
		
		usuarios.add(usuarioAdd);
		
	}

	@Override
	public Usuario buscaPorCpf(String cpf) {
		
		Usuario resultado = null;
		
		if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
	            cpf.equals("22222222222") || cpf.equals("33333333333") ||
	            cpf.equals("44444444444") || cpf.equals("55555555555") ||
	            cpf.equals("66666666666") || cpf.equals("77777777777") ||
	            cpf.equals("88888888888") || cpf.equals("99999999999") ||
	            (cpf.length() != 11)) {
	    
			return null;
	            
		}
		
		for (Usuario existente : usuarios) {
			
			
			if (existente.getCpf().equals(cpf)) {
				
				resultado = existente;
			}
		}
		
		
		
		return resultado;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	@Override
	public Usuario buscaPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
