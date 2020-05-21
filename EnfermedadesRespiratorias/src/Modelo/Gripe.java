package Modelo;

public class Gripe extends Enfermedad {
	//Declaramos los atributos de la clase hija
		private boolean dolorCabeza;
		private boolean dolorGarganta;
		private boolean congestion;
		private boolean estornudos;
	
	//Constructor por defecto
	public Gripe() {
		this.dolorCabeza = true;
		this.dolorGarganta = true;
		this.congestion = true;
		this.estornudos = true;
	}
	
	//Constructor por parametros
	public Gripe(boolean fiebre, boolean tos, boolean dificultadRespiratoria, boolean dolorPresionPecho, boolean dolorCabeza, boolean dolorGarganta, boolean congestion, boolean estornudos) {
		super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho, estornudos);
		this.dolorCabeza = true;
		this.dolorGarganta = true;
		this.congestion = true;
		this.estornudos = true;
	}
	
	//Getters y setters

	public boolean isDolorCabeza() {
		return dolorCabeza;
	}

	public void setDolorCabeza(boolean dolorCabeza) {
		this.dolorCabeza = dolorCabeza;
	}

	public boolean isDolorGarganta() {
		return dolorGarganta;
	}

	public void setDolorGarganta(boolean dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}

	public boolean isCongestion() {
		return congestion;
	}

	public void setCongestion(boolean congestion) {
		this.congestion = congestion;
	}

	public boolean isEstornudos() {
		return estornudos;
	}

	public void setEstornudos(boolean estornudos) {
		this.estornudos = estornudos;
	}

	
	
	

}
