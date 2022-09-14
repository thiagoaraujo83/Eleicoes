package model;

public class CandidatoXPesquisa {
	
	private int id;
	private Candidato candidato;
	private Pesquisa pesquisa;
	private int votos;
	
	public CandidatoXPesquisa(int id, Candidato candidato, Pesquisa pesquisa, int votos) {
		
		this.id = id;
		this.candidato = candidato;
		this.pesquisa = pesquisa;
		this.votos = votos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
}
