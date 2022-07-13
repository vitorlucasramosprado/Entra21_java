package listaDeExercicios3;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um verbo regular terminado em AR:");
		String verbo = input.next();
		
		int posicaoAr = verbo.lastIndexOf("ar");		

		String semConjugar = verbo.substring(0,posicaoAr);
		
		String eu = semConjugar + "o";		
		System.out.println("Eu "+eu);
		
		String tu = semConjugar + "as";		
		System.out.println("Tu "+tu);
		
		String ele = semConjugar + "a";		
		System.out.println("Ele "+ele);
		
		String nos = semConjugar + "amos";		
		System.out.println("Nós "+nos);
		
		String vos = semConjugar + "ais";		
		System.out.println("Vós "+vos);
		
		String eles = semConjugar + "am";		
		System.out.println("Eles "+eles);
		
	}

}
