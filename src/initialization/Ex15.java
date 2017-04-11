// (1) Create a class with a String that is initialized using instance initialization.
package initialization;

public class Ex15 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		System.out.println(tiger.legs);
	}

}

class Tiger {
	int legs;
	{
		legs = 4;
	}
}
