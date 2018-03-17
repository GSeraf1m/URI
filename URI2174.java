import java.util.Scanner;
public class URI2174 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String [] pomedex = new String[151];
		int c,cont=151,index,i;
		c=scan.nextInt();
		boolean bool=true;
		for(i=0;i<c;i++){
			String poke = scan.next();
			for(index=0;index<151;index++){
				if(poke.equalsIgnoreCase(pomedex[index])){
					bool=false;
				}
			}
			if(bool){
				cont--;
				pomedex[cont]=poke;
			}else{
				bool=true;
			}
		}
		System.out.print("Falta(m) "+cont+" pomekon(s).\n");
	}
}