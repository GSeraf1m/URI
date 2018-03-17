import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1174 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double[]A= new double[100];
		int i;
		for(i=0;i<100;i++){
			A[i]=scan.nextDouble();
		}
		for(i=0;i<100;i++){
			if(A[i]<=10){
				System.out.println("A["+i+"] = "+df.format(A[i]));
			}
		}
	}
}