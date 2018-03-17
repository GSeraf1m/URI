import java.util.Scanner;
public class URI1044 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt();
		if(a%b==0||b%a==0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}
}
