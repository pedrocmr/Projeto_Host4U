package modelo;

import java.util.ArrayList;

public class Cadastro {
	
	//atributos
	private String login;
	private String senha;
	private String nome;
	private String sexo;
	private ArrayList<Cadastro> cadastros;
	
	//CONSTRUTORES
	public Cadastro(String login,
			String senha,
			String nome,
			String sexo) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.sexo = sexo;
		this.cadastros = new ArrayList<>();
	}
	
	//MÉTODOS
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public ArrayList<Cadastro> getCadastros(){
		return this.cadastros;
	}
	
	public String toString() {
		return "Login: " + getLogin() + " " + 
	    "Nome: " + getNome() + " " + 
	    "Sexo: " + getSexo() ;
	}
	
	public void cadastrar(Cadastro... cadastros) {
		for(Cadastro cad : cadastros) {
			this.cadastros.add(cad);
			
		}
	}
	
	
	

	
}
