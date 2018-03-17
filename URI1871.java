import java.util.Scanner;
public class URI1871 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),i;
		while(a!=0 && b!=0){
			String soma="";
			soma += (a+b);
			for(i=0;i<soma.length();i++){
				if(!(soma.charAt(i)=='0')){
					System.out.print(soma.charAt(i));
				}
			}
			System.out.println("");
			a=scan.nextInt();b=scan.nextInt();
		}
	}
}	