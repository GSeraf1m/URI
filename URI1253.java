import java.util.Scanner;
public class URI1253 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cdg = "";
		int casos=scan.nextInt(), chave, index, i,x;
		for(index=0;index<casos;index++){
			String texto = scan.next(); chave = scan.nextInt();
			for (i = 0; i <texto.length(); i++) {
				if(i<chave){
					x=(27-(chave-i));
					cdg += ((char)(texto.charAt(i) +x));
				}else{
				cdg +=(char)(texto.charAt(i) - chave);}
				}
			System.out.print(cdg+"\n");}
		scan.close();
	}
}