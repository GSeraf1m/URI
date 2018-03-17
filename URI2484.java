import java.io.*;
public class URI2484 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		while((x=br.readLine())!=null){
			int i,ind;
			for(ind=0;ind<x.length();ind++){
				for(i=0;i<ind;i++){
					System.out.print(" ");
				}
				for(i=0;i<x.length()-ind;i++){
					System.out.print(x.charAt(i));
					if(i<(x.length()-1)-ind){
					System.out.print(" ");
					}else{
						System.out.println("");
					}
				}
			}
			System.out.println("");
		}
	}
}