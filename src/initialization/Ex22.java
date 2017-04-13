// (2) Write a switch statement for the enum in the previous example.
// For each case, output a description of that particular currency.
package initialization;

public class Ex22 {
	static void description(Bill bill) {
		switch (bill) {
		case ONE:
			System.out.println("It's one dollar.");
			break;
		case FIVE:
			System.out.println("It's five dollars.");
			break;
		case TEN:
			System.out.println("It's ten dollars.");
			break;
		case TWENTY:
			System.out.println("It's twenty dollars.");
			break;
		case FIFTY:
			System.out.println("It's fifty dollars.");
			break;
		case HUNDRED:
			System.out.println("It's one hundred dollars.");
			break;
		}
	}

	public static void main(String args[]) {
		for (Bill bill : Bill.values()) {
			description(bill);
		}
	}
}
