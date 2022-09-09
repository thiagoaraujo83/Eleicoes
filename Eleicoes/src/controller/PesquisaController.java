package controller;

import dao.PesquisaDao;
import model.Pesquisa;

public class PesquisaController {
	
	public void registrarPesquisa(Pesquisa pesquisa) throws Exception{
		if (Pesquisa.getDataPesquisa() == null) {
			throw Exception ("Data Invalida");
		}
		if (Pesquisa.getCandidato() == null) {
			throw new Exception("Candidato Inválido");
			
		}
		PesquisaDao.getInstance().registrar(pesquisa);
		
	}

}
