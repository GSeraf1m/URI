import java.util.Scanner;
public class URI1555 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(), i;
		for(i=0;i<n;i++){
			int x=scan.nextInt(),y=scan.nextInt();
			double carlos,rafael,beto;
			rafael=(Math.pow((3*x), 2)+Math.pow(y, 2));
			beto=(2*Math.pow(x, 2))+Math.pow((5*y), 2);
			carlos= (-100*x+Math.pow(y, 3));
			if(carlos > beto && carlos > rafael){
				System.out.println("Carlos ganhou");
			}else if(beto> carlos && beto > rafael){
				System.out.println("Beto ganhou");
			}else{
				System.out.println("Rafael ganhou");
			}
		}
	}
}