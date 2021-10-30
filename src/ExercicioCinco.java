
public class ExercicioCinco {

	public static void main(String[] args) {
		int angulo1 = 100;
		int angulo2 = 40;
		int angulo3 = 40;

		if (angulo1 + angulo2 + angulo3 == 180) {
			if (angulo1>90 || angulo2>90 || angulo3>90) {
				System.out.println("Triângulo Obtusângulo");
			} else {
				if (angulo1<90 && angulo2<90 && angulo3<90) {
					System.out.println("Triângulo Acutângulo");
				}else {
					if(angulo1==90 || angulo2==90 || angulo3==90) {
						System.out.println("Triângulo Retângulo");
					}
				}
			}
		} else {
			System.out.println("Não é um Triângulo");
		}
	}

}
