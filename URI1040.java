import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		
		float N1, N2, N3, N4,media,N5,recmedia;
		Scanner scan =new Scanner(System.in);
		N1 =scan.nextFloat();
		N2 =scan.nextFloat();
		N3 =scan.nextFloat();
		N4 =scan.nextFloat();
		
		media =((N1 * 2)+(N2 * 3)+( N3 * 4)+(N4 * 1))/10;
		
		if (media >= 7.0) {
			
			 System.out.printf("Media: %.1f\n",media);
			 System.out.print("Aluno aprovado.\n");
			 
		}
		
		else if (media >= 5.0 && media <= 6.9) {
			
			System.out.printf("Media: %.1f\n",media);
			System.out.print("Aluno em exame.\n");
			N5 =scan.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",N5);
			recmedia =(media + N5) / 2;
			
			if (recmedia >= 5.0) {
				System.out.print("Aluno aprovado.\n");
				
			}else {
				System.out.print("Aluno reprovado.\n");
				
			}
			
			System.out.printf("Media final: %.1f\n",recmedia);
			
		}
		
		else if (media < 5.0) {
			
			System.out.printf("Media: %.1f\n",media);
			System.out.print("Aluno reprovado.\n");
			
		}
	}

}