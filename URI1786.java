import java.util.Scanner;
public class URI1786 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cpf;
        while(scan.hasNextLine()){
            cpf = scan.nextLine();
            int[] nmr = new int[11];
            int i;
            for(i=0;i<9;i++){
                nmr[i] = Integer.parseInt("" + cpf.charAt(i));
            }
            int b1=((nmr[0]*1)+(nmr[1]*2)+(nmr[2]*3)+(nmr[3]*4)+(nmr[4]*5)+(nmr[5]*6)+(nmr[6]*7)+(nmr[7]*8)+(nmr[8]*9));
    		int b2=((nmr[0]*9)+(nmr[1]*8)+(nmr[2]*7)+(nmr[3]*6)+(nmr[4]*5)+(nmr[5]*4)+(nmr[6]*3)+(nmr[7]*2)+(nmr[8]*1));
    		if((b1%11)==10){
    			b1 = 0;
    		}else{
    			b1 %= 11;
    		}
    		if(b2 % 11 == 10){
    			b2 = 0;
    		}else{
    			b2 %= 11;
    		}
    		System.out.print(nmr[0] + "" + nmr[1] + "" + nmr[2] + "." + nmr[3] + "" + nmr[4] + "" + nmr[5] + "." + nmr[6] + "" + nmr[7] + "" + nmr[8] + "-" + b1 + "" + b2+"\n");
        }
    }
}