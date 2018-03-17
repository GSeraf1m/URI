import java.util.Scanner;
public class URI1048 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double salario=scan.nextDouble(),salario2, reajuste;
		if (salario<=400){
			reajuste=0.15*salario;
			salario2=reajuste+salario;
			System.out.printf("Novo salario: %.2f\n",salario2);
			System.out.printf("Reajuste ganho: %.2f\n",(salario2-salario));
			System.out.println("Em percentual: 15 %");			
		}else if(salario>400 && salario<=800){
			reajuste=0.12*salario;
			salario2=reajuste+salario;
			System.out.printf("Novo salario: %.2f\n",salario2);
			System.out.printf("Reajuste ganho: %.2f\n",(salario2-salario));
			System.out.println("Em percentual: 12 %");			
		}else if(salario>800 && salario<=1200){
			reajuste=0.10*salario;
			salario2=reajuste+salario;
			System.out.printf("Novo salario: %.2f\n",salario2);
			System.out.printf("Reajuste ganho: %.2f\n",(salario2-salario));
			System.out.println("Em percentual: 10 %");			
		}else if(salario>1200 && salario<=2000){
			reajuste=0.07*salario;
			salario2=reajuste+salario;
			System.out.printf("Novo salario: %.2f\n",salario2);
			System.out.printf("Reajuste ganho: %.2f\n",(salario2-salario));
			System.out.println("Em percentual: 7 %");			
		}else{
			reajuste=0.04*salario;
			salario2=reajuste+salario;
			System.out.printf("Novo salario: %.2f\n",salario2);
			System.out.printf("Reajuste ganho: %.2f\n",(salario2-salario));
			System.out.println("Em percentual: 4 %");	
		}
	}
}