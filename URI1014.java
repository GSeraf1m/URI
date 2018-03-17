import java.util.Scanner;
import java.text.DecimalFormat;
public class URI1014 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int x=scan.nextInt(); double y=scan.nextDouble(),km=x/y;
		System.out.println(df.format(km)+" km/l");
	}
}