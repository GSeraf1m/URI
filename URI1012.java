import java.util.Scanner;
import java.text.DecimalFormat;
public class URI1012 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double a=scan.nextDouble(),b=scan.nextDouble(),c=scan.nextDouble(),triangulo=(a*c)/2,circulo= 3.14159*Math.pow(c, 2),trapezio=((a+b)*c)/2,quadrado=b*b,retangulo=a*b;
		System.out.println("TRIANGULO: "+df.format(triangulo)+"\nCIRCULO: "+df.format(circulo)+"\nTRAPEZIO: "+df.format(trapezio)+"\nQUADRADO: "+df.format(quadrado)+"\nRETANGULO: "+df.format(retangulo));
	}
}