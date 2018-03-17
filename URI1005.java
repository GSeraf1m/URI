import java.util.Scanner;
public class URI1005 {

    public static void main(String[] args){

            float A, B, med;
            Scanner scan = new Scanner(System.in);
            A = scan.nextFloat();
            B = scan.nextFloat();
            med = (float) (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
            String media = String.format("MEDIA = %,.5f", med);
            System.out.print(media +"\n");

    }

}
