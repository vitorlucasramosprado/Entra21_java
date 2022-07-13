package listaExercicio1;

import java.util.Scanner;

public class ExercicioTeste {


	public static void main(String[] args) {
	
        Scanner entrada = new Scanner(System.in);  
		
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = entrada.nextLine();
        
        System.out.print("nota 1: ");
        float nota1 = entrada.nextInt();
        
        System.out.print("nota 2: ");
        float nota2 = entrada.nextInt();
        
        float media = (nota1 + nota2)/2;
        
        System.out.println(
        		"\nNome: " + nome + 
        		"\nMatricula: " + matricula + 
        		"\nMedia: " + media
        		);
        
 


	}

}
