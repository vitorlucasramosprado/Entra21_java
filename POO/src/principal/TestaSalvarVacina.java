package principal;

import java.util.Date;

import controller.VacinaController;
import model.entity.Vacina;
import model.repository.VacinaRepository;

public class TestaSalvarVacina {

	public static void main(String[] args) {
		Vacina vacina = new Vacina("França", 1, new Date(), "João");
		VacinaController vacinaController = new VacinaController();
		
		Vacina vacinaComiD = vacinaController.inserir(vacina);
	
		System.out.println("Vacina salva com sucesso! \nId: " + vacinaComiD.getId());
	}

}
