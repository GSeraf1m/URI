import java.util.Scanner;
public class URI1064 {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		int i, cont=0;
		double x,soma=0, media=0;
		for(i=0;i<6;i++){
			x=scan.nextDouble();
			if(x>0){
				cont++;
				soma+=x;
			}
		}
		media=soma/cont;
		System.out.println(cont+" valores positivos");
		System.out.printf("%.1f", media);
	}
}