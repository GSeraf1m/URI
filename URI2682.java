import java.io.*;
public class URI2682 {
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		int n=-9999;
		String x;
		while((x=br.readLine())!=null){
			int in = Integer.parseInt(x);
				 if(in>n){
					 n=in;
				 }else{
						 System.out.println(n+1);
					 }
		}
	}
}