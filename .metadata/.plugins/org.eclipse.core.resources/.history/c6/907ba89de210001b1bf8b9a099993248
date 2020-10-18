package modelo;

import java.util.ArrayList;

public class Usuario {

	// ATRIBUTOS

	private ArrayList<Cadastro> usuarios;
	private int idUsuario;

	// CONSTRUTORES
	public Usuario(ArrayList<Cadastro> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario() {
		
	}

	// MÉTODOS
	public ArrayList<Cadastro> getUsuario() {
		return usuarios;
	}

	public void setUsuarioNome(String nome) {
		this.usuarios.get(idUsuario).setNome(nome);
	}

	public String getNome() {
		return this.usuarios.get(idUsuario).getNome();
	}

	public void setUsuarioLogin(String login) {
		this.usuarios.get(idUsuario).setLogin(login);
	}

	public String getLogin() {
		return this.usuarios.get(idUsuario).getLogin();
	}

	public void setUsuarioSenha(String senha) {
		this.usuarios.get(idUsuario).setLogin(senha);
	}

	public void setUsuarioSexo(String sexo) {
		this.usuarios.get(idUsuario).setLogin(sexo);
	}

	public String getSexo() {
		return this.usuarios.get(idUsuario).getSexo();
	}

	public String toString() {
		return "Nome: " + getNome() + " " + "Login: " + getLogin() + " " + "Sexo: " + getSexo();
	}

}
