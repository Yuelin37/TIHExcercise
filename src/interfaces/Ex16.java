package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

public class Ex16 implements Readable {
	private static Random rand = new Random(37);
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	private int count;

	public Ex16(int count) {
		this.count = count;
	}

	public static char next() {
		return lowers[rand.nextInt(lowers.length)];
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0)
			return -1;
		cb.append(Ex16.next());
		return 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new Ex16(100));
		while (s.hasNext())
			System.out.println(s.next());
		s.close();
	}
}

// Ex 16 (3) Create a class that produces a sequence of chars. Adapt this class
// so that it can be an input to a Scanner object.