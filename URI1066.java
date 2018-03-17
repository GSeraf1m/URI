import java.util.Scanner;
public class URI1066 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,x,par=0,impar=0,positivo=0, negativo=0;
		for(i=0;i<5;i++){
			x=scan.nextInt();
			if(x%2==0){
				par++;
			}else{
				impar++;
			}
			if(x>0){
				positivo++;
			}else if(x<0){
				negativo++;
			}
		}
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(negativo+" valor(es) negativo(s)");
	}
}