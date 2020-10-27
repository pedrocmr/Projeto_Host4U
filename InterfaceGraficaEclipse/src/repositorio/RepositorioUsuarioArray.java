package repositorio;

import java.util.ArrayList;

import modelo.Usuario;

public class RepositorioUsuarioArray implements IRepositorioUsuario {

	
	private ArrayList<Usuario> usuarios;
	
	public RepositorioUsuarioArray() {
		
		usuarios = new ArrayList<>();
		usuarios.add(new Usuario ("renan", "12345678", "paixao", "12345678910","masculino"));
	}
	@Override
	public void listarUsuarios() {
		
		
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
