package Vista;

import java.util.Scanner;

import Modelo.Libro;
import Modelo.Pelicula;

public class Formulario {

	public void pideDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Quiere alquilar una película o un libro?");
		String opcion;
		opcion = teclado.nextLine();
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			// pedir datos pelicula
			Pelicula p = new Pelicula();
			System.out.print("Título de la película que desea alquilar: ");
			p.setTitulo(teclado.nextLine());
			System.out.print("Género de la película: ");
			p.setGenero(teclado.nextLine());
			System.out.print("Año en que se rodó la película: ");
			p.setAnio(teclado.nextInt());
			System.out.print("Precio de la película: ");
			p.setPrecio(teclado.nextInt());
		} else if (respuesta == 'l' || respuesta == 'L') {
			// pedir datos libros
			Libro l = new Libro();
			System.out.print("Título del libro que quiere alquilar: ");
			l.setTitulo(teclado.nextLine());
			System.out.println("¿Cuál es el autor del libro?");
			l.setAutor(teclado.nextLine());
			System.out.println("¿Tiene ISBN?");
			opcion = teclado.nextLine();
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				System.out.println("¿Cuál es?");
				l.setISBN(teclado.nextInt());
			} else if (respuesta == 'n' || respuesta == 'N') {
				System.out.println("¿Cuál es el precio del libro?");
				l.setPrecio(teclado.nextInt());
			}
		}

	}
	
}
