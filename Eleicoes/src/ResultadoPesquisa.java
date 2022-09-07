
public class ResultadoPesquisa extends Candidato{

	private int IdPesquisa;
	private int IdCandidato;
	private String NomeCandidato;
	private int VotosCandidato;
	private int IdInstitutoPesquisa;
	
	public ResultadoPesquisa (int id, int id_c, String nome, int votos, int instituto) {
		this.IdPesquisa = id;
		this.IdCandidato = id_c;
		this.NomeCandidato = nome;
		this.VotosCandidato = votos;
		this.IdInstitutoPesquisa = instituto;		
	}
	
	public ResultadoPesquisa () {
	}

	public int getIdPesquisa() {
		return IdPesquisa;
	}

	public void setIdPesquisa(int idPesquisa) {
		IdPesquisa = idPesquisa;
	}

	public int getIdCandidato() {
		return IdCandidato;
	}

	public void setIdCandidato(int idCandidato) {
		IdCandidato = idCandidato;
	}

	public String getNomeCandidato() {
		return NomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		NomeCandidato = nomeCandidato;
	}

	public int getVotosCandidato() {
		return VotosCandidato;
	}

	public void setVotosCandidato(int votosCandidato) {
		VotosCandidato = votosCandidato;
	}

	public int getIdInstitutoPesquisa() {
		return IdInstitutoPesquisa;
	}

	public void setIdInstitutoPesquisa(int idInstitutoPesquisa) {
		IdInstitutoPesquisa = idInstitutoPesquisa;
	}
	public void TotalVotosCandidato () {
		this.getVotosCandidato();
	}
}
