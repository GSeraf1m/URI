import java.util.Scanner;
public class URI1168 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),i,index;
		String x;
		for(i=0;i<n;i++){
			int soma=0, xlenght;
			x=scan.next();
			xlenght = x.length();
			for(index=0;index<xlenght;index++){
				if(x.charAt(index) == '0'){
					soma+=6;
				}else if(x.charAt(index) == '1'){
					soma+=2;
				}else if(x.charAt(index) == '2'){
					soma+=5;
				}else if(x.charAt(index) == '3'){
					soma+=5;
				}else if(x.charAt(index) == '4'){
					soma+=4;
				}else if(x.charAt(index) == '5'){
					soma+=5;
				}else if(x.charAt(index) == '6'){
					soma+=6;
				}else if(x.charAt(index) == '7'){
					soma+=3;
				}else if(x.charAt(index) == '8'){
					soma+=7;
				}else if(x.charAt(index) == '9'){
					soma+=6;
				}
			}
			System.out.println(soma+" leds");
		}
	}
}