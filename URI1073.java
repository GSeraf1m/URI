import java.util.Scanner;
public class URI1073 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int x,i,n=scan.nextInt();
		for(i=2;i<=n;i++){
			if(i%2==0){
				x=i*i;
				System.out.println(i+"^2 = "+x);
			}
		}
	}
}