import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1010 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int cdg1 = scan.nextInt(),qnt1=scan.nextInt();
		double valor1 = scan.nextDouble()*qnt1; 
		int cdg2 = scan.nextInt(),qnt2=scan.nextInt(); 
		double valor2 = scan.nextDouble()*qnt2, total=valor1+valor2;
		System.out.println("VALOR A PAGAR: R$ "+df.format(total));
	}
}