package eulerprograms;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int n=1;
int count=0;
for(int i=1;i<n+1;i++) {
	sum+=i;
	System.out.print(sum+":");
	for(int j=1;j<sum+1;j++) {
		if(sum%j==0) {
			if(sum==j) {
				System.out.print(j);
				count++;
			}
			else
				System.out.printf(j+",");
			count++;
		}
		if(count>5) {
			n=0;
			break;
		}
	}
	count=0;
	System.out.println();
	n++;
}
	}

}
