package eulerprograms;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] arr1=new double[1000];
double[] arr2=new double[1000];
int length=0;
double value=0.0;
for(int i=2;i<1000;i++) {
	double a=1;
	a=a/i;
	arr1[i-2]=a;
	int b=String.valueOf(a).length();
	arr2[i-2]=b;
	if(length<arr2[i-2]) {
		length=(int)arr2[i-2];
		value=arr1[i-2];
	}
}
System.out.println(value);
System.out.println(length);
	}

}
