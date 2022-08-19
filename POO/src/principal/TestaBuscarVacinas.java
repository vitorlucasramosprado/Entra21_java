package principal;

import java.util.ArrayList;

import controller.VacinaController;
import model.entity.Vacina;
import model.repository.VacinaRepository;

public class TestaBuscarVacinas {

	public static void main(String[] args) {
		VacinaController vacinaController = new VacinaController();
		
		ArrayList<Vacina> vacinas = vacinaController.pesquisarTodas(); 
		
		for (Vacina vacina : vacinas) {
			System.out.println(vacina.toString());
		}
	}

}
