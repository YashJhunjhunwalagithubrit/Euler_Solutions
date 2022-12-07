package eulerprograms;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=600851475143l;
		long ans=0l;
		for(long i=(long)Math.sqrt(number);i>=0;i--) {
			if(isPrimeFactor(i)&&number%i==0) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
			}
			static boolean isPrimeFactor(long number) {
				boolean ans=true;
				for(long i=21;i*i<number;i++) {
					if(number%i==0) 
						ans=false;
					}
					return ans;
	}

}
