// (1) Create a class in a package. Create an instance of your class outside of that package.
package access;

import mypack.Wheel;

public class Ex1 {

	public static void main(String[] args) {
		Wheel wheel = new Wheel();
		System.out.println(wheel.color);
	}

}
