package model;

public class Candidato {
	 
		private int idCandidato;
		private String nomeCandidato;
		private String partido_candidato;
		private boolean candidato_ficha_limpa;
		private String data_nascimento;
		private String situacao_justica;
		
		public Candidato (String Nome, int Id) {
			this.nomeCandidato = Nome;
			this.idCandidato = Id;
		}
		
		public Candidato () {
			
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

		public boolean isCandidato_ficha_limpa() {
			return candidato_ficha_limpa;
		}

		public void setCandidato_ficha_limpa(boolean candidato_ficha_limpa) {
			this.candidato_ficha_limpa = candidato_ficha_limpa;
		}

		public String getData_nascimento() {
			return data_nascimento;
		}

		public void setData_nascimento(String data_nascimento) {
			this.data_nascimento = data_nascimento;
		}

		public String getSituacao_justica() {
			return situacao_justica;
		}

		public void setSituacao_justica(String situacao_justica) {
			this.situacao_justica = situacao_justica;
		}
		
		public String toString() {
			return nomeCandidato + " - " + partido_candidato;
			
		}
		
}


