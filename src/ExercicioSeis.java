import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.println("Digite um número de lados");
		lado=l.nextInt();
		if (lado<3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else {
			if (lado>5) {
				System.out.println("POLÍGONO NÃO IDENTIFICADO");
			}
		}
	 
	l.close();
	}

}

