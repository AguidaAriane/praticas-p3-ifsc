package lista_5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    	Scanner leitura = new Scanner(System.in);
		Integer numero = Integer.valueOf(leitura.nextLine());
		numero = 0;
		
		while (numero < 99) {
			numero++;
			System.out.println(numero);
	}
}
}