import java.util.Scanner;
public class URI1145 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt(),n=scan.nextInt(),i;
		for(i=1;i<=n;i++){
			if(i%x==0){
				System.out.println(i);
			}else{
				System.out.print(i+" ");
			}
		}
	}
}