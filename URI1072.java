import java.util.Scanner;
public class URI1072 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(), i, X, in=0,out=0;
		for(i=0;i<n;i++){
			X=scan.nextInt();
			if(X>=10 && X<=20){
				in++;
			}else{
				out++;
			}
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
	}
}