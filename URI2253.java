import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI2253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;
        while ((senha = br.readLine()) != null) {
        	int tamanho=senha.length(), i; boolean caps=false,nocaps=false,num=false,simb=false;
            if(tamanho>=6 && tamanho<=32){
            for(i=0;i<tamanho;i++){
            	if(senha.charAt(i)>47 && senha.charAt(i)<58){
            		num=true;
            	}else if(senha.charAt(i)>96 && senha.charAt(i)<123){
            		nocaps=true;
            	}else if(senha.charAt(i)>64 && senha.charAt(i)<91){
            		caps=true;
            	}else{
            		simb=true;
            	}
            	
            }
            if(num && nocaps && caps && !simb){
            	System.out.println("Senha valida.");
            }else{
            	System.out.println("Senha invalida.");
            }
        }else{
        	System.out.println("Senha invalida.");
        }
        }
    }
}