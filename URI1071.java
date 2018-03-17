import java.util.Scanner;
public class URI1071 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),cont=0,i;
		if(a>b){
			for(i=b+1;i<a;i++){
				if(!(i%2==0)){
					cont+=i;
				}
			}
		}else{
			for(i=a+1;i<b;i++){
				if(!(i%2==0)){
					cont+=i;
				}
			}
		}
		System.out.println(cont);
	}
}