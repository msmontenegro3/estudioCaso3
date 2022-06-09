//Fig. X.X: Perro.java
package EstudioCaso3;

public class Perro extends Animal{
	
	//CONSTRUCTOR
	public Perro(String nombre, String raza){
		super(nombre, raza);
	}//fin constructor
	
	//M�TODOS PROPIOS
	public String diOnomatopeya() {
		String sonidoPerro = super.diOnomatopeya();
		return sonidoPerro + "Guau";
	}//fin m�todo diOnomatopeya
	//M�todo toString
		public String toString() {
			return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin m�todo toString
}
