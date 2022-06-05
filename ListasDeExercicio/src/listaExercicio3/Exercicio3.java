package listaExercicio3;

import java.util.Scanner;

public class Exercicio3 {
/**
 * 
 * @param Dado uma distância em metros, o programa deve converter o valor em quilômetros, centímetros
 * e milímetros. Exemplo: Digitado o valor 200, o sistema deve mostrar a msg na tela: 200 metros equivale(m) 0.2 km,
 *  20000.0 cm e 200000.0 mm.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float distancia = entrada.nextFloat();
		 
		float kilometros = distancia/1000;
		
		float centimetros = distancia*100;
		
		float milimetros = distancia*1000;
		
		System.out.print(distancia+" metros equivale a "+kilometros+"km, "+centimetros+"cm e "+milimetros+"mm");	
		
	}

}
