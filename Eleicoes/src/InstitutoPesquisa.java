
public class InstitutoPesquisa extends Candidato{
	
	private int idInstituto;
	private String nomeInstituto;
	
	
	public InstitutoPesquisa (String nome, int id) {
		this.nomeInstituto = nome;
		this.idInstituto = id;
	}

	public InstitutoPesquisa () {
	}

	public int getIdInstituto() {
		return idInstituto;
	}

	public void setIdInstituto(int idInstituto) {
		this.idInstituto = idInstituto;
	}

	public String getNomeInstituto() {
		return nomeInstituto;
	}

	public void setNomeInstituto(String nomeInstituto) {
		this.nomeInstituto = nomeInstituto;
	}
	
	
}
