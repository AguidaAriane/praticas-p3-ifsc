 package lista1_6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[10];
		 
		 Scanner leitura = new Scanner(System.in);
		 
		 for (int i = 0; i < numero.length; i++) {
			numero[i] = leitura.nextInt(); 
		}
		 int numemaior = numero[0];
		 int numemenor = numero[0];
		 
		 for (int i = 0; i < numero.length; i++){
			if(numero[i] > numemaior){ 
	          numemaior = numero[i];
			
			} 
		 if(numero[i] < numemenor) {
			 numemenor = numero[i];
		 }
		 }
	    System.out.println("maior:"  + numemaior);
	    System.out.println("menor:" + numemenor);
	 }
	}

	
	
	
