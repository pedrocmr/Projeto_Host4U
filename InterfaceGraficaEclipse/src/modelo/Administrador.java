package modelo;


public class Administrador extends Usuario{

	
	public Administrador() {
		
		super();
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
