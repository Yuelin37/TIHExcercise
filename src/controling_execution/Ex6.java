package controling_execution;

import static net.mindview.util.Print.print;

public class Ex6 {
	static int test(int testval, int begin, int end) {
		if (testval > end)
			return +1;
		else if (testval < begin)
			return -1;
		else
			return 0; // Match
	}

	public static void main(String[] args) {
		print(test(10, 5, 15));
		print(test(5, 10, 15));
		print(test(5, 1, 4));
	}
}
