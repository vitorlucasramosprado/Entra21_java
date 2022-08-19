package principal;

import controller.VacinaController;
import model.entity.Vacina;
import model.repository.VacinaRepository;

public class TestaAtualizarVacina {

	public static void main(String[] args) {
		VacinaController vacinaController = new VacinaController();
		
		Vacina vacina =  vacinaController.pesquisarPorId(2);

		vacina.setNomePesquisador("Felipinho");
		
		vacinaController.atualizar(vacina);
	}

}
