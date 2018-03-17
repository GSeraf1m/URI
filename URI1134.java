import java.util.Scanner;
public class URI1134 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int opiniao=scan.nextInt(),al=0,gas=0,di=0;
		while(opiniao!=4){
			if(opiniao==1){
				al++;
			}else if(opiniao==2){
				gas++;
			}else if(opiniao==3){
				di++;
			}
			opiniao=scan.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+al);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+di);
	}
}