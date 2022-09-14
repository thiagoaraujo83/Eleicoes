package model;


public class Pesquisa {
	
		private int idPesquisa;
		private String dataPesquisa;
		private String cidadePesquisa;
		private int IdadeMedia;
		private int IdCandidato;
		private String TipoPesquisa;
		private String Formato_Pesquisa;
		
		
		
		public Pesquisa(int idPesquisa, String dataPesquisa, String cidadePesquisa, int idadeMedia, int idCandidato,
				String tipoPesquisa, String formato_Pesquisa) {
			super();
			this.idPesquisa = idPesquisa;
			this.dataPesquisa = dataPesquisa;
			this.cidadePesquisa = cidadePesquisa;
			IdadeMedia = idadeMedia;
			IdCandidato = idCandidato;
			TipoPesquisa = tipoPesquisa;
			Formato_Pesquisa = formato_Pesquisa;
		}
		@Override
		public String toString() {
			String s = "Pesquisa. id: " + idPesquisa + "Data: " + dataPesquisa + "Local: "+ cidadePesquisa + "Média idade: "+ IdadeMedia + "Candidato. id: "+ IdCandidato + "Tipo de pesquisa: " + "Formato: " +Formato_Pesquisa;
			return s;
		}


		public int getIdPesquisa() {
			return idPesquisa;
		}



		public void setIdPesquisa(int idPesquisa) {
			this.idPesquisa = idPesquisa;
		}



		public String getDataPesquisa() {
			return dataPesquisa;
		}



		public void setDataPesquisa(String dataPesquisa) {
			this.dataPesquisa = dataPesquisa;
		}



		public String getCidadePesquisa() {
			return cidadePesquisa;
		}



		public void setCidadePesquisa(String cidadePesquisa) {
			this.cidadePesquisa = cidadePesquisa;
		}



		public int getIdadeMedia() {
			return IdadeMedia;
		}



		public void setIdadeMedia(int idadeMedia) {
			IdadeMedia = idadeMedia;
		}



		public int getIdCandidato() {
			return IdCandidato;
		}



		public void setIdCandidato(int idCandidato) {
			IdCandidato = idCandidato;
		}



		public String getTipoPesquisa() {
			return TipoPesquisa;
		}



		public void setTipoPesquisa(String tipoPesquisa) {
			TipoPesquisa = tipoPesquisa;
		}



		public String getFormato_Pesquisa() {
			return Formato_Pesquisa;
		}



		public void setFormato_Pesquisa(String formato_Pesquisa) {
			Formato_Pesquisa = formato_Pesquisa;
			
			if (formato_Pesquisa.length()>=1 && formato_Pesquisa.length()<=10)
				this.Formato_Pesquisa = formato_Pesquisa;
			
		}
		
		
		
		

}
