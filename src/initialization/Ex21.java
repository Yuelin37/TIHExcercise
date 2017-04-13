// (1) Create an enum of the least-valuable six types of paper currency.
// Loop through the values( ) and print each value and its ordinal( ).
package initialization;

enum Bill {
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class Ex21 {
	public static void main(String args[]) {
		for (Bill bill : Bill.values()) {
			System.out.println(bill + " ordinal: " + bill.ordinal());
		}
	}
}
