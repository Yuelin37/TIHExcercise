// (1) Create a class without a constructor,
// and then create an object of that class in main( )
// to verify that the default constructor is automatically synthesized.
package initialization;

public class Ex7 {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		System.out.println(myCat.name);
	}

}

class Cat {
	String name = "cat";
}
