package repositorio;

import java.util.ArrayList;

import modelo.Lugar;

public interface IRepositorioLugar {
	
	public ArrayList<Lugar> listarLugares();
	public boolean buscaLugar(String nome);

}
