package Vista;

import java.util.Scanner;

import Controlador.ConsultarDatos;
import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.Persona;

public class Formulario {
	/**
	 * Mιtodo principal
	 */

	public void formularioPrincipal() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("BIENVENIDOS A LA BIBLIOTECA");
		System.out.println(
				"");
		System.out.print("ΏQuiere comprar una pelνcula o un libro? ");
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			ConsultarDatos c = new ConsultarDatos();
			Pelicula p = new Pelicula();
			System.out.print("Introduzca el tνtulo de la pelνcula que quiere consultar: ");
			p.setTitulo(teclado.nextLine());
			System.out.println(
					"");
			c.consultarPelicula(p);
		} else if (respuesta == 'l' || respuesta == 'L') {
			ConsultarDatos c = new ConsultarDatos();
			Libro l = new Libro();
			System.out.print("Introduzca el tνtulo del libro que quiere consultar: ");
			l.setTitulo(teclado.nextLine());
			c.consultarLibro(l);
		}
	}

	/**
	 * Mιtodo que pide al usuario los datos para realizar la compra de una pelνcula
	 * 
	 * @param p
	 */
	public void pideDatosPelicula(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("ΏQuiere comprar la pelνcula?");
		char respuesta = teclado.nextLine().charAt(0);
		System.out.println(
				"");
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su direcciσn: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca telιfono: ");
			p.setTelefono(teclado.nextInt());
			System.out.println(
					"");
		} else {
			System.out.println("‘HASTA PRONTO!");
		}
	}

	/**
	 * Mιtodo para pedir al usuario los datos para realizar la compra de un libro
	 * 
	 * @param p
	 */
	public void pideDatosLibro(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("ΏQuiere comprar el libro?");
		char respuesta = teclado.nextLine().charAt(0);
		System.out.println(
				"");
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su direcciσn: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca telιfono: ");
			p.setTelefono(teclado.nextInt());
			System.out.println(
					"");
		} else {
			System.out.println("‘HASTA PRONTO!");
		}
	}

}
