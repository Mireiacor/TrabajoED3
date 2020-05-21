package Modelo;

public class Neumonia extends Enfermedad {
	// Declaramos los atributos de la clase hija
	private boolean escalofrios;
	private boolean vomitos;
	private boolean diarrea;

	// Constructor por defecto
	public Neumonia() {
		this.escalofrios = true;
		this.vomitos = true;
		this.diarrea = true;

	}

	// Constructor por parametros
	public Neumonia(boolean fiebre, boolean tos, boolean dificultadRespiratoria, boolean dolorPresionPecho,
			boolean escalofrios, boolean vomitos, boolean diarrea) {
		super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho, diarrea);
		this.escalofrios = true;
		this.vomitos = true;
		this.diarrea = true;
	}

	// Getters y setters

	public boolean isEscalofrios() {
		return escalofrios;
	}

	public void setEscalofrios(boolean escalofrios) {
		this.escalofrios = escalofrios;
	}

	public boolean isVomitos() {
		return vomitos;
	}

	public void setVomitos(boolean vomitos) {
		this.vomitos = vomitos;
	}

	public boolean isDiarrea() {
		return diarrea;
	}

	public void setDiarrea(boolean diarrea) {
		this.diarrea = diarrea;
	}

}
