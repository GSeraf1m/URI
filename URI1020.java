import java.util.Scanner;
public class URI1020 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt(), anos=input/365,meses=(input%365)/30,dias=(input%365)%30;
		System.out.print(anos+" ano(s)\n"+meses+" mes(es)\n"+dias+" dia(s)\n");
	}
}