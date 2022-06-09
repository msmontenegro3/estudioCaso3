//Fig. X.X: Gato.java
package EstudioCaso3;

public class Gato extends Animal{
	
	public Gato(String nombre, String raza){
		super(nombre, raza);
	}
	
	public String diOnomatopeya() {
		String sonidoGato=super.diOnomatopeya();
		return sonidoGato + "Miau";
	}
	//Método toString
	public String toString() {
		return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin método toString
	
}
