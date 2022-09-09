package controller;

import dao.PesquisaDao;
import model.Pesquisa;

public class PesquisaController {
	
	public void registrarPesquisa(Pesquisa pesquisa) throws Exception{
		if (pesquisa.getDataPesquisa() == null) {
			throw new Exception ("Data Invalida");
		}
		if (pesquisa.getIdCandidato() == 0) {
			throw new Exception("Candidato Inválido");
			
		}
		PesquisaDao.getInstance().registrarPesquisa(pesquisa);
		
		
	}

}
