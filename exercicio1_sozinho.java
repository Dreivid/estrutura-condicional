package estrutura_condicional;

import java.util.Scanner;

public class exercicio1_sozinho {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("O numero inteiro é negativo?: ");
		num = sc.nextInt();
		
		if (num > 0) {
		System.out.println("NAO NEGATIVO");
		} 
			else {
		System.out.println("NEGATIVO");
			}
		
		sc.close();

	}

}
