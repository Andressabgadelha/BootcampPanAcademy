import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		int n1 = 0;
		int n2= 0;
		int media =0;
		
		System.out.println("Digite a sua primeira nota");
		n1=nota.nextInt();
		System.out.println("Digite a sua segunda nota");
		n2=nota.nextInt();
		
		media=(n1+n2)/2;
		
		if (media >=0 && media <=10) {
			if (media<7) {
				System.out.println("Reprovado");
			} else {
				if (media  >=7 && media <10) {
					System.out.println("Aprovado");
				} else {
					System.out.println("Aprovado com distinção");
				}
			}
		} else {
			System.out.println("Valor inválido");
		}
		
		nota.close();

	}

}
