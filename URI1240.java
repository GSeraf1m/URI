import java.util.Scanner;
public class URI1240 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,casos,index;
		casos=scan.nextInt();
		for(i=1;i<=casos;i++){
			String A,B;
			boolean bool=true;
			A=scan.next();B=scan.next();
			if(A.length()>= B.length()){
				for(index=A.length()-1; index>=(A.length()-B.length());index--){
					if(A.charAt(index) != B.charAt(index-(A.length()-B.length()))){
						System.out.println("nao encaixa");
						bool = false;
						index= -1;
					}
				}
				if(bool == true){
					System.out.println("encaixa");
				}
			}else {
				System.out.println("nao encaixa");
			}
		}
	}
}
