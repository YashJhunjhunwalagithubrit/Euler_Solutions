package eulerprograms;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int max=10000;
		x: for(i=999;i>=100;i--) {
			for(j=999;j>=100;j--) {
				if(pal(i*j)) {
					if(i*j>max)
						max=i*j;
				}
			}
		}
		System.out.println(max);
			}
			public static boolean pal(int n) {
				StringBuilder s=new StringBuilder(Integer.toString(n));
				if(s.toString().equals(s.reverse().toString()))
					return true;
				return false;
	}

}
