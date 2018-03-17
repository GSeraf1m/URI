import java.util.Scanner;
public class URI1241 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i;
		for(i=0;i<n;i++){
			String A = scan.next(), B = scan.next();
			if(A.endsWith(B)){
				System.out.println("encaixa");
			}else{
				System.out.println("nao encaixa");
			}
		}
	}
}