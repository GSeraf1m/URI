import java.util.Scanner;
public class URI1117 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double media=0,total=0,i=0;
		while(i!=2){
			double nota=scan.nextDouble();
			if(nota>=0 && nota<=10){
				total+=nota;
				i++;
			}else{
				System.out.println("nota invalida");
			}
		}
		media=total/2;
		System.out.println("media = "+media);
	}
}