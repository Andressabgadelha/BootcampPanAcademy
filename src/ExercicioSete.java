import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int lado1 = 20;
		int lado2 = 50;
		int lado3 = 30;
		
		if (lado1==lado2 && lado2==lado3) {
			System.out.println("Triângulo Equilátero");
		}else {
			if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
				System.out.println("Triângulo Escaleno");
			}else {
				if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
					System.out.println("Triângulo Isóscele");
				}
			}
		}
	
	l.close();
	
	}

}



