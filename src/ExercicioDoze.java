import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nInserido = 0;
		int nSoma = 0;
		
		while (nInserido>=0) {
			System.out.println("Digite um número inteiro.");
			nInserido=entrada.nextInt();
			nSoma+=nInserido;
			System.out.println("Soma dos números inseridos é: " + nSoma);
			if (nInserido<=0) {
				break;
			}
		}
		
//Criar um programa que, enquanto estiver recebendo números positivos, 
//imprime no console a soma dos números inseridos, caso receba um número 
//negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		entrada.close();

	}

}
