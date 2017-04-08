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
		
	}

}
