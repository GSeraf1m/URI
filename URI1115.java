import java.util.Scanner;
public class URI1115 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double eixox=scan.nextDouble(), eixoy=scan.nextDouble();
		while(eixox!=0 && eixoy!=0){
			if(eixox>0){
				if(eixoy>0){
					System.out.println("primeiro");
				}else if(eixoy<0){
					System.out.println("quarto");
				}
			}else if(eixox<0){
				if(eixoy>0){
					System.out.println("segundo");
				}else if(eixoy<0){
					System.out.println("terceiro");
					}
				}
			eixox=scan.nextDouble(); eixoy=scan.nextDouble();
		}
	}
}