import java.util.Scanner;
public class URI1759 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,n=scan.nextInt();
		for(i=0;i<n;i++){
			if(i==(n-1)){
				System.out.println("Ho!");
			}else{
			System.out.print("Ho ");
			}
		}
	}
}