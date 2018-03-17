import java.util.Scanner;
public class URI1006 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double a=scan.nextDouble()*2,b=scan.nextDouble()*3,c=scan.nextDouble()*5,media=(a+b+c)/10;
		System.out.printf("MEDIA = %.1f\n",media);
	}
}