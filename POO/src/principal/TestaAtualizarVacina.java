package principal;

import controller.VacinaController;
import model.entity.Vacina;

public class TestaAtualizarVacina {

	public static void main(String[] args) {
		VacinaController vacinaController = new VacinaController();
		
		Vacina vacina =  vacinaController.pesquisarPorId(9);

		vacina.setPaisOrigem("Argélia");;
		
		vacinaController.atualizar(vacina);
	}

}
