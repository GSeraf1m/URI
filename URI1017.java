import java.util.Scanner;
public class URI1017 {
    public static void main(String[] args){
        int N, j;
        Scanner scan =new Scanner(System.in);
        N =scan.nextInt();
        for (int i = 1; i <= N; i++) {
            j = scan.nextInt();
            if (j == 0) {
                
                System.out.print("NULL\n");
                
            }else if(j % 2 != 0 && j < 0){
                System.out.print("ODD NEGATIVE\n");
                
            }else if(j % 2 != 0 && j > 0){
                System.out.print("ODD POSITIVE\n");
            }else if(j % 2 == 0 && j  > 0){
                System.out.print("EVEN POSITIVE\n");
            }else{
                System.out.print("EVEN NEGATIVE\n");
            }
        }
    }
}