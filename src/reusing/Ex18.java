// (2) Create a class with a static final field and a final field
// and demonstrate the difference between the two.
package reusing;

import java.util.Random;

public class Ex18 {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		System.out.println(Demo.i1);
		System.out.println(demo.i2);
		
		Demo demo1 = new Demo();
		System.out.println(Demo.i1);
		System.out.println(demo1.i2);
		
	}

}

class Demo {
	static Random rand = new Random(84043);
	static final int i1 = rand.nextInt(100);
	final int i2 = rand.nextInt(100);
}
