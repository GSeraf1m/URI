import java.util.Scanner;
public class URI1118 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		boolean bool=true;
		while(bool){
			double media=0,total=0;
			int i=0,sn=0;
			while(i!=2){
				double nota=scan.nextDouble();
				if(nota>=0 && nota<=10){
					total+=nota;
					i++;
				}else{
					System.out.println("nota invalida");
				}
			}
			media=total/2;
			System.out.printf("media = %.2f\n",media);
			while(true){	
				System.out.println("novo calculo (1-sim 2-nao)");
				sn=scan.nextInt();
				if(sn==1){
					break;
				}else if(sn==2){
					bool=false;
					break;
				}else{
				}
			}
		}
	}
}