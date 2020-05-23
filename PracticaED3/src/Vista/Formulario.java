package Vista;

import java.util.Scanner;

import Controlador.ConsultarDatos;
import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.Persona;

public class Formulario {
	/**
	 * M�todo principal
	 */

	public void formularioPrincipal() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("BIENVENIDOS A LA BIBLIOTECA");
		System.out.println(
				"����������������������������������������������������������������������������������������������������������������");
		System.out.print("�Quiere comprar una pel�cula o un libro? ");
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			ConsultarDatos c = new ConsultarDatos();
			Pelicula p = new Pelicula();
			System.out.print("Introduzca el t�tulo de la pel�cula que quiere consultar: ");
			p.setTitulo(teclado.nextLine());
			System.out.println(
					"����������������������������������������������������������������������������������������������������������������");
			c.consultarPelicula(p);
		} else if (respuesta == 'l' || respuesta == 'L') {
			ConsultarDatos c = new ConsultarDatos();
			Libro l = new Libro();
			System.out.print("Introduzca el t�tulo del libro que quiere consultar: ");
			l.setTitulo(teclado.nextLine());
			c.consultarLibro(l);
		}
	}

	/**
	 * M�todo que pide al usuario los datos para realizar la compra de una pel�cula
	 * 
	 * @param p
	 */
	public void pideDatosPelicula(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("�Quiere comprar la pel�cula?");
		char respuesta = teclado.nextLine().charAt(0);
		System.out.println(
				"����������������������������������������������������������������������������������������������������������������");
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su direcci�n: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca tel�fono: ");
			p.setTelefono(teclado.nextInt());
			System.out.println(
					"����������������������������������������������������������������������������������������������������������������");
		} else {
			System.out.println("�HASTA PRONTO!");
		}
	}

	/**
	 * M�todo para pedir al usuario los datos para realizar la compra de un libro
	 * 
	 * @param p
	 */
	public void pideDatosLibro(Persona p) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("�Quiere comprar el libro?");
		char respuesta = teclado.nextLine().charAt(0);
		System.out.println(
				"����������������������������������������������������������������������������������������������������������������");
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduzca su DNI: ");
			p.setDNI(teclado.nextLine());
			System.out.print("Introduzca su nombre: ");
			p.setNombre(teclado.nextLine());
			System.out.print("Introduzca sus apellidos: ");
			p.setApellidos(teclado.nextLine());
			System.out.print("Introduzca su direcci�n: ");
			p.setDireccion(teclado.nextLine());
			System.out.print("Introduzca tel�fono: ");
			p.setTelefono(teclado.nextInt());
			System.out.println(
					"����������������������������������������������������������������������������������������������������������������");
		} else {
			System.out.println("�HASTA PRONTO!");
		}
	}

}
