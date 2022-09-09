package model;

public class Pesquisa {
	
		private int idPesquisa;
		private String dataPesquisa;
		private String cidadePesquisa;
		private int IdadeMedia;
		private int IdCandidato;
		private String InstitutoPesquisa;
		private String TipoPesquisa;
		private String Formato_Pesquisa;
		private int TotalVotos;
		
		public Pesquisa (int id, String data, String cidade, int idade, int id_c, String instituto, String tipo, String formato, int total) {
			this.idPesquisa = id;
			this.dataPesquisa = data;
			this.cidadePesquisa = cidade;
			this.IdadeMedia = idade;
			this.IdCandidato = id_c;
			this.InstitutoPesquisa = instituto;
			this.TipoPesquisa = tipo;
			this.Formato_Pesquisa = formato;		
			this.TotalVotos = total;
		}
		
		public Pesquisa () {
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

		public String getInstitutoPesquisa() {
			return InstitutoPesquisa;
		}

		public void setInstitutoPesquisa(String institutoPesquisa) {
			InstitutoPesquisa = institutoPesquisa;
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
		}
		
		public void totalVotosCandidato () {
			this.totalVotosCandidato();
		}

		public int getTotalVotos() {
			return TotalVotos;
		}

		public void setTotalVotos(int totalVotos) {
			TotalVotos = totalVotos;
		}
		
		
		

}
