//Fig. X.X: Gato.java
package EstudioCaso3;

public class Gato extends Animal{
	
	//CONSTRUCTOR
	public Gato(String nombre, String raza){
		super(nombre, raza);
	}//fin constructor
	
	//MÉTODOS PROPIOS
	public String diOnomatopeya() {
		String sonidoGato=super.diOnomatopeya();
		return sonidoGato + "Miau";
	}//fin método diOnomatopeya
	
	//Método toString
	public String toString() {
		return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin método toString
	
}
