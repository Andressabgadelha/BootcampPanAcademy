import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filhos = 0;
		double salario=0.0;
		double totalSalario = 0.0;
		double totalFilhos = 0.0;
		double maiorSalario=0.0;
		double salarioAte100= 0.0;
		
		
		for(int i=1; i<=20; i++) {
			System.out.println("Quantos filhos você tem? ");
	    filhos=entrada.nextInt();
	    System.out.println("Digite o valor do seu salário: ");
	    salario=entrada.nextDouble();
	    totalFilhos+=filhos;
	    totalSalario+=salario;
	    if(salario<=100) {
	    	salarioAte100 = salarioAte100 +1;
	    }
	    if (salario>maiorSalario) {
	    	maiorSalario=salario;
	    }
		}
		double percentual=(salarioAte100/20)*100;
		double mediaSalario= totalSalario / 20;
		double mediaFilhos= totalFilhos / 20;
		System.out.println("A média do salário da população é: R$"+mediaSalario);
		System.out.println("A média do número de filhos da população é: " + mediaFilhos);
		System.out.println("Maior salário: R$"+maiorSalario);
		System.out.println("O percentual de pessoas com salário até R$100,00 é: " + percentual);
		
		
		entrada.close();
		
				
	}

}
