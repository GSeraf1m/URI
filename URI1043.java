import java.util.Scanner;
public class URI1043 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double A=Math.abs(scan.nextDouble()),B=Math.abs(scan.nextDouble()),C=Math.abs(scan.nextDouble()), area,perimetro;
		if(A!=0 && B!=0 && C!=0){
			if(A<(B+C)&&B<(C+A)&&C<(B+A)){
				perimetro=(A+B+C);
				System.out.printf("Perimetro = %.1f\n",perimetro);
			}else{
				area=Math.abs(((C*(A+B))/2));
				System.out.printf("Area = %.1f\n",area);
			}
		}
	}
}