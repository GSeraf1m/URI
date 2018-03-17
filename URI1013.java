import java.util.Scanner;
public class URI1013 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),maiorAB=(a+b+Math.abs(a-b))/2,maiorBC=(maiorAB+c+Math.abs(maiorAB-c))/2;
		System.out.println(maiorBC+" eh o maior");
	}
}