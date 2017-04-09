// (2) Write a program that demonstrates that autoboxing works 
// for all the primitive types and their wrappers.
package object;

public class Ex9 {

	public static void main(String[] args) {
		Character ch = 'x';
		char c = ch;
		System.out.println(ch);
		System.out.println(c);
		
		Byte myByte = 127;
		byte bt = myByte;
		System.out.println(myByte);
		System.out.println(bt);
		
		Short myShort  = 8888;
		short st = myShort;
		System.out.println(myShort);
		System.out.println(st);
		
		Integer  myInt = 12345678;
		int i = myInt;
		System.out.println(myInt);
		System.out.println(i);
		
		Long myLong = (long) 1234567890;
		long lg = myLong;
		System.out.println(myLong);
		System.out.println(lg);
		
		Float myFloat = (float) 1111111111111111.22222;
		float ft = myFloat;
		System.out.println(myFloat);
		System.out.println(ft);
		
		Double myDouble = (double) 7777777777777777.8888;
		double db = myDouble;
		System.out.println(myDouble);
		System.out.println(db);
		
		Boolean myBl = true;
		boolean bl = myBl;
		System.out.println(myBl);
		System.out.println(bl);
		
		// Don't know how to do this for Void and void
	}

}
