import java.util.Scanner;
public class URI1007 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt(),diferenca=(a*b)-(c*d);
		System.out.println("DIFERENCA = "+diferenca);
	}
}