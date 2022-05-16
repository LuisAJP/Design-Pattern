
public class Main {

	public static void main(String[] args) {
		Connection c = Connection.getInstance();
		c.connect();
		c.disconnect();
		
		//Comprueba si el objeto retornado pertenece a la clase connection
		boolean check = c instanceof Connection;
		System.out.println(check);
	}

}
