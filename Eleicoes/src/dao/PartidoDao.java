package dao;

import java.util.ArrayList;
import java.util.List;

import model.Partido;

public class PartidoDao {
	private static PartidoDao instance;
	private List<Partido> listaPartidos = new ArrayList<>();
	
	public static PartidoDao getInstance() {
		if (instance == null) {
			instance = new PartidoDao();
		
		}
		return instance; 
	}
	
	
	public void salvar(Partido partido) {
		listaPartidos.add(partido);
		
	}
	
	public void atualizar(Partido partido) {
		listaPartidos.set(partido.getIdPartido(), partido);
		
		
	}
	
	public void excluir(int idPartido) {
		
	}
	public List<Partido>listar(){
		return listaPartidos;
		
	}

}
