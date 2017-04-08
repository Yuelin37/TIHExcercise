// (3) Write a program that demonstrates that, no matter how many objects you create of a particular class,
// there is only one instance of a particular static field in that class.

package object;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc1 = new StaticClass();
		StaticClass sc2 = new StaticClass();
		StaticClass sc3 = new StaticClass();
		sc1.counter++;
		sc2.counter++;
		sc3.counter++;
		System.out.println(StaticClass.counter);

	}

}

class StaticClass {
	public static int counter = 0;
}