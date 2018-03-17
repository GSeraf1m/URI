import java.util.Scanner;
public class URI2157 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i,index;
		for(i=0;i<n;i++){
			String x="";
			int a=scan.nextInt(), b=scan.nextInt();
			for(index=a;index<=b;index++){
				System.out.print(index);
				x+= index;
			}
			for(index=x.length()-1;index>=0;index--){
				System.out.print(x.charAt(index));
			}
			System.out.println();
		}
	}
}