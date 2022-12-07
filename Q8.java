package eulerprograms;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string.");
		String s=sc.next();
		final int move=13;
		long largestProduct=0;
		for(int i=0;i<s.length()-move+1;i++) {
			long product=1;
			for(int j=i;j<i+move;j++) {
				product*=Integer.parseInt(s.substring(j,j+1));
			}
			if(product>largestProduct)
				largestProduct=product;
		}System.out.println(largestProduct);
	}

}
