import controller.CandidatoController;
import model.Candidato;

public class Principal {
	public static void main (String []args) {
		
		
		Candidato candidato1 = new Candidato();
		candidato1.setIdCandidato(1);
		candidato1.setNomeCandidato("Jair");
		candidato1.setPartido_candidato("PL");
		
		Candidato candidato2 = new Candidato();
		candidato2.setIdCandidato(1);
		candidato2.setNomeCandidato("Ciro");
		candidato2.setPartido_candidato("PDT");
		
		Candidato candidato3 = new Candidato();
		candidato3.setIdCandidato(1);
		candidato3.setNomeCandidato("Rose Modesto");
		candidato3.setPartido_candidato("UN");
		
		Candidato candidato4 = new Candidato();
		candidato4.setIdCandidato(1);
		candidato4.setNomeCandidato("Lula");
		candidato4.setPartido_candidato("PT");
		
		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(candidato1);
			controller.salvar(candidato2);
			controller.salvar(candidato3);
			controller.salvar(candidato4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
	}

}
