package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.Persona;
import Vista.Formulario;

public class InsertarDatos {
	/**
	 * Método para insertar en la base de datos los datos introducirdos por el
	 * usuario que compra una película
	 * 
	 * @param pe
	 */
	public void insertarPelicula(Pelicula pe) {
		Formulario f = new Formulario();
		Persona p = new Persona();
		f.pideDatosPelicula(p);
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			// Crear consulta
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate("INSERT INTO persona (DNI, nombre, apellidos, direccion, telefono, idPelicula)\r\n"
					+ "	VALUES ('" + p.getDNI() + "', '" + p.getNombre() + "', '" + p.getApellidos() + "', '"
					+ p.getDireccion() + "', " + p.getTelefono() + ", (SELECT idPelicula FROM pelicula WHERE titulo = '"
					+ pe.getTitulo() + "'))");
			conexion.close();
			System.out.println("Artículo comprado!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para insertar en la base de datos los datos introducidos por el
	 * usuario que compra un libro
	 * 
	 * @param l
	 */
	public void insertarLibro(Libro l) {
		Formulario f = new Formulario();
		Persona p = new Persona();
		f.pideDatosLibro(p);
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			// Crear consulta
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate("insert into persona (DNI, nombre, apellidos, direccion, telefono, idLibro) values('"
					+ p.getDNI() + "', '" + p.getNombre() + "', '" + p.getApellidos() + "','" + p.getDireccion() + "', "
					+ p.getTelefono() + ", (SELECT idLibro FROM libro WHERE titulo = '" + l.getTitulo() + "'))");
			conexion.close();
			System.out.println("Artículo comprado!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
