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
	public void insertarPelicula() {
		Formulario f = new Formulario();
		Persona p = new Persona();
		Pelicula pe = new Pelicula();
		f.pideDatosPelicula(p);
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			// Crear consulta
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate("insert into persona (DNI, nombre, apellidos, direccion, telefono, idPelicula) values('"
							+ p.getDNI() + "', '" + p.getNombre() + "', '" + p.getApellidos() + "', " + p.getDireccion() + "', " + p.getTelefono() + ", (SELECT idPelicula FROM pelicula WHERE titulo = '" + pe.getTitulo() + "'))");
			conexion.close();
			System.out.println("Artículo comprado!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertarLibro() {
		Formulario f = new Formulario();
		Persona p = new Persona();
		Libro l = new Libro();
		f.pideDatosLibro(p);
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			// Crear consulta
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate(
					"insert into persona (DNI, nombre, apellidos, direccion, telefono, idLibro) values('"
							+ p.getDNI() + "', '" + p.getNombre() + "', '" + p.getApellidos() + "', " + p.getDireccion() + "', " + p.getTelefono() + ", (SELECT idLibro FROM libro WHERE titulo = '" + l.getTitulo() + "'))");
			conexion.close();
			System.out.println("Artículo comprado!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
