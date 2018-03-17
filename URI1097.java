public class URI1097 {
	public static void main(String[]args){
		double i=1,x=0,n=0,y=0;
		do{
			n+=1;
			if(i<4 || (i>15 && i<19) || i>30){
			System.out.printf("I=%.0f J=%.0f\n",x,n);
			}else{
				System.out.printf("I=%.1f J=%.1f\n",x,n);
			}
			if(i%3==0){
				x+=0.2;
				n=(0+x)-y;
			}
			i++;
		}while(i<34);
	}
}