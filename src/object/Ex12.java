// (2) Find the code for the second version of HelloDate.java,
// which is the simple comment documentation example.
// Execute Javadoc on the file and view the results with your Web browser.
package object;

//: object/Ex12.java
import java.util.*;

/**
 * The first Thinking in Java example program. Displays a string and today's
 * date.
 * 
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class Ex12 {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 * @throws exceptions
	 *             No exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it’s: ");
		System.out.println(new Date());
	}
} /*
	 * Output: (55% match) Hello, it’s: Wed Oct 05 14:39:36 MDT 2005
	 */// :~