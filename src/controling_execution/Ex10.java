//(5) A vampire number has an even number of digits and is formed by multiplying
// a pair of numbers containing half the number of digits of the result.
// The digits are taken from the original number in any order.
// Pairs of trailing zeroes are not allowed. Examples include:
//1260 = 21 * 60
//1827 = 21 * 87
//2187 = 27 * 81
//Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)

package controling_execution;

import java.util.Arrays;

public class Ex10 {
	public static void main(String args[]) {
		// showVampireNumber1(12);
		showVampireNumber1(Integer.parseInt(args[0]));
	}

	static void showVampireNumber(int digits) {

		if (digits < 2 || digits % 2 != 0) {
			System.out.println("Please input an even number.");
		} else {
			long num1 = 2 * (long) Math.pow(10, (digits / 2 - 1));
			// System.out.println(num1);
			long min = (long) Math.pow(10, digits - 1);
			long max = (long) Math.pow(10, digits) - 1;

			System.out.println("min: " + min);
			System.out.println("max: " + max);

			for (long num = min; num <= max; num++) {
				// System.out.println("num: " + num);

				String numString = Long.toString(num);
				while (num1 < Math.pow(10, digits / 2)) {
					boolean num1Valid = true;
					boolean num2Valid = true;
					// System.out.println(num + " % " + num1 + ": " + num %
					// num1);
					if (num % num1 == 0) {
						long num2 = num / num1;

						String num1String = Long.toString(num1);
						char[] num1Chars = num1String.toCharArray();
						for (char c : num1Chars) {
							if (numString.indexOf(c) == -1) {
								num1Valid = false;
								break;
							}
						}

						String num2String = Long.toString(num2);
						char[] num2Chars = num2String.toCharArray();
						for (char c : num2Chars) {
							if (numString.indexOf(c) == -1) {
								num2Valid = false;
								break;
							}
						}

						boolean allMatch = true;
						char[] numChars = numString.toCharArray();
						String num1AndNum2String = num1String + num2String;
						for (char c : numChars) {
							if (num1AndNum2String.indexOf(c) == -1) {
								allMatch = false;
								break;
							}
						}
						if (num1Valid && num2Valid && allMatch) {
							char[] allChars = num1AndNum2String.toCharArray();
							Arrays.sort(allChars);
							Arrays.sort(numChars);

							if ((new String(allChars)).equals(new String(numChars)))
								System.out.println(num + " = " + num1 + " * " + num2);
						}

					}
					num1++;
					// System.out.println("num1: "+ num1);
				}
				num1 = 2 * (int) Math.pow(10, (digits / 2 - 1));
			}
		}

	}

	static void showVampireNumber1(int digits) {
		if (digits < 2 || digits % 2 != 0) {
			System.out.println("Please input an even number.");
		} else {
			long minNum1 = 2 * (long) Math.pow(10, (digits / 2 - 1));
			long num1 = minNum1;
			// System.out.println(num1);
			long min = (long) Math.pow(10, digits - 1);
			long max = (long) Math.pow(10, digits) - 1;

			System.out.println("min: " + min);
			System.out.println("max: " + max);

			long found = 0;
			long lastFound = 0;
			String outputStr = "";
			for (long num = min; num <= max; num++) {
				// System.out.println("num: " + num);

				String numString = Long.toString(num);
				while (num1 < Math.pow(10, digits / 2)) {
					boolean num1Valid = true;
					boolean num2Valid = true;
					// System.out.println(num + " % " + num1 + ": " + num %
					// num1);
					if (num % num1 == 0) {
						long num2 = num / num1;

						if ((num1 % 10 == 0) && (num2 % 10) == 0) {
							num1++;
							continue;
						}

						String num1String = Long.toString(num1);
						String num2String = Long.toString(num2);
						char[] allChars = (num1String + num2String).toCharArray();
						char[] numChars = numString.toCharArray();
						Arrays.sort(allChars);
						Arrays.sort(numChars);
						String num1AndNum2 = new String(allChars);
						String newNumString = new String(numChars);

						if (newNumString.equals(num1AndNum2)) {
							// System.out.println("**** " + num + " ****");
							if (num != lastFound) {
								System.out.println(outputStr);
								found++;
								lastFound = num;
								if (found < 10) {
									outputStr = "No. " + found + ": \t\t" + num + " = " + num1 + " * " + num2;
								} else
									outputStr = "No. " + found + ": \t" + num + " = " + num1 + " * " + num2;
							} else {

								if (outputStr.indexOf(num1String) == -1)
									outputStr += " = " + num1 + " * " + num2;

							}
						}
					}
					num1++;
					// System.out.println("num1: "+ num1);
				}
				num1 = minNum1;
			}
			System.out.println(outputStr);
		}
	}
}

// https://en.wikipedia.org/wiki/Vampire_number
/*
 * n Count of vampire numbers of length n 4 7, 6 148, 8 3228, 10 108454, 12
 * 4390670, 14 208423682
 */
// An important theoretical result found by Pete Hartley:
// If x·y is a vampire number then x·y == x+y (mod 9)

// A vampire number can have multiple distinct pairs of fangs. The first of
// infinitely many vampire numbers with 2 pairs of fangs:
// 125460 = 204 × 615 = 246 × 510
//
// The first with 3 pairs of fangs:
// 13078260 = 1620 × 8073 = 1863 × 7020 = 2070 × 6318
//
// The first with 4 pairs of fangs:
// 16758243290880 = 1982736 × 8452080 = 2123856 × 7890480 = 2751840 × 6089832 =
// 2817360 × 5948208
//
// The first with 5 pairs of fangs:
// 24959017348650 = 2947050 × 8469153 = 2949705 × 8461530 = 4125870 × 6049395 =
// 4129587 × 6043950 = 4230765 × 5899410
