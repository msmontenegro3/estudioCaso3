//Fig. X.X: Perro.java
package EstudioCaso3;

public class Perro extends Animal{
	
	//CONSTRUCTOR
	public Perro(String nombre, String raza){
		super(nombre, raza);
	}//fin constructor
	
	//MÉTODOS PROPIOS
	public String diOnomatopeya() {
		String sonidoPerro = super.diOnomatopeya();
		return sonidoPerro + "Guau";
	}//fin método diOnomatopeya
	//Método toString
		public String toString() {
			return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin método toString
}
