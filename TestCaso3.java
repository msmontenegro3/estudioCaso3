//Fig. X.X: TestCaso3.java
package EstudioCaso3;

public class TestCaso3 {

	public static void main(String[] args) {

		//Instancia la clase perro, con par�metros null
		Gato gato = new Gato(null, null);
		//Establece los datos del gato nombre y raza
		gato.setNombre("Misif�s");
		gato.setRaza("Siam�s");
		//Invoca el m�todo diOnomatopeya para Pato
		System.out.println(gato.diOnomatopeya());
		//Instancia la clase perro, con par�metros null
		Perro perro = new Perro(null, null);
		//Establece los datos del perro nombre y raza
		perro.setNombre("Firulais");
		perro.setRaza("Salchicha");
		//Invoca el m�todo diOnomatopeya para Perro
		System.out.println(perro.diOnomatopeya());
		
		//Imprime la representaci�n string de las clases Perro y Gato
		System.out.println("----------------------------------");
		System.out.println("Datos completos");
		System.out.println("----------------------------------");
		System.out.println(perro);
		System.out.println(gato);
		
	}

}
