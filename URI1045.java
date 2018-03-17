import java.util.Scanner;
import java.util.Arrays;
public class URI1045 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double [] x= new double[3];
		for(int i=0;i<3;i++){
			x[i]=scan.nextDouble();
		}
		Arrays.sort(x);
		double a = x[2],b =x[1],c =x[0], a2=a*a,b2=b*b,c2=c*c;
		if(a>=b+c){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(a2==(b2+c2)){
				System.out.println("TRIANGULO RETANGULO");
			}else if(a2>(b2+c2)){
				System.out.println("TRIANGULO OBTUSANGULO");
			}else if(a2<(b2+c2)){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a==b && b==c){
				System.out.println("TRIANGULO EQUILATERO");
			}else if(a==b || a==c || b==c){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}