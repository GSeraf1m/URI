import java.util.Scanner;
public class URI2651 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		s= s.toLowerCase();
		if(s.contains("zelda")){
			System.out.println("Link Bolado");
		}else{
			System.out.println("Link Tranquilo");
		}
	}
}