package aula_01_variaveis;

import java.util.Scanner;

public class aula_01_variaveis {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int numero1 =10;
		int numero2 =5;
		float numero3, numero4;
		String nome;
		char opcao = 'N';
		
		System.out.println("variável numero1 = " + numero1);
		
		System.out.println("variável numero2 = " + numero2);
		
		System.out.printf("%d + %d = %d\n" , numero1, numero2, numero1 + numero2);
		
		System.out.printf("Digite seu nome");
		nome = read.nextLine();
		
		System.out.printf("digite um valor real: " );
		numero3 = read.nextFloat();
		
		System.out.printf("digite um valor real: " );
		numero4 = read.nextFloat();
		
		System.out.printf("%.2f + %.2f = %.2f" , numero3, numero4, numero3 * numero4);
		
	}

}
