
public class ExercicioUm {

	public static void main(String[] args) {
		int n1 = 8;
		int n2 = 20;
		int n3 = 10;
		int maior = 0;
		int menor = 0;
		
		if (n1>n2 && n1>n3) {
			maior = n1;
			if (n2>n3) {
				menor = n3;
			}else {
				menor = n2;
			}
			
		}else {
			if (n2>n3 && n2>n1) {
				maior = n2;
				if (n1>n3) {
					menor = n3;
				} else {
					menor = n1;
				}
			} else {
				if (n3>n1 && n3>n2) {
					maior = n3;
					if(n2>n1) {
						menor =n1;
					}else {
						menor = n2;
					}
				}
			} 
		} if (maior == menor) {
			System.out.println("Os numeros são iguais");
		}else {
			System.out.println("O numero maior é " + maior);
			System.out.println("O numero menor é " + menor);
		}

	}

}
