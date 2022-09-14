package model;

public class Candidato {
	 
		private int idCandidato;
		private String nomeCandidato;
		private String partido_candidato;
		private Boolean fichalimpa ;
		
		
		
		public Candidato(int idCandidato, String nomeCandidato, String partido_candidato, Boolean fichalimpa) {
			super();
			this.idCandidato = idCandidato;
			this.nomeCandidato = nomeCandidato;
			this.partido_candidato = partido_candidato;
			this.fichalimpa = fichalimpa;
		}

		@Override
		public String toString() {
			String s = "Candidato.ID: "+ idCandidato + ", Partido" + partido_candidato + ", Ficha Limpa: " + fichalimpa + ".";
		
			return s;
		}

		public int getIdCandidato() {
			return idCandidato;
		}



		public void setIdCandidato(int idCandidato) {
			this.idCandidato = idCandidato;
		}



		public String getNomeCandidato() {
			return nomeCandidato;
		}



		public void setNomeCandidato(String nomeCandidato) {
			this.nomeCandidato = nomeCandidato;
		}



		public String getPartido_candidato() {
			return partido_candidato;
		}



		public void setPartido_candidato(String partido_candidato) {
			this.partido_candidato = partido_candidato;
		}



		public Boolean getFichalimpa() {
			return fichalimpa;
		}



		public void setFichalimpa(Boolean fichalimpa) {
			this.fichalimpa = fichalimpa;
		}
		
	

		
		
}


