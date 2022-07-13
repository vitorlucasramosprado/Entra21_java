package listaDeExercicios3;

import java.util.Calendar;

public class teste {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String data = "01/05/2016";
		
		int anoAdmissao = Integer.parseInt(data.substring(6));
		
		int anoAtual = c.get(Calendar.YEAR);
		System.out.println("Ano entrada: "+ anoAdmissao +
							"\nAtual : " + anoAtual);
		
		int tempoTrabalhado =(anoAtual - anoAdmissao) / 3;
		
      	
      	
      	System.out.println("Anos trabalhados:" + tempoTrabalhado);
		
//		System.out.println(c.getTime());
		
		int entrada = c.get(Calendar.YEAR);		
		
	}

}

//String ano = data.substring(6);
//int anoAtual =  2022;
//int tempoTrabalho = anoAtual - Integer.parseInt(ano);