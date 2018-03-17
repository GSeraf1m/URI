import java.util.Scanner;
public class URI1099 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,index,n=scan.nextInt();
		for(i=0;i<n;i++){
			int a=scan.nextInt(),b=scan.nextInt(),cont=0;
			if(b>a){	
				for(index=a+1;index<b;index++){
					if(!(index%2==0)){
						cont+=index;
					}
				}
			}else{
				for(index=b+1;index<a;index++){
					if(!(index%2==0)){
						cont+=index;
					}
				}
			}
			System.out.println(cont);
		}
	}
}