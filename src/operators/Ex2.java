// (1) Create a class containing a float and use it to demonstrate aliasing.

package operators;

public class Ex2 {

	public static void main(String[] args) {
		FloatClass fc1 = new FloatClass();
		FloatClass fc2 = new FloatClass();

		fc1.flt = 11.0F;
		fc2.flt = 22.0F;

		System.out.println("fc1.flt: " + fc1.flt);
		System.out.println("fc2.flt: " + fc2.flt);

		fc1 = fc2;
		fc2.flt = 33.33F;

		System.out.println("fc1.flt: " + fc1.flt);
		System.out.println("fc2.flt: " + fc2.flt);

	}

}

class FloatClass {
	public float flt = (float) 1.0;
}