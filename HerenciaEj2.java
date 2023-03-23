package com.pjs.app;

// EJEMPLO HERENCIA: PERMITE QUE UNA CLASE HEREDE ATRIBUTOS Y METODOS DE OTRA. ASI CREAMOS
// CLASES NUEVAS QUE COMPARTEN CARACTERISTICAS CON OTRAS YA EXISTENTES. Y EVITAMOS LA DUPLICACION DE CODIGO.

// CLASE PADRE 

// CLASE HIJA ALUMNO
// CLASE HIJA PROFESOR
class persona{ // vamos a usar como clase Padre
	// atributos de la clase padre
	int dni;
	String apellido;
	String nombre;
	int edad;
	String direccion;
	String telefono;
	
	// constructor clase padre, Persona
	
	public persona(int dni, String apellido, String nombre, int edad, String direccion, String telefono) {
		this.dni= dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
}
 // clase HIJA alumno

class alumno extends persona{ // palabra reservada para indicar que hereda atributos de clase padre persona
	// atributo propio de la clase hija
	int legajo;
	
	public alumno(int dni, String apellido, String nombre, int edad, String direccion , String telefono, int legajo) {
		super(dni,apellido,nombre, edad, direccion, telefono ); // hereda atributos de la clase padre
		this.legajo=legajo;
	}
}

// clase HIJA profesor
class profesor extends persona{
	// atributo propio de la clase hija profesor 
	String asignatura;
	
	public profesor (int dni, String apellido, String nombre, int edad, String direccion , String telefono, String asignatura) {
		super(dni,apellido,nombre, edad, direccion, telefono ); // hereda atributos de la clase padre
		this.asignatura=asignatura;
	}
}



public class HerenciaEj2 {

	public static void main(String[] args) {
		persona persona1 = new persona(35689525,"Rodriguez","Jose", 47,"Belgrano 4500", "3816673456");
		System.out.println("Datos de la clase Padre Persona");
		System.out.println("-------------------------------");
		System.out.println("el DNI de la persona es: " + persona1.dni );
		System.out.println("el apellido de la persona es: " + persona1.apellido );
		System.out.println("el nombre de la persona es: " + persona1.nombre );
		System.out.println("el domicilio de la persona es: " + persona1.direccion );
		System.out.println("el telefono de la persona es: " + persona1.telefono );
		
		
		alumno alumno1 = new alumno(36589741,"Gonzalez","Pedro",19,"Sarmiento 4567","01189653217", 22698);
		System.out.println("Datos de la clase Hija alumno");
		System.out.println("-----------------------------");
		System.out.println("el nombre del alumno es: " + alumno1.nombre + " el legajo es: " + alumno1.legajo );
		//System.out.println("el nombre del alumno es: " + alumno1.nombre + " el legajo es: " + alumno1.legajo );

		profesor profesor1 = new profesor(26587433,"Perez","Fernando",45,"Aconquija 5636","03884598631","Matematicas");
		System.out.println("Datos de la clase Hija profesor");
		System.out.println("-------------------------------");
		System.out.println("el nombre del profe es : " + profesor1.nombre + " la asignatura es: " + profesor1.asignatura );

		
	}

}
