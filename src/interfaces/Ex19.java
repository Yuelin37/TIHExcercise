package interfaces;

import java.util.Random;

interface Toss {
	int toss();
}

class Coin implements Toss {

	private Random rand = new Random();

	@Override
	public int toss() {
		return rand.nextInt(2);
	}

}

class Dice implements Toss {

	private Random rand = new Random();

	@Override
	public int toss() {
		return rand.nextInt(6);
	}

}

interface TossFactory {
	Toss getToss();
}

class CoinFactory implements TossFactory {

	@Override
	public Toss getToss() {
		return new Coin();
	}

}

class DiceFactory implements TossFactory {

	@Override
	public Toss getToss() {
		return new Dice();
	}

}

public class Ex19 {

	public static void tellFortune(TossFactory tf) {
		Toss toss = tf.getToss();
		System.out.println(toss.toss());
	}

	public static void main(String[] args) {
		tellFortune(new CoinFactory());
		tellFortune(new DiceFactory());
	}

}

// Exercise 19 (3) Create a framework using Factory Methods that performs both
// coin tossing and dice tossing.