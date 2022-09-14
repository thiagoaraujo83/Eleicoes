import java.util.List;

import controller.CandidatoController;
import model.Candidato;

public class Principal {
	public static void main (String []args) {
		
		
		Candidato candidato1 = new Candidato(0, "Jair", "PL", false);
		
		Candidato candidato2 = new Candidato(0, "Ciro", "PDT", false);
		
		
		Candidato candidato3 = new Candidato(0, "Simone Tebet", "MDB", false);
		
		
		Candidato candidato4 = new Candidato(0, "Lula", "PT", false);
		
		
		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(candidato1);
			controller.salvar(candidato2);
			controller.salvar(candidato3);
			controller.salvar(candidato4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<Candidato> l = controller.listar();
		
		
		for (Candidato c : l) {
			System.out.println(c.toString());
		}
	}

}
