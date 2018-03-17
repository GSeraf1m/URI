import java.util.Scanner;
public class URI1101 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,x=scan.nextInt(),y=scan.nextInt();
		while(x>0&&y>0){
			int soma=0;
			if(x>y){
				for(i=y;i<=x;i++){
					System.out.print(i+" ");
					soma+=i;
				}
			}else{
				for(i=x;i<=y;i++){
					System.out.print(i+" ");
					soma+=i;
				}
			}
			System.out.println("Sum="+soma);
			x=scan.nextInt(); y=scan.nextInt();
		}
	}
}