import java.util.Scanner;
public class URI1175 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int[]n = new int[20]; int []x = new int[20];
		int i,y=19;
		for(i=0; i<20;i++){
			n[i]=scan.nextInt();
			x[y]=n[i];
			y--;
		}
		for(i=0;i<20;i++){
			System.out.println("N["+i+"] = "+x[i]);
		}
	}
}