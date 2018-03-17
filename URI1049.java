import java.util.Scanner;
public class URI1049 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String subfilo=scan.next(),classe=scan.next(),ordem=scan.next();
		if(subfilo.equalsIgnoreCase("vertebrado")){
			if(classe.equalsIgnoreCase("ave")){
				if(ordem.equalsIgnoreCase("carnivoro")){
					System.out.println("aguia");
				}else{
					System.out.println("pomba");
				}
			}else{
				if(ordem.equalsIgnoreCase("onivoro")){
					System.out.println("homem");
				}else{
					System.out.println("vaca");
				}
			}
		}else{
			if(classe.equalsIgnoreCase("inseto")){
				if(ordem.equalsIgnoreCase("hematofago")){
					System.out.println("pulga");
				}else{
					System.out.println("lagarta");
				}
			}else{
				if(ordem.equalsIgnoreCase("hematofago")){
					System.out.println("sanguessuga");
				}else{
					System.out.println("minhoca");
				}
				
			}
		}
	}
}