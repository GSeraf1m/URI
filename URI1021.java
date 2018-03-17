import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) {
		double nota100,nota50,nota20,nota10,nota5,nota2, moeda1,moeda5,moeda25,moeda10,moeda05,moeda01,moeda,x;
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		x = scan.nextDouble();
		moeda = x*100;
		nota100 =(int) x / 100;
		x%=100;
		nota50 =(int)x / 50;
		x%=50;
		nota20 =(int)x/ 20;
		x%=20;
		nota10 = (int)x / 10;
		x%=10;
		nota5 = (int)x/ 5;
		x%=5;
		nota2 =(int) x/ 2;
		x%=2;
		moeda1 =(int) x/ 1;
		x%=1;
		moeda= moeda%100;
		moeda5 = (int) moeda / 50;
		moeda%=50;
		moeda25 =(int) moeda/25;
		moeda%=25;
		moeda10 = (int)moeda/10;
		moeda%=10;
		moeda05 = (int)moeda/5;
		moeda%=5;
		moeda01 =(int) moeda/1;
		System.out.print("NOTAS:\n");
		System.out.print(df.format(nota100) +" nota(s) de R$ 100.00\n");
		System.out.print(df.format(nota50) +" nota(s) de R$ 50.00\n");
		System.out.print(df.format(nota20 )+" nota(s) de R$ 20.00\n");
		System.out.print(df.format(nota10) +" nota(s) de R$ 10.00\n");
		System.out.print(df.format(nota5) +" nota(s) de R$ 5.00\n");
		System.out.print(df.format(nota2) +" nota(s) de R$ 2.00\n");
		System.out.print("MOEDAS:\n");
		System.out.print(df.format(moeda1) +" moeda(s) de R$ 1.00\n");
		System.out.print(df.format(moeda5) +" moeda(s) de R$ 0.50\n");
		System.out.print(df.format(moeda25) +" moeda(s) de R$ 0.25\n");
		System.out.print(df.format(moeda10) +" moeda(s) de R$ 0.10\n");
		System.out.print(df.format(moeda05) +" moeda(s) de R$ 0.05\n");
		System.out.print(df.format(moeda01) +" moeda(s) de R$ 0.01\n");

	}

}