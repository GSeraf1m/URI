import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1002 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0000");
    double raio=scan.nextDouble();
    double area=(Math.pow(raio, 2))*3.14159;
    System.out.println("A="+df.format(area));
    }
}