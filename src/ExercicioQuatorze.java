import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//int [] valor = {i};
		int maiorN = 0;
		int n = 0;
		int vezes = 0;
		

		while (vezes<10) {
			System.out.println("Digite um n�mero inteiro:");
			n=entrada.nextInt();
			vezes ++;
			if (n>maiorN) {
				maiorN=n;
			}
		}
		System.out.println("O maior n�mero digitado �: " + maiorN);
		//for(int i : valor) {
			//System.out.println("Digite um valor:");
			//i=entrada.nextInt();
			//if(valor>maiorN) {
				//maiorN=valor;
				//System.out.println("O maior n�mero �:" + maiorN);
			//}
		//}
	
//Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.
		entrada.close();
	}

}
