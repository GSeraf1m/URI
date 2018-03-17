import java.util.Scanner;
public class URI1019 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt(),horas=input/3600,minutos=(input/60)-(horas*60),segundos=(input-(minutos*60))-(horas*3600);
		System.out.println(horas+":"+minutos+":"+segundos);
	}
}