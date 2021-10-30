import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int mc = 0;
		double valor = 0;
		
		System.out.println("Quanta(s) maçã(s) você irá comprar?");
		mc=entrada.nextInt();
		
		if (mc<12) {
			valor = mc*0.30;
			System.out.printf("Valor da compra: " + valor);
		}else {
			if (mc>=12) {
				valor = mc*0.25;
				System.out.printf("Valor da compra: " + valor);
			}
		}	
		entrada.close();
	}
}
