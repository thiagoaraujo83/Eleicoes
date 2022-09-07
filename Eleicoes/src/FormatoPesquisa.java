
public class FormatoPesquisa extends Candidato{

	private int idFormatoPesquisa;
	private String nomeFormato;
	
	public FormatoPesquisa (String nome, int id) {
		this.nomeFormato = nome;
		this.idFormatoPesquisa = id;
	}
	
	public FormatoPesquisa () {		
	}

	public int getIdFormatoPesquisa() {
		return idFormatoPesquisa;
	}

	public void setIdFormatoPesquisa(int idFormatoPesquisa) {
		this.idFormatoPesquisa = idFormatoPesquisa;
	}

	public String getNomeFormato() {
		return nomeFormato;
	}

	public void setNomeFormato(String nomeFormato) {
		this.nomeFormato = nomeFormato;
	}
	
	
}
