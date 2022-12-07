package eulerprograms;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(isPrime(i))
				sum=sum+i;
			
		}
		System.out.println(sum);
			}
			public static boolean isPrime(int n) {
				if(n==1)
					return false;
				if(n==2||n==3)
					return true;
				if(n%2==0||n%3==0)
					return false;
				for(int i=5;i*i<=n;i++)
					if(n%i==0||n%(i+2)==0)
						return false;
				return true;
	}

}
