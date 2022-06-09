//Fig. X.X: Gato.java
package EstudioCaso3;

public class Gato extends Animal{
	
	//CONSTRUCTOR
	public Gato(String nombre, String raza){
		super(nombre, raza);
	}//fin constructor
	
	//M�TODOS PROPIOS
	public String diOnomatopeya() {
		String sonidoGato=super.diOnomatopeya();
		return sonidoGato + "Miau";
	}//fin m�todo diOnomatopeya
	
	//M�todo toString
	public String toString() {
		return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin m�todo toString
	
}
