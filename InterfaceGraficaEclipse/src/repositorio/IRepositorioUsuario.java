package repositorio;

import modelo.Usuario;

public interface IRepositorioUsuario {
	
	
	void addUsuario(Usuario usuarioAdd);
	Usuario buscaPorCpf(String cpf);
	Usuario buscaPorLogin(String login);
	

}
