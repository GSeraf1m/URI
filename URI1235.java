import java.util.Scanner;
public class URI1235 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,c,index;
		c=Integer.parseInt(scan.nextLine());
		for(i=0;i<c;i++){
			String a,b,cripto="",line = scan.nextLine();
			int tam1 = line.length()-1;
			for(index=tam1;index>=0;index--){
				cripto+= line.charAt(index);
			}
			int tam = cripto.length();
			a =cripto.substring(tam/2, tam);
			b =cripto.substring(0, tam/2);
			System.out.println(a+b);
		}
	}
}