public class URI1155 {
	public static void main(String[]args){
		double i, soma=0;
		for(i=1;i<101;i++){
			soma += 1/i;
		}
		System.out.printf("%.2f\n", soma);
	}
}