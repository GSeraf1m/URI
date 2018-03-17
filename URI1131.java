import java.util.Scanner;
public class URI1131 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int inter=scan.nextInt(),gremio=scan.nextInt(),vinter=0,vgremio=0,empate=0,sn,cont=0;
		while(true){
			cont++;
			if(inter>gremio){
				vinter++;
			}else if(gremio>inter){
				vgremio++;
			}else{
				empate++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			sn=scan.nextInt();
			if(sn==2){
				break;
			}
			inter=scan.nextInt(); gremio=scan.nextInt();
		}
		System.out.println(cont+" grenais");
		System.out.println("Inter:"+vinter);
		System.out.println("Gremio:"+vgremio);
		System.out.println("Empates:"+empate);
		if(vinter>vgremio){
			System.out.println("Inter venceu mais");
		}else if(vgremio>vinter){
			System.out.println("Gremio venceu mais");
		}else{
			System.out.println("Nao houve vencedor");
		}
	}
}