import java.util.Scanner;
public class URI1075 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i;
		for(i=1;i<10000;i++){
			if(i%n==2){
				System.out.println(i);
			}
		}
	}
}