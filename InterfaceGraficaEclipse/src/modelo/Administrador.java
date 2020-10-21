package modelo;

public class Administrador extends Usuario{

	boolean tokenAdmin;
	public Administrador() {
		
		super();
		tokenAdmin = true;
	}
	
	public boolean isAdmin() {
		return tokenAdmin;
	}

	public Administrador(String login,
			String senha,
			String nome, 
			String cpf,
			String sexo,
			Boolean adm) {
		
		super(login,senha,nome,cpf,sexo);
		
	}
	
	

}
