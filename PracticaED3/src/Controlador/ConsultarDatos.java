package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.Persona;
import Vista.Formulario;

public class ConsultarDatos {
	/**
	 * Método para consultar películas que hay en la base de datos
	 * 
	 * @param p
	 */
	public void consultarPelicula(Pelicula p) {
		Formulario f = new Formulario();
		Persona pe = new Persona();
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery(
					"SELECT titulo, genero, anio, precio " + "FROM pelicula WHERE titulo = '" + p.getTitulo() + "'");
			// select titulo, genero, anio, precio FROM pelicula where titulo = 'Joker'
			if (registro.next()) {
				String nom = registro.getString("titulo");
				System.out.println("Titulo: " + registro.getString("titulo"));
				System.out.println("Género: " + registro.getString("genero"));
				System.out.println("Año: " + registro.getString("anio"));
				System.out.println("Precio: " + registro.getString("precio"));
				InsertarDatos i = new InsertarDatos();
				i.insertarPelicula(p);
			} else {
				System.out.println("La película introducida no está en nuestra base de datos");
			}
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Método para consultar libros que hay en la base de datos
	 * 
	 * @param l
	 */
	public void consultarLibro(Libro l) {
		Formulario f = new Formulario();
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery(
					"SELECT titulo, autor, ISBN, precio " + "FROM libro WHERE titulo = '" + l.getTitulo() + "'");
			if (registro.next()) {
				String nom = registro.getString("titulo");
				System.out.println("Titulo: " + registro.getString("titulo"));
				System.out.println("Autor: " + registro.getString("autor"));
				System.out.println("ISBN: " + registro.getString("ISBN"));
				System.out.println("Precio: " + registro.getString("precio"));
				InsertarDatos i = new InsertarDatos();
				i.insertarLibro(l);
			} else {
				System.out.println("El libro introducido no está en nuestra base de datos");
			}
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
