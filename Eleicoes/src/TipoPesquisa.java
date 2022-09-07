
public class TipoPesquisa extends Candidato{

	private int IdTipoPesquisa;
	private String NomeTipoPesquisa;
	
	public TipoPesquisa (String nome, int id) {
		this.NomeTipoPesquisa = nome;
		this.IdTipoPesquisa = id;
	}
	
	public TipoPesquisa () {
	}

	public int getIdTipoPesquisa() {
		return IdTipoPesquisa;
	}

	public void setIdTipoPesquisa(int idTipoPesquisa) {
		IdTipoPesquisa = idTipoPesquisa;
	}

	public String getNomeTipoPesquisa() {
		return NomeTipoPesquisa;
	}

	public void setNomeTipoPesquisa(String nomeTipoPesquisa) {
		NomeTipoPesquisa = nomeTipoPesquisa;
	}
	
	
}
