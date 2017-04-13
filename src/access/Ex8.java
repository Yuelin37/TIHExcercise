// (4) Following the form of the example Lunch.java,
// create a class called ConnectionManager that manages a fixed array of Connection objects.
// The client programmer must not be able to explicitly create Connection objects,
// but can only get them via a static method in ConnectionManager.
// When the ConnectionManager runs out of objects, it returns a null reference.
// Test the classes in main( ).
package access;

public class Ex8 {
	public static void main(String args[]) {

		for (int i = 0; i < 10; i++) {
			System.out.println(ConnectionManger.getConn());
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(ConnectionManger.getConn());
		}
	}
}

class Connection {
	int id = 0;
	boolean inUse = false;
}

class ConnectionManger {
	private static Connection[] connections = new Connection[5];
	private static ConnectionManger cm = new ConnectionManger();

	private ConnectionManger() {
		for (int i = 0; i < 5; i++) {
			connections[i] = new Connection();
		}
	}

	public static Connection getConn() {
		for (Connection conn : connections) {
			if (!conn.inUse) {
				conn.inUse = true;
				return conn;
			}
		}
		return null;
	}

	public static ConnectionManger getCM() {
		return cm;
	}
}