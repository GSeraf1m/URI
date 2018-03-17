import java.util.Scanner;
public class URI1170 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		 int i, casos,dias=0, comidaint;
		 casos = scan.nextInt();
		 float [] comida = new float[casos];
		 for(i=0;i<casos;i++){
			 comida[i] = scan.nextFloat();
		 }
		 for(i=0;i<casos;i++){
			 dias=0;
			 while(comida[i]>1){
				 comida[i] /= 2;
				 dias++;
			 }
			 System.out.println(dias+" dias");
		 }
	}

}
