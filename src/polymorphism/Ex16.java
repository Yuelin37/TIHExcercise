package polymorphism;

class AlertStatus {
	public void alert() {
	}
}

class Warnning extends AlertStatus {
	public void alert() {
		System.out.println("Warnning...");
	}
}

class Error extends AlertStatus {
	public void alert() {
		System.out.println("Error...");
	}
}

class Threaten extends AlertStatus {
	public void alert() {
		System.out.println("Threaten...");
	}
}

class Starship {
	private AlertStatus alert = new Warnning();

	public void warnningRise() {
		alert = new Threaten();
	}

	public void errorRise() {
		alert = new Error();
	}

	public void threatenRise() {
		alert = new Threaten();
	}

	public void soundAlert() {
		alert.alert();
	}

}

public class Ex16 {

	public static void main(String[] args) {
		Starship starship = new Starship();
		starship.soundAlert();
		starship.threatenRise();
		starship.soundAlert();
		starship.errorRise();
		starship.soundAlert();
	}

}
// Ex16 (3) Following the example in Transmogrify.java, create a Starship class
// containing an AlertStatus reference that can indicate three different states.
// Include methods to change the states.