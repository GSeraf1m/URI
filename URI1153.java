import java.util.Scanner;
public class URI1153 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,x=scan.nextInt(),fatorial=x;
		for(i=1;i<x;i++){
			fatorial*= (x-i);
		}
		System.out.println(fatorial);
	}
}