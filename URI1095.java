import java.util.Scanner;
public class URI1095 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,x=1,n=60;
		for(i=1;i<14;i++){
			System.out.println("I="+x+" J="+n);
			x+=3;
			n-=5;
		}
	}
}