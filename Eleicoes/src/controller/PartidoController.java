package controller;

import java.util.List;

import dao.PartidoDao;
import model.Partido;

public class PartidoController {
	
	public void salvar(Partido partido) throws Exception{
		if (partido.getNomePartido() == null || partido.getNomePartido().trim().equals("")) {
			throw new Exception("Nome do Partido Inválido");
			
		}
		PartidoDao.getInstance().salvar(partido);
		
	}
	
	public void atualizar(Partido partido) throws Exception{
		if (partido.getNomePartido() == null || partido.getNomePartido().trim().equals("")) {
			throw new Exception("Nome do Partido Inválido");
		}
		PartidoDao.getInstance().atualizar(partido);
		
	}
	
	public void excluir(int idPartido)  throws Exception{
		if (idPartido == 0) {
			throw new Exception("Nenhum Partido Selecionado");
		}
		PartidoDao.getInstance().excluir(idPartido);
	}
	public List<Partido>listar(){
		return PartidoDao.getInstance().listar();
		
		
	
	}
}
