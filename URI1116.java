import java.util.Scanner;
public class URI1116 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,n=scan.nextInt();
		for(i=0;i<n;i++){
			double x=scan.nextInt(),y=scan.nextInt(),divisao;
			if(y==0){
				System.out.println("divisao impossivel");
			}else{
				divisao=x/y;
				System.out.printf("%.1f\n",divisao);
			}
		}
	}
}