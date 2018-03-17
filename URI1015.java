import java.util.Scanner;
import java.text.DecimalFormat;
public class URI1015 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int tempo=scan.nextInt(),vlc=scan.nextInt(); double distancia=vlc*tempo, litros=distancia/12;
		System.out.println(df.format(litros));
	}
}