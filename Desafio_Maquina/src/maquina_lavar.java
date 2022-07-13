import java.util.Scanner;

public class maquina_lavar {
	
	static String modelo, nome, voltagem;
	static int kg;
	static int estagio[] = new int[5];

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);

		while(true) {
			mainScreen();
			int opcao = input.nextInt();
			switch(opcao) {
				case 1:
					configuraMaquina();
					break;
				case 2: 
					simulationScreen();
					simulaMaquina();
					break;
				default:
					System.out.println("fim");
					return;
			}
		}
	}
	public static void mainScreen() {
		System.out.print("================================================"
				+ "\n             MENU DE SIMULAÇÃO"
				+ "\n================================================"
				+ "\n1 - Configurar a máquina de lavar"
				+ "\n2 - Simular máquina de lavar"
				+ "\n0 - Sair"
				+ "\nDigite o código: ");
	}
	public static void simulationScreen() {
		System.out.print("==============================================="
				+ "\n       SIMULAÇÃO DA MAQUINA DE LAVAR"
				+ "\n===============================================");
		System.out.println("\nSimulando o Modelo: "+modelo+" - "+nome+" - "+kg+" - "+voltagem+"v");
	
		System.out.print("==============================================="
				+ "\n    QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR?"
				+ "\n==============================================="
				+ "\n1 - Lavação Pesada"
				+ "\n2 - Lavação Normal"
				+ "\n3 - Lavação Leve"
				+ "\n4 - Enxague"
				+ "\n5 - Centrifugar"
				+ "\nSelecione o estágio inicial: \n");
	}
	
	public static void configuraMaquina() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n=============================================="
				+ "\n    CONFIGURAÇÃO DA MAQUINA DE LAVAR"
				+ "\n==============================================");
		System.out.print("Modelo: ");
		modelo = input.next();
		
		System.out.print("Nome: ");
		nome = input.nextLine();
		nome = input.nextLine();
		
		System.out.print("Voltagem( 220v | 110v | 220/110v): ");
		voltagem = input.next();
		
		System.out.print("Quantos kg? ");
		kg = input.nextInt();
		
		System.out.print("Duração do estágio 1 - Lavação Pesada: ");
		estagio[0] = input.nextInt();
		
		System.out.print("Duração do estágio 2 - Lavação Normal: ");
		estagio[1] = input.nextInt();
		
		System.out.print("Duração do estágio 3 - Lavação Rápida: ");
		estagio[2] = input.nextInt();
		
		System.out.print("Duração do estágio 4 - Enxague: ");
		estagio[3] = input.nextInt();
		
		System.out.print("Duração do estágio 5 - Centrifuga: ");
		estagio[4]= input.nextInt();
	}
	public static void simulaMaquina() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		int option = input.nextInt();
		switch (option) {
			case 1:
				lavacaoPesada();
				lavacaoNormal();
				lavacaoLeve();
				enxague();
				centrifugar();
				break;
			case 2:
				lavacaoNormal();
				lavacaoLeve();
				enxague();
				centrifugar();
				break;
			case 3:
				lavacaoLeve();
				enxague();
				centrifugar();
				break;
			case 4:
				enxague();
				centrifugar();
				break;
			case 5:
				centrifugar();
				break;
			default:
				System.out.println("Insira uma opção válida");
				break;
		}
		System.out.println("Simulaçãoa Finalizada\n");
	}

	public static void lavacaoPesada() throws InterruptedException {
		int time = (estagio[0]*1000)/5;
		System.out.println("\nLAVAGEM PESADA");
		System.out.println("0%    20%     40%     60%     80%    100%");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
		Thread.sleep(time);
		System.out.print("========");
		}
		System.out.print("]");
		System.out.print("\n");
	}
	public static void lavacaoNormal() throws InterruptedException {
		int time = (estagio[1]*1000)/5;
		System.out.println("\nLAVAGEM NORMAL");
		System.out.println("0%    20%     40%     60%     80%    100%");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
		Thread.sleep(time);
		System.out.print("========");
		}
		System.out.print("]");
		System.out.print("\n");
	}
	public static void lavacaoLeve() throws InterruptedException {
		int time = (estagio[2]*1000)/5;
		System.out.println("\nLAVAGEM LEVE");
		System.out.println("0%    20%     40%     60%     80%    100%");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
		Thread.sleep(time);
		System.out.print("========");
		}
		System.out.print("]");
		System.out.print("\n");
	}
	public static void enxague() throws InterruptedException {
		int time = (estagio[3]*1000)/5;
		System.out.println("\nENXAGUE");
		System.out.println("0%    20%     40%     60%     80%    100%");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
		Thread.sleep(time);
		System.out.print("========");
		}
		System.out.print("]");
		System.out.print("\n");
	}
	public static void centrifugar() throws InterruptedException {
		int time = (estagio[4]*1000)/5;
		System.out.println("\nCENTRIFUGAR");
		System.out.println("0%    20%     40%     60%     80%    100%");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
		Thread.sleep(time);
		System.out.print("========");
		}
		System.out.print("]");
		System.out.print("\n");
	}
	
}
