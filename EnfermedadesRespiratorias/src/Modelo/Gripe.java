package Modelo;

public class Gripe extends Enfermedad {
	//Declaramos los atributos de la clase hija
		private int dolorCabeza;
		private int dolorGarganta;
		private int congestion;
		private int estornudos;
	
	//Constructor por defecto
	public Gripe() {
		this.dolorCabeza = 0;
		this.dolorGarganta = 0;
		this.congestion = 0;
		this.estornudos = 0;
	}
	
	//Constructor por parametros
	public Gripe(int fiebre, int tos, int dificultadRespiratoria, int dolorPresionPecho, int dolorCabeza, int dolorGarganta, int congestion, int estornudos) {
		super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho);
		this.dolorCabeza = dolorCabeza;
		this.dolorGarganta = dolorGarganta;
		this.congestion = congestion;
		this.estornudos = estornudos;
	}

	//Getters y setters
	public int getDolorCabeza() {
		return dolorCabeza;
	}

	public void setDolorCabeza(int dolorCabeza) {
		this.dolorCabeza = dolorCabeza;
	}

	public int getDolorGarganta() {
		return dolorGarganta;
	}

	public void setDolorGarganta(int dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}

	public int getCongestion() {
		return congestion;
	}

	public void setCongestion(int congestion) {
		this.congestion = congestion;
	}

	public int getEstornudos() {
		return estornudos;
	}

	public void setEstornudos(int estornudos) {
		this.estornudos = estornudos;
	}
	
	

}
