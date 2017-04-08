package object;

public class Ex4 {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		Ex4 myEx4 = new Ex4();
		myEx4.i = 123;
		myEx4.d = 123.456;
		myEx4.b = true;
		System.out.println(myEx4.i);
		System.out.println(myEx4.d);
		System.out.println(myEx4.b);
	}
}

class DataOnly {
	int i;
	double d;
	boolean b;
}