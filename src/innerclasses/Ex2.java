package innerclasses;

class Message{
	String msg= "";
	public Message(String msg){
		this.msg = msg;
	}
	public String toString(){
		return this.msg;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++){
			sequence.add(new Message("Item " + i));			
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}

}

// Exercise 2: (1) Create a class that holds a String, and has a toString( )
// method that displays this String. Add several instances of your new class to
// a Sequence object, then display them.