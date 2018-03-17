import java.util.Scanner;
public class URI2473 {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		int i,index, b,cont=0;
		int [] a = new int[6];
		for(i=0;i<6;i++){
			a[i]=scan.nextInt();
		}
		for(i=0;i<6;i++){
			b=scan.nextInt();
			for(index=0;index<6;index++){
				if(b==a[index]){
					cont++;
				}
			}
		}
		switch(cont){
		case 3:
			System.out.println("terno");
			break;
		case 4:
			System.out.println("quadra");
			break;
		case 5:
			System.out.println("quina");
			break;
		case 6:
			System.out.println("sena");
			break;
		default:
			System.out.println("azar");
		}
	}

}
