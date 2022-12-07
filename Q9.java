package eulerprograms;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=1000;a++) {
			for(int b=a+1;b<1000;b++) {
				double cSquared=Math.pow(a, 2)+Math.pow(b, 2);
				double c=Math.sqrt(cSquared);
				if(a+b+c==1000) {
					System.out.println(a*b*c);
					break;
				}
			}
		}
	}

}
