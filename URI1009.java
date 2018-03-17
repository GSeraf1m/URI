import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1009 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String nome=scan.next();double fixo=scan.nextDouble(),vendas=scan.nextDouble(),comissao=0.15*vendas,salario=comissao+fixo;
		System.out.println("TOTAL = R$ "+df.format(salario));
	}
}