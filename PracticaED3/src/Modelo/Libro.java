package Modelo;

public class Libro {

	// Atributos de la clase Libro

	private String titulo;
	private String autor;
	private int ISBN;
	private int idLibro;
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
	 * Mutador del atributo título
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Accedemos a la información de autor
	 * 
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Mutador del atributo autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Accedemoa a la información de ISBN
	 * 
	 * @return ISBN
	 */
	public int getISBN() {
		return ISBN;
	}

	/**
	 * Mutador del atributo ISBN
	 * 
	 * @param iSBN
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Accedemos a la información de idLibro
	 * 
	 * @return idLibro
	 */
	public int getIdLibro() {
		return idLibro;
	}

	/**
	 * Mutador del atributo idLibro
	 * 
	 * @param idLibro
	 */
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	/**
	 * Accedemos a la información de precio
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
