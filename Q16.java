package eulerprograms;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=1000;
int powOfNum=(int)Math.pow(2, p);
System.out.println(powOfNum);
int sum=0;
int len=String.valueOf(powOfNum).length();
for(int i=0;i<len;i++) {
	int rem=powOfNum%10;
	sum+=rem;
	powOfNum=powOfNum/10;
}
System.out.println(sum);
	}

}
