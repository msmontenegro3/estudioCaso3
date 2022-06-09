//Fig. X.X: Animal.java
package EstudioCaso3;

public class Animal {
	private String nombre;
	private String raza;


	public Animal(String nombre, String raza) {
		this.nombre=nombre;
		this.raza=raza;
	}
	
	//SETTERS Y GETTERS
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	//M�TODOS PROPIOS
	public String diOnomatopeya() {
		
		return "El animal produce un sonido y es: ";
	}//fin de la clase diOnomatopeya
	
	//M�todo toString
		public String toString() {
			return String.format("Nombre: %s \nRaza: %s \n %s:",getNombre(), getRaza(), diOnomatopeya());
		}//fin m�todo toString
}//fin de la clase Animal
