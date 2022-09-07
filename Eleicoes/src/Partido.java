
public class Partido extends Candidato{

	private int idPartido;
	private String nomePartido;
	
	public Partido (String nome, int id) {
		this.nomePartido = nome;
		this.idPartido = id;
	}
	
	public Partido () {
		}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	
	
}
