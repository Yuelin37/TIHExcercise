package holding;

import java.util.ArrayList;

class Gerbil {
	int gerbilNumber;

	public Gerbil(int number) {
		gerbilNumber = number;
	}

	public void hop() {
		System.out.println("Gerbil #" + gerbilNumber + " is hopping.");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i));
		}
		for (Gerbil gerbil : gerbils) {
			gerbil.hop();
		}
	}

}
// Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber
// that’s initialized in the constructor. Give it a method called hop( ) that
// displays which gerbil number this is, and that it’s hopping. Create an
// ArrayList and add Gerbil objects to the List. Now use the get( ) method to
// move through the List and call hop( ) for each Gerbil.