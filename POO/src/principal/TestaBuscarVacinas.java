package principal;

import java.util.ArrayList;

import controller.VacinaController;
import model.entity.Vacina;

public class TestaBuscarVacinas {

	public static void main(String[] args) {
		VacinaController vacinaController = new VacinaController();
		
		ArrayList<Vacina> vacinas = vacinaController.pesquisarTodas(); 
		
		vacinas.forEach( vac -> System.out.println(vac.toString()));
	}

}
