import java.util.Scanner;
public class URI1144 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i=1,x,pow,pow2;
		for(x=1;x<=n*2;x++){
			System.out.print(i+" ");
			if(x%2==0){
				pow=(i*i)+1;
				pow2=(i*i*i)+1;
				i++;
			}else{
				pow=i*i;
				pow2=i*i*i;
			}
			System.out.print(pow+" ");
			System.out.println(pow2);
		}
	}
}