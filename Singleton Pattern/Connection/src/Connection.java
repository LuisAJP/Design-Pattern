
public class Connection {

	private static Connection instance;
	// private static Connection instance = new Connection();

	// Contructor privado para que la clase no pueda ser instanciado
	private Connection() {

	}

	public static Connection getInstance() {
		if (instance == null) 
			instance = new Connection();
		return instance;
	}

	public void connect() {
		System.out.println("Connect BD");
	}

	public void disconnect() {
		System.out.println("Disconnect BD");
	}

}
