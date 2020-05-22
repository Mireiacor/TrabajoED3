package Vista;

import java.util.Scanner;

import Controlador.ConsultarDatos;
import Controlador.InsertarDatos;
import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.Persona;

public class Formulario {

	public void formularioPrincipal() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quiere comprar una película o un libro?");
		String opcion;
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			ConsultarDatos c = new ConsultarDatos();
			InsertarDatos i = new InsertarDatos();
			Pelicula p = new Pelicula();
			System.out.print("Introduzca el título de la película que quiere consultar: ");
			p.setTitulo(teclado.nextLine());
			c.consultarPelicula(p);
			i.insertarPelicula();
		} else if (respuesta == 'l' || respuesta == 'L') {
			ConsultarDatos c = new ConsultarDatos();
			InsertarDatos i = new InsertarDatos();
			Libro l = new Libro();
			System.out.print("Introduzca el título del libro que quiere consultar: ");
			l.setTitulo(teclado.nextLine());
			c.consultarLibro();
			i.insertarLibro();
		}
	}

	public void pideDatosPelicula(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quiere comprar la película?");
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su dirección: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca teléfono: ");
			p.setTelefono(teclado.nextInt());
		} else {
			System.out.println("¡HASTA PRONTO!");
		}
	}
	public void pideDatosLibro(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quiere comprar el libro?");
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su dirección: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca teléfono: ");
			p.setTelefono(teclado.nextInt());
		} else {
			System.out.println("¡HASTA PRONTO!");
		}
	}


	public void pideDatosConsulta() {
		Pelicula p = new Pelicula();
		Libro l = new Libro();
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quieres consultar una película o un libro?");
		String opcion;
		opcion = teclado.nextLine();
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			ConsultarDatos c = new ConsultarDatos();
			c.consultarPelicula(p);
			System.out.print("Introduzca el título de la película que quiere consultar: ");
			p.setTitulo(teclado.nextLine());
		} else if (respuesta == 'l' || respuesta == 'L') {
			ConsultarDatos c = new ConsultarDatos();
			c.consultarLibro();
			System.out.print("Introduzca el título del libro que quiere consultar: ");
			l.setTitulo(teclado.nextLine());
		}
	}

}
