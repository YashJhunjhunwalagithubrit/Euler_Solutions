package eulerprograms;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumSquares=0,sum=0,difference=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
			sumSquares+=(int)Math.pow(i,2);
		}
		difference=(int)Math.pow(sumSquares, 2)-sumSquares;
		System.out.println(difference);
			}


	}

