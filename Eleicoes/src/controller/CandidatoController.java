package controller;

import java.util.List;

import dao.CandidatoDao;
import model.Candidato;

public class CandidatoController {
	
	public void salvar (Candidato candidato) throws Exception {
		if (candidato.getNomeCandidato()== null || candidato.getNomeCandidato().length()< 3) {
			throw new Exception("Nome inválido");
		}
		CandidatoDao.getInstance().salvar(candidato);
			
	}
	public void atualizar(Candidato candidato) throws Exception {
		
		if (candidato.getNomeCandidato()== null || candidato.getNomeCandidato().length()< 3) {
			throw new Exception("Nome Inválido");
		}
		CandidatoDao.getInstance().atualizar(candidato);
	}
	public void excluir(int idCandidato) throws Exception {
		if (idCandidato == 0) {
			throw new Exception("Nenhum Candidato selecionado");
			
		}
		CandidatoDao.getInstance().excluir(idCandidato);
	}
	
	public List<Candidato> listar(){
		return CandidatoDao.getInstance().listar();
		
	}
}
