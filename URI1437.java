import java.util.Scanner;
public class URI1437 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i,ind;
		while(n!=0){
			String x,cardeais="N";
			x=scan.next();
			for(i=0;i<n;i++){	
					if(x.charAt(i)=='E'){
						if(cardeais.equals("N")){
							cardeais="O";
						}else if(cardeais.equals("S")){
							cardeais="L";
						}else if(cardeais.equals("L")){
							cardeais="N";
						}else{
							cardeais="S";
						}
					}else{
						if(cardeais.equals("N")){
							cardeais="L";
						}else if(cardeais.equals("S")){
							cardeais="O";
						}else if(cardeais.equals("L")){
							cardeais="S";
						}else{
							cardeais="N";
						}
					}
			}
			System.out.println(cardeais);
			n=scan.nextInt();
		}
	}
}