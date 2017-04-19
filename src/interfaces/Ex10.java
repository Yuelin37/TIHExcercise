package interfaces;

//: interfaces/music5/Music5.java
//Interfaces.

import static net.mindview.util.Print.*;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT; // Etc.
} /// :~

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:

	void adjust();
}

interface Playable {
	void play(Note n); // Automatically public
}

class Wind implements Instrument, Playable{
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Ex10 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
		System.out.println(Instrument.VALUE);
	}
} /*
	 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
	 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
	 */// :~

// Ex10 (3) Modify Musics.java by adding a Playable interface. Move the play( )
// declaration from Instrument to Playable. Add Playable to the derived classes
// by including it in the implements list. Change tune( ) so that it takes a
// Playable instead of an Instrument.