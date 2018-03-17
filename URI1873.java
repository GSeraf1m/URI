import java.util.Scanner;
public class URI1873 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int c,i;
		c=scan.nextInt();
		for(i=0;i<c;i++){
			String a=scan.next();
			String b=scan.next();
			if(a.equalsIgnoreCase("Tesoura")&&b.equalsIgnoreCase("papel")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("papel")&&b.equalsIgnoreCase("tesoura")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("papel")&&b.equalsIgnoreCase("pedra")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("pedra")&&b.equalsIgnoreCase("papel")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("pedra")&&b.equalsIgnoreCase("lagarto")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("lagarto")&&b.equalsIgnoreCase("pedra")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("lagarto")&&b.equalsIgnoreCase("Spock")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("Spock")&&b.equalsIgnoreCase("lagarto")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("Spock")&&b.equalsIgnoreCase("tesoura")){
				System.out.println("rajesh");
			}			
			if(a.equalsIgnoreCase("Tesoura")&&b.equalsIgnoreCase("spock")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("Tesoura")&&b.equalsIgnoreCase("lagarto")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("lagarto")&&b.equalsIgnoreCase("tesoura")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("lagarto")&&b.equalsIgnoreCase("papel")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("papel")&&b.equalsIgnoreCase("lagarto")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("papel")&&b.equalsIgnoreCase("spock")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("spock")&&b.equalsIgnoreCase("papel")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("spock")&&b.equalsIgnoreCase("pedra")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("pedra")&&b.equalsIgnoreCase("spock")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase("pedra")&&b.equalsIgnoreCase("tesoura")){
				System.out.println("rajesh");
			}
			if(a.equalsIgnoreCase("Tesoura")&&b.equalsIgnoreCase("pedra")){
				System.out.println("sheldon");
			}
			if(a.equalsIgnoreCase(b)){
				System.out.println("empate");
			}
		}
	}
}
