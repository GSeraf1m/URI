import java.util.Scanner;
public class URI1070 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,n=scan.nextInt();
		for(i=n;i<=n+12;i++){
			if(!(i%2==0)){
				System.out.println(i);
			}
		}
	}
}