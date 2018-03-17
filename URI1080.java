import java.util.Scanner;
public class URI1080 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, x, maior=0,cont=0;
		for(i=1;i<101;i++){
			x=scan.nextInt();
			if(x>maior){
				maior=x;
				cont=i;
			}
		}
		System.out.println(maior);
		System.out.println(cont);
	}
}