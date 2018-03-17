import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1018 {
	public static void main(String[] args) {
		double nota100,nota50,nota20,nota10,nota5,nota2, nota1,x;
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		x = scan.nextDouble();
		nota100 =(int) x / 100;
		nota50 =(int)(x%100) / 50;
		nota20 =(int)((x%100)%50)/20;
		nota10 = (int)(((x%100)%50)%20) / 10;
		nota5 = (int)((((x%100)%50)%20)%10)/ 5;
		nota2 =(int) (((((x%100)%50)%20)%10)%5)/ 2;
		nota1 =(int) ((((((x%100)%50)%20)%10)%5)%2)/ 1;
		System.out.println(df.format(x));
		System.out.print(df.format(nota100) +" nota(s) de R$ 100,00\n");
		System.out.print(df.format(nota50) +" nota(s) de R$ 50,00\n");
		System.out.print(df.format(nota20 )+" nota(s) de R$ 20,00\n");
		System.out.print(df.format(nota10) +" nota(s) de R$ 10,00\n");
		System.out.print(df.format(nota5) +" nota(s) de R$ 5,00\n");
		System.out.print(df.format(nota2) +" nota(s) de R$ 2,00\n");
		System.out.print(df.format(nota1) +" nota(s) de R$ 1,00\n");
	}
}