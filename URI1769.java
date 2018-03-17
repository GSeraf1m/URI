import java.text.DecimalFormat;
import java.util.Scanner;
public class URI1769 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		do {
			String CPF = scan.nextLine(), v1 = "", v2 = "", nmr;
			double[] v = new double[14];
			for (int i = 0; i < 13; i++) {
				nmr = "";
				if (i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10 || i == 12 || i == 13) {
					nmr += CPF.charAt(i);
					v[i] = (int) Double.parseDouble(nmr);
				}
			}
			double b1=(v[0]*1)+(v[1]*2)+(v[2]*3)+(v[4]*4)+(v[5]*5)+(v[6]*6)+(v[8]*7)+(v[9]*8)+(v[10]*9);
			double b2=(v[0]*9)+(v[1]*8)+(v[2]*7)+(v[4]*6)+(v[5]*5)+(v[6]*4)+(v[8]*3)+(v[9]*2)+(v[10]*1);
			if (b1%11==10){
				b1=0;
			}else{
				b1=b1%11;
			}if (b2%11==10){
				b2=0;
			}else{
				b2=b2%11;
			}
			
			v1 += df.format(b1);v1 += df.format(b2);
			v2 += CPF.charAt(12); v2 += CPF.charAt(13);
			
			if (v1.equals(v2)) {
				System.out.println("CPF valido");
			}else{
				System.out.println("CPF invalido");
			}
		}while (scan.hasNextLine());
		scan.close();
	}
}