package controlador;

import modelo.Usuario;
import repositorio.RepositorioUsuarioArray;

public class ControleCadastro {

	private RepositorioUsuarioArray repo;

	
	
	public ControleCadastro() {
		repo = new RepositorioUsuarioArray();
	}

	public boolean AdicionaUsuario(Usuario usuarioAdd) {

		boolean resultado = false;
		
			if (verificaCadastro(usuarioAdd.getCpf())) {

				repo.addUsuario(usuarioAdd);
				resultado = true;
			}
		
		return resultado;

	}	

	private boolean verificaCadastro(String cpf) {

		
		boolean resultado = false;
		
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")||
	        cpf.equals("33333333333") || cpf.equals("44444444444") ||
	        cpf.equals("55555555555") || cpf.equals("66666666666") ||
	        cpf.equals("77777777777") || cpf.equals("88888888888") ||
	        cpf.equals("99999999999") || (cpf.length() != 11)){
	             
		
		}else {
			
			for (Usuario existente : repo.getUsuarios()) {
				
				if(existente.getCpf().equals(cpf)) {
					
				
				}else {
					
					resultado = true;
				}
			}
		}
		
		return resultado;

	}
}