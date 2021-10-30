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
			System.out.println("Você ainda não pode votar, mas poderá votar quando fizer 16 anos.");
			
		} else {
			if (idade>=16 && idade<18 || idade>70) {
				System.out.println("Você pode votar");
				System.out.println("O seu voto não é obrigatório");
		}
			else {
				if (idade>=18 && idade<70) {
					System.out.println("Você pode votar");
					System.out.println("O seu voto é obrigatório");
			}
		 
		}
			
			} 
		entrada.close();
	}

}
