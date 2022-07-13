package listaDeExercicios2;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] numeros=  new int[10];
		
		int qtdPares = 0;
		
		numeros[0] = 2;
		numeros[1] = 1;
		numeros[2] = 4;
		numeros[3] = 1;
		numeros[4] = 2;
		numeros[5] = 1;
		numeros[6] = 1;
		numeros[7] = 1;
		numeros[8] = 6;
		numeros[9] = 1;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] % 2 == 0) {
				qtdPares++;
				System.out.println("Números pares: " + numeros[i]);
			}
		}
		System.out.println("\nQuantidade de pares: " + qtdPares);
	}

}
