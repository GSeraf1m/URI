import java.util.Scanner;
public class URI1024 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,index,n = Integer.parseInt(scan.nextLine());
		for(i=0;i<n;i++){
			String m,cripto="",cripto2="",cripto3="";
			m=scan.nextLine();
			for(index=0;index<m.length();index++){
				if(!(m.charAt(index)==' ')){
					cripto+=(char)(m.charAt(index)+3);
				}else{
					cripto+=(char)m.charAt(index);
				}
			}
			for(index=cripto.length()-1;index>0;index--){
				cripto2+=(char)cripto.charAt(index);
			}
			for(index=0;index<=cripto2.length();index++){
				if(!(cripto2.charAt(index)==' ')){
					cripto3+=(char)(cripto2.charAt(index)-1);
				}else{
					cripto3+=(char)cripto.charAt(index);
				}
			}
			System.out.println(cripto3);
		}
	}
}