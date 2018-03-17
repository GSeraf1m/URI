import java.util.Scanner;
public class URI1132 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt(),y=scan.nextInt(),i,soma=0;
			if(x>y){
				for(i=y;i<=x;i++){
					if(!(i%13==0)){
						soma+=i;
					}
				}
			}else{
				for(i=x;i<=y;i++){
					if(!(i%13==0)){
						soma+=i;
					}
				}
			}
		System.out.println(soma);
	}
}