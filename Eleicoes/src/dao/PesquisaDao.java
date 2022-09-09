package dao;

import java.util.ArrayList;
import java.util.List;

import model.Pesquisa;

public class PesquisaDao {
			
		private static PesquisaDao instance;
		private List<Pesquisa> listaPesquisa = new ArrayList<>();
		
		public static PesquisaDao getInstance() {
			if (instance == null) {
				instance = new PesquisaDao();
			
			}
			return instance;
			
		}
		
		public void registrarPesquisa(Pesquisa pesquisa) {
			listaPesquisa.add(pesquisa);
		}


}
