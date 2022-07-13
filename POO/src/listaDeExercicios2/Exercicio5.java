package listaDeExercicios2;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int origem[] = new int[10];
		int resultado[] = new int[10];
		
		origem[0] = 7;
		origem[1] = 5;
		origem[2] = 2;
		origem[3] = 9;
		origem[4] = 13;
		origem[5] = 27;
		origem[6] = 1;
		origem[7] = 4;
		origem[8] = 17;
		origem[9] = 15;
		
		for (int i = 0; i < origem.length; i++) {
			if (origem[i]% 2 == 0 ) {
				resultado[i] = 1;
			}else {
				resultado[i] = 0;
			}
		}
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]); 
		}
		
	}

}
