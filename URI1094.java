import java.util.Scanner;
public class URI1094 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),i,cont=0,coelhos=0,ratos=0,sapos=0;
		double coelhopercent,ratopercent,sapopercent;
		for(i=0;i<n;i++){
			int x=scan.nextInt();String tipo=scan.next();
			if(tipo.equals("C")){
				coelhos+=x;
				cont+=x;
			}else if(tipo.equals("R")){
				ratos+=x;
				cont+=x;
			}else if(tipo.equals("S")){
				sapos+=x;
				cont+=x;
			}
		}
		coelhopercent=(double)(coelhos*100)/cont;
		ratopercent=(double)(ratos*100)/cont;
		sapopercent=(double)(sapos*100)/cont;
		System.out.println("Total: "+cont+" cobaias");
		System.out.println("Total de coelhos: "+coelhos);
		System.out.println("Total de ratos: "+ratos);
		System.out.println("Total de sapos: "+sapos);
		System.out.printf("Percentual de coelhos: %.2f",coelhopercent);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f",ratopercent);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f",sapopercent);
		System.out.println(" %");
	}
}