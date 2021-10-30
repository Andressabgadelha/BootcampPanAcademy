import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numberGerado = 67;
		int tentativa = 10;
		int number = 0;
		
		while (tentativa>0 ){
			System.out.println("Digite um número entre 0 e 100");
			number=entrada.nextInt();
			tentativa --;
			if (number>100 || number<0) {
				System.out.println("Número inválido");
				tentativa ++;
			}
			else {
				if (number>numberGerado) {
				System.out.println("O número digitado é maior que o número armazenado.");
				System.out.println("Você ainda tem " + tentativa +" tentativas.");
			} else {
				if (number<numberGerado) {
					System.out.println("O número digitado é menor que o número armazenado.");
					System.out.println("Você ainda tem " + tentativa +" tentativas.");
				}else {
					if(number == numberGerado) {
						System.out.println("Parabéns! Você acertou!");
						break;
					}
				}
			}
				
			} 
		
		}
//Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
//Armazene um número aleatório em uma variável. O jogador tem 10 
//tentativas para adivinhar o número gerado. Ao final de cada 
//tentativa, imprima a quantidade de tentativas restantes, e imprima
//se o número inserido é maior ou menor do que o número armazenado. 
//- Caso deseje, utilize o método Random() da coleção java util para sortear
//o número: import java.util.Random; Random numeroAleatorio = new Random();

		entrada.close();
	}

}
