import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anoAtual = 2021;
		int anoNascimento = 0;
		int idade = 0;
		
		System.out.println("Digite o seu ano de Nascimento");
		anoNascimento=entrada.nextInt();
		idade=anoAtual-anoNascimento;
		
		if (idade<16) {
			System.out.println("Voc� ainda n�o pode votar, mas poder� votar quando fizer 16 anos.");
			
		} else {
			if (idade>=16 && idade<18 || idade>70) {
				System.out.println("Voc� pode votar");
				System.out.println("O seu voto n�o � obrigat�rio");
		}
			else {
				if (idade>=18 && idade<70) {
					System.out.println("Voc� pode votar");
					System.out.println("O seu voto � obrigat�rio");
			}
		 
		}
			
			} 
		entrada.close();
	}

}
