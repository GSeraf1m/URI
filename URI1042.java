import java.util.Arrays;
import java.util.Scanner;
public class URI1042 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int[]X = new int[3];
		int[]Y = new int[3];
		int i;
		for(i=0;i<=2;i++){
			X[i]=scan.nextInt();
		}
		for(i=0;i<=2;i++){
			Y[i]=X[i];
		}
		Arrays.sort(Y);
		for(i=0;i<=2;i++){
			System.out.println(Y[i]);
		}
		System.out.println("");
		for(i=0;i<=2;i++){
			System.out.println(X[i]);
		}
	}
}
