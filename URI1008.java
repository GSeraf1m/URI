import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1008 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int n=scan.nextInt(),hrs=scan.nextInt();
		double phr=scan.nextDouble(), salario =hrs*phr;
		System.out.println("NUMBER = "+n+"\nSALARY = U$ "+df.format(salario));
	}
}