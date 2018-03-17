import java.util.Scanner;
public class URI1143 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i,pow,pow2;
		for(i=1;i<=n;i++){
			pow=i*i;
			pow2=i*i*i;
			System.out.print(i+" ");
			System.out.print(pow+" ");
			System.out.println(pow2);
		}
	}
}