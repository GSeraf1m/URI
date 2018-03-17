import java.io.*;
import java.util.Arrays;
public class URI2137 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		while((x = br.readLine())!=null){
			int  i;
			String [] y = new String[Integer.parseInt(x)];
			for(i=0;i<Integer.parseInt(x);i++){
				y[i]= br.readLine();
			}
			Arrays.sort(y);
			for(i=0;i<Integer.parseInt(x);i++){
				System.out.println(y[i]);
			}
		}
	}
}