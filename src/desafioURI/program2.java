package desafioURI;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		int cont = 0;
		double soma = 0;
		int n = 0;
		
		 while(true) {
		 n = sc.nextInt();
			 if(n > 0) {
				 soma += n;
				  cont++;
			 }
			 else 
			 break;
		 }
			 double media = soma / cont;
			 
			 System.out.printf("%.2f", media);
			 
			sc.close();

	}

}
