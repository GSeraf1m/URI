import java.util.Scanner;
public class URI1142 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,n=(scan.nextInt())*4;
		for(i=1;i<=n;i++){
			if(i%4==0){
				System.out.println("PUM");
			}else{
				System.out.print(i+" ");
			}
		}
	}
}