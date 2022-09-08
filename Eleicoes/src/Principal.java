
public class Principal {
	
	public static void main(String[] args) {

		Candidato candidato = new Candidato (); 
			candidato.setNomeCandidato("AAAA");
			
		Partido partido = new Partido ();		
			partido.setNomePartido("BBBB");
							
		Pesquisa pesquisa = new Pesquisa ();
			pesquisa.setTotalVotos(0);
					
		System.out.println("O nome do candidato é: " + candidato.getNomeCandidato() + " e o nome do Partido é: " + partido.getNomePartido());
	}
}
