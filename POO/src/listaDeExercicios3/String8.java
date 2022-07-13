package listaDeExercicios3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class String8 {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Insira sua data de nascimento(dd/MM/yyyy)");
		String nascimento = input.next();
		
		Date dataFormatada = formato.parse(nascimento);
		Locale local = new Locale("pt","BR");
		DateFormat formato1 = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy",local);
		System.out.println("Você nasceu em " + formato1.format( dataFormatada));
	}

}
