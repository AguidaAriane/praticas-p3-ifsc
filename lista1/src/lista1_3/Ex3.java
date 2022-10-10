package lista1_3;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
	  
	  
	  Scanner leitura = new Scanner(System.in);
		
		Integer numero = Integer.valueOf(leitura.nextLine()); 
		
		if(numero % 2 == 0 ) {
			System.out.println("Esse nÃºmero Ã© par");
		}
		else{
			System.out.println("Esse nÃºmero Ã© impar");
		}
}
}
