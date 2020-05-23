package Modelo;

public class Persona {

	// Atributos de la clase Persona

	private String nombre;
	private String Apellidos;
	private String direccion;
	private int telefono;
	private String DNI;
	private int idPelicula;
	private int idLibro;

	/**
	 * Accedemos a la informaci�n de idLibro
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
	 * Acedemos a la informaci�n de nombre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Mutador del atributo nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Accedemos a la infromaci�n de Apellidos
	 * 
	 * @return apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * Mutador del atributo apellidos
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	/**
	 * Accedemos a la informaci�n de la direcci�n
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Mutador del atributo direccion
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Accedemos a la informaci�n de tel�fono
	 * 
	 * @return telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Mutador del atributo tel�fono
	 * 
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * Accedemos a la informaci�n de DNI
	 * 
	 * @return DNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Mutador del atributo DNI
	 * 
	 * @param dNI
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * Accedemos a la informaci�n de idPelicula
	 * 
	 * @return idPleicula
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

}
