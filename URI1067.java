import java.util.Scanner;
public class URI1067 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,n=scan.nextInt();
		for(i=1;i<=n;i++){
			if(!(i%2==0)){
				System.out.println(i);
			}
		}
	}
}