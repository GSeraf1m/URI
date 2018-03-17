import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		int X, Y;
		double price = 0;
		
		Scanner scan = new Scanner(System.in);
		X = scan.nextInt();
		Y = scan.nextInt();
		if (X == 1) {
			price  = (double) (4.00 * Y);
			}else 
				if (X == 2) {
					price  = (double) (4.50 * Y);
				}else 
					if (X == 3) {
						price  = (double) (5.00 * Y);
					}else 
						if (X == 4) {
							price  = (double) (2.00 * Y);
						}else 
							if (X == 5) {
								price  = (double) (1.50 * Y);
							}
		
			System.out.printf("Total: R$ %.2f\n",price);
	}
}