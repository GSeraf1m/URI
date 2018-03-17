import java.util.Scanner;
public class URI1096 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i=1,x=1,n=8;
		do{
			n-=1;
			System.out.println("I="+x+" J="+n);
			if(n==5){
				x+=2;
				n=8;
			}
			i++;
		}while(i<16);
	}
}