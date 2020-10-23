package repositorio;

import modelo.Usuario;

public interface IRepositorioUsuario {
	
	
	void listarUsuarios();
	void addUsuario(Usuario usuarioAdd);
	Usuario buscaPorCpf(String cpf);
	Usuario buscaPorLogin(String login);
	

}
