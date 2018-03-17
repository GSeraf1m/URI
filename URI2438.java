import java.util.ArrayList;
import java.util.Scanner;
public class URI2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> valor = new ArrayList<String>();
		int[] count = new int [8];
        int i, soma = 0, n;
	    long quadradinho = 0;
	     n = scan.nextInt();
	     for(i = 0 ;i < n ;i++){
	    	 valor.add(scan.next());	
	     }
	     for(i = 0; i < 8 ; i++){
	    	 count[i] = 0;	
	     }
	     count[0] = 1;
	     for(i = 0 ; i < n ;i++ ){
	    	 soma +=Integer.parseInt(valor.get(i));
			quadradinho += count[soma % 8];
			count[soma % 8]++;
	     }
	System.out.println(quadradinho);
	}
}