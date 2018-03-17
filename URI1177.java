import java.util.Scanner;
public class URI1177 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int[]n = new int[1000];
		int x=scan.nextInt(),i,y=0;
		for(i=1;i<=1000;i++){
			n[i-1]=y;
			if(i%x==0){
				y=0;
			}else{
				y++;
			}
		}
		for(i=0;i<1000;i++){
			System.out.println("N["+i+"] = "+n[i]);
		}
	}
}