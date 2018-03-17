import java.util.Scanner;
public class URI2242 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String risada,engraçada="",engraçadainv="";
		risada=scan.next();
		risada=risada.toLowerCase();
		for(int i=0;i<risada.length();i++){
			if(risada.charAt(i)=='a' || risada.charAt(i)=='e' || risada.charAt(i)=='i' || risada.charAt(i)=='o' || risada.charAt(i)=='u'){
				engraçada+=risada.charAt(i);
			}
		}
		for(int i=engraçada.length()-1;i>=0;i--){
				engraçadainv+=engraçada.charAt(i);
		}
		if(engraçada.equalsIgnoreCase(engraçadainv)){
			System.out.print("S\n");
		}else{
			System.out.print("N\n");
		}
	}

}
