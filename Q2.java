package eulerprograms;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int sum=0;
		do {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			if(num2%2==0) {
				sum=sum+num2;
			}
		}
		while(num2<4000000);
		System.out.println(sum);
	}

}
