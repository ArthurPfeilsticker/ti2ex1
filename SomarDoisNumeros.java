/**Arthur L F Pfeilsticker
 *TI 2
 *Exercicio 1
 *Data: 12/8/22
 *Entrega: 26/8/22
 */


import java.util.*;

class SomarDoisNumeros {
	
	//instanciar leitura do teclado
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		//declaracao de variaveis
		int num1, num2, soma;
		
		//leitura das variaveis
		System.out.print("Digite um número: ");
		num1 = scanner.nextInt();
		System.out.print("Digite outro número: ");
		num2 = scanner.nextInt();
		
		//soma
		soma = num1 + num2;
		
		//mostra na tela
		System.out.print("Soma: " + soma);
	}
}
