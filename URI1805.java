import java.util.Scanner;
public class URI1805 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		long x=scan.nextInt(), y=scan.nextInt(), soma=0, i;
		for(i=x;i<=y;i++){
			soma+=i;
		}
		System.out.println(soma);
	}
}