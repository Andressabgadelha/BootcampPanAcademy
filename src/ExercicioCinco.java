
public class ExercicioCinco {

	public static void main(String[] args) {
		int angulo1 = 100;
		int angulo2 = 40;
		int angulo3 = 40;

		if (angulo1 + angulo2 + angulo3 == 180) {
			if (angulo1>90 || angulo2>90 || angulo3>90) {
				System.out.println("Tri�ngulo Obtus�ngulo");
			} else {
				if (angulo1<90 && angulo2<90 && angulo3<90) {
					System.out.println("Tri�ngulo Acut�ngulo");
				}else {
					if(angulo1==90 || angulo2==90 || angulo3==90) {
						System.out.println("Tri�ngulo Ret�ngulo");
					}
				}
			}
		} else {
			System.out.println("N�o � um Tri�ngulo");
		}
	}

}
