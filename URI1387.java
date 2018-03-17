import java.util.Scanner;
public class URI1387 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),soma=a+b;
		while(a!=0 && b!=0){
			System.out.println(soma);
			a=scan.nextInt();b=scan.nextInt();soma=a+b;
		}
	}
}