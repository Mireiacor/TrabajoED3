package Modelo;

public class Pelicula {

	// Atributos de la clase Peliculas

	private String titulo;
	private String genero;
	private int anio;
	private int idPelicula;
	private int precio;

	/**
	 * Accedemos a la información de título
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Mutador del atributo titulo
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Accedemos a la información de genero
	 * 
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Mutador del atributo genero
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Accedemos a la información del año
	 * 
	 * @return anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Mutador del atributo año
	 * 
	 * @param anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * Accedemos a la infromación de idPelicula
	 * 
	 * @return idPelicula
	 */
	public int getIdPelicula() {
		return idPelicula;
	}

	/**
	 * Mutador del atributo idPelicula
	 * 
	 * @param idPelicula
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * Accedemos a la información del precio
	 * 
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Mutador del atributo precio
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
