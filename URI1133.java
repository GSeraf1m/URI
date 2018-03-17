import java.util.Scanner;
public class URI1133 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt(),y=scan.nextInt(),i;
			if(x>y){
				for(i=y+1;i<x;i++){
					if(i%5==2 || i%5==3){
						System.out.println(i);
					}
				}
			}else{
				for(i=x+1;i<y;i++){
					if(i%5==2 || i%5==3){
						System.out.println(i);
				}
			}
		}
	}
}