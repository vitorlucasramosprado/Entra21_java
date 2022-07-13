package listaDeExercicios2;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int numeros[] =  new int[10];
		int soma = 0;
		
		numeros[0] = 3;
		numeros[1] = 2;
		numeros[2] = 1;
		numeros[3] = 3;
		numeros[4] = 5;
		numeros[5] = 3;
		numeros[6] = 7;
		numeros[7] = 4;
		numeros[8] = 3;
		numeros[9] = 10;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 3 == 0 || numeros[i] == 1) {
				soma += numeros[i];
			}
			
		}
		
		double media = soma / numeros.length;
		
		System.out.println("Média aritmética: " + media);
	}

}
