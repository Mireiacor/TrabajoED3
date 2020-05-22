package Vista;

import java.util.Scanner;

import Modelo.Libro;
import Modelo.Pelicula;

public class Formulario {

	public void pideDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("�Quiere alquilar una pel�cula o un libro?");
		String opcion;
		opcion = teclado.nextLine();
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'p' || respuesta == 'P') {
			// pedir datos pelicula
			Pelicula p = new Pelicula();
			System.out.print("T�tulo de la pel�cula que desea alquilar: ");
			p.setTitulo(teclado.nextLine());
			System.out.print("G�nero de la pel�cula: ");
			p.setGenero(teclado.nextLine());
			System.out.print("A�o en que se rod� la pel�cula: ");
			p.setAnio(teclado.nextInt());
			System.out.print("Precio de la pel�cula: ");
			p.setPrecio(teclado.nextInt());
		} else if (respuesta == 'l' || respuesta == 'L') {
			// pedir datos libros
			Libro l = new Libro();
			System.out.print("T�tulo del libro que quiere alquilar: ");
			l.setTitulo(teclado.nextLine());
			System.out.println("�Cu�l es el autor del libro?");
			l.setAutor(teclado.nextLine());
			System.out.println("�Tiene ISBN?");
			opcion = teclado.nextLine();
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				System.out.println("�Cu�l es?");
				l.setISBN(teclado.nextInt());
			} else if (respuesta == 'n' || respuesta == 'N') {
				System.out.println("�Cu�l es el precio del libro?");
				l.setPrecio(teclado.nextInt());
			}
		}

	}
	
}
