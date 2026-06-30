package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {


				Scanner leia = new Scanner(System.in);
				
				final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
				
				System.out.print("Digite o valor total da compra: R$ ");
				double valorCompra = leia.nextDouble();
				
				System.out.print("O Cliente é Prime? ");
				boolean isPrime = leia.nextBoolean();
				
				boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
				
				System.out.println("\n--- Status do Pedido ---");
				System.out.printf("Valor da Compra: R$ %.2f\n", valorCompra);
				System.out.printf("Cliente Prime? %b\n", isPrime);
				System.out.printf("Frete Grátis? %b\n", ganhouFrete);
				
				leia.close();
			}

		}