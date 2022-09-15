package controller;

import dao.CandidatoXPesquisaDao;
import model.CandidatoXPesquisa;


public class CandidatoXPesquisaController {
	public void salvar(CandidatoXPesquisa candidatoXPesquisa) throws Exception{
		if (candidatoXPesquisa.getId() == 0) {
			throw new Exception("ID Inválido");
		}
		if (candidatoXPesquisa.getVotos()== 0) {
			throw new Exception("Voto Inválido");
		}
		
		CandidatoXPesquisaDao.getInstance().salvar(candidatoXPesquisa);
		
	}
	

}		
	



