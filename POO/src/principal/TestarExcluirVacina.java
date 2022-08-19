package principal;

import controller.VacinaController;
import model.repository.VacinaRepository;

public class TestarExcluirVacina {

	public static void main(String[] args) {
		VacinaController vacinaController = new VacinaController();
		
		int id = 3;
		boolean excluiu = vacinaController.excluir(id);
		if(excluiu) {
			System.out.println("Vacina com ID: " + id + "\n Excluída com sucesso!");
		}
	}

}
