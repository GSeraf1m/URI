import java.util.Scanner;
public class URI2242 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String risada,engra�ada="",engra�adainv="";
		risada=scan.next();
		risada=risada.toLowerCase();
		for(int i=0;i<risada.length();i++){
			if(risada.charAt(i)=='a' || risada.charAt(i)=='e' || risada.charAt(i)=='i' || risada.charAt(i)=='o' || risada.charAt(i)=='u'){
				engra�ada+=risada.charAt(i);
			}
		}
		for(int i=engra�ada.length()-1;i>=0;i--){
				engra�adainv+=engra�ada.charAt(i);
		}
		if(engra�ada.equalsIgnoreCase(engra�adainv)){
			System.out.print("S\n");
		}else{
			System.out.print("N\n");
		}
	}

}
