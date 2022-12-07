package eulerprograms;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		long ans=1l;
		for(long i=2;i<=n;i++) {
			ans=lcm(ans,i);
		}
		System.out.println(ans);
			}
		static long gcd(long x,long y) {
			if(y==0)
				return x;
			return gcd(y,x%y);
		}
		static long lcm(long x,long y) {
			return(x*y)/gcd(x,y);
	}

}
