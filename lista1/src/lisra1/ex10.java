package lisra1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		float soma = 0;
		float total;
		float[]notas = new float[3];
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite suas 3 notas:");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = leitura.nextFloat();
		 soma = soma + notas[i];
		}
		total = soma/3;
		System.out.println("Calculo aritmetico :");
		System.out.println(total);
	
	if(total < 4) {
		System.out.println("REPROVADO");
	}
	else if( total >= 4 && total < 6 ) {
		System.out.println("RECUPERAÇÃO");
	}
	else {
		System.out.println("APROVADO");
	}
	}

}
