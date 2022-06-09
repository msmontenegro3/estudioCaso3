//Fig. X.X: Perro.java
package EstudioCaso3;

public class Perro extends Animal{
	public Perro(String nombre, String raza){
		super(nombre, raza);
	}
	
	public String diOnomatopeya() {
		String sonidoPerro = super.diOnomatopeya();
		return sonidoPerro + "Guau";
	}
	//Método toString
		public String toString() {
			return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
	}//fin método toString
}
