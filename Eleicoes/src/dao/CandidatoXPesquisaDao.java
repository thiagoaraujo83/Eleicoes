package dao;

import java.util.ArrayList;
import java.util.List;

import model.CandidatoXPesquisa;

public class CandidatoXPesquisaDao {
	
		private static CandidatoXPesquisaDao instance;
		private List<CandidatoXPesquisa> listaCandidatoXPesquisas = new ArrayList<>();
		
		public static CandidatoXPesquisaDao getInstance() {
			if (instance == null) {
				instance = new CandidatoXPesquisaDao();
			
			}
			return instance; 
		}
		
		
		public void salvar(CandidatoXPesquisa candidatoXPesquisa) {
			listaCandidatoXPesquisas.add(candidatoXPesquisa);
			
		}
		
		public void atualizar(CandidatoXPesquisa candidatoXPesquisa) {
			listaCandidatoXPesquisas.set(candidatoXPesquisa.getId(), candidatoXPesquisa);
			
			
		}
		
		public void excluir(int id) {
			
		}
		public List<CandidatoXPesquisa>listar(){
			return listaCandidatoXPesquisas;
			
		}

}
