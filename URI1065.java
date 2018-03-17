import java.util.Scanner;
public class URI1065 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,x,cont=0;
		for(i=0;i<5;i++){
			x=scan.nextInt();
			if(x%2==0){
				cont++;
			}
		}
		System.out.println(cont+" valores pares");
	}
}