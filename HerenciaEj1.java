package com.pjs.app;

	class Empleado {   
		//Atributos de la clase
	    String nombre;
	    String apellidos;
	    int edad;
	    String direccion;
	    String telefono;

	    // constructor de la clase  Metodo, que tiene el mismo nombre de la clase y se usa para inicalizar
	    //los atributos de la clase al crear una nueva instancia.
	    public Empleado(String nombre, String apellidos, int edad, String direccion, String telefono) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = edad;
	        this.direccion = direccion;
	        this.telefono = telefono;
    
	    }
	}

		class Cliente {  // 
	    //Atributos de la clase
	    String nombrec;
	    String apellidosc;
	    int edadc;
	    String direccionc;
	    String telefonoc;
	    int nrocliente;

	    // constructor de la clase  Metodo, que tiene el mismo nombre de la clase y se usa para inicalizar
	    //los atributos de la clase al crear una nueva instancia.
	    public Cliente(String nombrec, String apellidosc, int edadc, String direccionc, String telefonoc, int nrocliente) {
	        this.nombrec = nombrec;
	        this.apellidosc = apellidosc;
	        this.edadc = edadc;
	        this.direccionc = direccionc;
	        this.telefonoc = telefonoc;
	        this.nrocliente = nrocliente;
	    }
	}	
	
	
	public class HerenciaEj1 {
	    public static void main(String[] args) {
	       Empleado empleado1 = new Empleado("Sofía","Rodriguez",43,"Av. del Sur, 75","3815679278");
	       System.out.println(empleado1.nombre + " ");
	      // System.out.println(empleado1.apellidos);
	      // System.out.println(empleado1.edad);
	      // System.out.println(empleado1.direccion);
	      // System.out.println(empleado1.telefono);
	       Cliente cliente1 = new Cliente("Brenda","Rodriguez",43,"Av. del Sur, 75","3815679278", 123456);
	       System.out.println(cliente1.nombrec + " ");
	       System.out.println(cliente1.nrocliente);

	       
	       
	    }
	}

