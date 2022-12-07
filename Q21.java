package eulerprograms;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1000;
int sum=0;
for(int i=1;i<n;i++) {
	if(n%i==0) {
		sum+=i;
		System.out.print(i+",");
	}
}
System.out.printf("Hence,d(%d)=%d",n,sum);
	}

}
