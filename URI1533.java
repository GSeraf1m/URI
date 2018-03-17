import java.util.Scanner;
import java.util.Arrays;
public class URI1533 {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		while(true){
			int n=scan.nextInt(),i;
			if(n==0){
				break;
			}
			int [] suspeitos = new int[n];
			int [] order = new int[n];
			for(i=0;i<n;i++){
				order[i]=scan.nextInt();
				suspeitos[i]=order[i];
			}
			Arrays.sort(order);
			for(i=0;i<n;i++){
				if(suspeitos[i]==order[n-2]){
					System.out.println(i+1);
				}
			}
		}
	}
}