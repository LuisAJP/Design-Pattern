//Patron Singleton
//Solo se instancia el objeto una sola vez durante la vida util de la aplicaci�n
//cuyo proposito es ahorrar memoria
//https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

public class SingleObject {
	//create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
