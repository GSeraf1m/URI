import java.util.Scanner;
public class URI1104{
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt(), b=scan.nextInt(), n, i, ali=0, bea=0;
		while(!(a==b && b==0)){
			int [] alice = new int[100001];
			int [] beatriz = new int[100001];
				ali=0;bea=0;
			  for (i = 0; i < a; ++i){
			   n=scan.nextInt();
			   alice[n]++;
			  }
			  for (i = 0; i < b; ++i){
			   n=scan.nextInt();
			   beatriz[n]++;
			  }
			  for (i = 0; i < 100001; ++i){
			   if(alice[i] != 0 && beatriz[i] == 0){
			    ali++;
			    }
			   if(alice[i] == 0 && beatriz[i] != 0){
			    bea++;
			   }
			  }
			  if(ali < bea){
			System.out.println(ali);
			  }else{
			System.out.println(bea);
			  }
			  a=scan.nextInt(); b=scan.nextInt();
		}
	}
}