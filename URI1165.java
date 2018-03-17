import java.util.Scanner;
public class URI1165 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i,ind;
		for(i=0;i<n;i++){
			int cont=0, x;
			x=scan.nextInt();
			for(ind=1;ind<=x;ind++){
				if(x%ind==0){
					cont++;
				}
			}
			if(cont>2){
				System.out.println(x+" nao eh primo");
			}else{
				System.out.println(x+" eh primo");
			}
		}
	}
}