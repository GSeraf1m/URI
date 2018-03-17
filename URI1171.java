import java.util.Arrays;
import java.util.Scanner;
public class URI1171 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int N,i=0,index,cont=0;
		N=scan.nextInt();
		int [] A= new int[N];int [] rep= new int[N];int [] B= new int[N];
		for(i=0;i<N;i++){
			A[i] = scan.nextInt();
		}
		Arrays.sort(A);
		for(i=0;i<N;i++){
			for(index=0;index<N;index++){
				if(A[i]==A[index]){
					rep[i]++;
				}
			}
		}
		for(index=0;index<N;index++){
			for(i=0;i<N;i++){
				if(B[i]==A[index]){
					cont++;
				}
			}
			if(cont==0){
				System.out.printf("%d aparece %d vez(es)\n",A[index],rep[index]);
				B[index]=A[index];
			}
			cont=0;
		}
	}
}