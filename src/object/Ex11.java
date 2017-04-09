// (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
package object;

public class Ex11 {
	public static void main(String args[]) {
		AllTheColorsOfTheRainbow allColors= new AllTheColorsOfTheRainbow();
		System.out.println(allColors.anIntegerRepresentingColors);
		allColors.changeTheHueOfTheColor(100);
		System.out.println(allColors.anIntegerRepresentingColors);
	}
}

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;

	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	// ...
}