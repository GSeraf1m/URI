import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1011 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double raio=scan.nextDouble(), volume=((4.0/3)*3.14159)*Math.pow(raio, 3);
		System.out.println("VOLUME = "+df.format(volume));
	}
}