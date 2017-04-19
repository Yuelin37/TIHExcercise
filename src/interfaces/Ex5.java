package interfaces;

import interfaces.diff.*;

public class Ex5 implements Computer {

	@Override
	public void compute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	@Override
	public void reboot() {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {
		Computer myComputer = new Ex5();
		myComputer.say("Hello Infterface...");
	}

}

// Ex5 (2) Create an interface containing three methods, in its own package.
// Implement the interface in a different package.

// Ex6 (2) Prove that all the methods in an interface are automatically public.