package principal;

import java.util.Date;

import controller.PesquisadorController;
import controller.VacinaController;
import exception.VacinaDataInicioInvalidaException;
import exception.VacinaEstagioInvalidoException;
import exception.VacinaPaisInvalidoException;
import exception.VacinaSemResponsavelException;
import model.entity.Pesquisador;
import model.entity.Vacina;

public class TestaSalvarVacina {

	public static void main(String[] args) {
		PesquisadorController pesquisadorController = new PesquisadorController();
		Pesquisador pesquisador = pesquisadorController.pesquisarPorId(1);
		
		Vacina vacina = new Vacina("USA", 1, new Date(), pesquisador);
		VacinaController vacinaController = new VacinaController();
		
		try {
			Vacina vacinaComiD = vacinaController.inserir(vacina);
			System.out.println("Vacina salva com sucesso! \nId: " + vacinaComiD.getId());
		} catch (VacinaSemResponsavelException | VacinaPaisInvalidoException | VacinaEstagioInvalidoException | VacinaDataInicioInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}

}
