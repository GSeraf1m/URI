import java.util.Scanner;
public class URI1238 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i,c=scan.nextInt();
		for(i=0;i<c;i++){
			String p1=scan.next(),p2=scan.next(),p="";
			int index,ind1=0,ind2=0;
			if(p1.length()==1){
				p=p1.concat(p2);
			}else if(p2.length()==1){
				p+=p1.charAt(0)+p2+p1.substring(1);
			}else{
				for(index=0;index<p1.concat(p2).length();index++){
					if(ind1<p1.length()&&ind2<p2.length()){
						if(index%2==0){
							p+=p1.charAt(ind1);
							ind1++;
						}else{
							p+=p2.charAt(ind2);
							ind2++;}}}
				
					if(p2.length()>=p1.length()){
						p+=p2.substring(p1.length()-1, p2.length());
					}else{
						p+=p1.substring(p2.length(), p1.length());}}
				
			System.out.println(p);
		}
	}
}