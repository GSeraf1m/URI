import java.util.Scanner;
public class URI1041 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double eixox=scan.nextDouble(), eixoy=scan.nextDouble();
		if(eixox>0){
			if(eixoy>0){
				System.out.println("Q1");
			}else if(eixoy<0){
				System.out.println("Q4");
			}else{
				System.out.println("Eixo X");
			}
		}else if(eixox<0){
			if(eixoy>0){
				System.out.println("Q2");
			}else if(eixoy<0){
				System.out.println("Q3");
			}else{
				System.out.println("Eixo X");
			}
		}else{
			if(eixoy==0){
				System.out.println("Origem");
			}else{
				System.out.println("Eixo Y");
			}
		}
	}
}