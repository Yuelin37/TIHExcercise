// (3) Write a program that simulates coin-flipping.
package operators;

import java.util.Random;

public class Ex7 {
public static void main(String args[]){
	 Random rand = new Random();
	 System.out.println(rand.nextBoolean()?"Heads":"Tails");
}
}
