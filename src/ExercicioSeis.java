import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.println("Digite um n�mero de lados");
		lado=l.nextInt();
		if (lado<3) {
			System.out.println("N�O � UM POL�GONO");
		} else {
			if (lado>5) {
				System.out.println("POL�GONO N�O IDENTIFICADO");
			}
		}
	 
	l.close();
	}

}

