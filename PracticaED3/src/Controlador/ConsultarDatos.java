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
	public void consultarPelicula(Pelicula p) {
		Formulario f = new Formulario();
		Persona pe = new Persona();
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "biblioteca", "biblioteca");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery(
					"SELECT titulo, genero, anio, precio " + "FROM pelicula WHERE titulo = '" + p.getTitulo() + "'");
			//select titulo, genero, anio, precio FROM pelicula where titulo = 'Joker'
			if (registro.next()) {
				String nom = registro.getString("titulo");
				System.out.println("Titulo: " + registro.getString("titulo"));
				System.out.println("Género: " + registro.getString("genero"));
				System.out.println("Año: " + registro.getString("anio"));
				System.out.println("Precio: " + registro.getString("precio"));
				f.pideDatosPelicula(pe);
			} else {
				System.out.println("La película introducida no está en nuestra base de datos");
			}
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void consultarLibro() {
		Formulario f = new Formulario();
		Libro l = new Libro();
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery(
					"select titulo, autor, ISBN, precio " + "from libro where titulo = " + l.getTitulo());
			if (registro.next()) {
				String nom = registro.getString("titulo");
				System.out.println("Titulo: " + registro.getString("titulo"));
				System.out.println("Autor: " + registro.getString("autor"));
				System.out.println("ISBN: " + registro.getString("ISBN"));
				System.out.println("Precio: " + registro.getString("precio"));
			} else {
				System.out.println("El libro introducido no está en nuestra base de datos");
			}
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
