package Modelo;

public class Enfermedad {
	//Declaramos los atributos de la clase padre
		protected boolean fiebre;
		protected boolean tos;
		protected boolean tipoTos;
		protected boolean dificultadRespiratoria;
		protected boolean dolorPresionPecho;
		
	//Constructor por defecto
		public Enfermedad() {
			this.fiebre = true;
			this.tos = true;
			this.tipoTos = true;
			this.dificultadRespiratoria = true;
			this.dolorPresionPecho = true;
		}
		
	//Constructor por parametros
		public Enfermedad(boolean fiebre, boolean tos, boolean tipoTos, boolean dificultadRespiratoria, boolean dolorPresionPecho) {
			this.fiebre = true;
			this.tos = true;
			this.tipoTos = true;
			this.dificultadRespiratoria = true;
			this.dolorPresionPecho = true;
		}
//Getters y setters
		public boolean isFiebre() {
			return fiebre;
		}

		public void setFiebre(boolean fiebre) {
			this.fiebre = fiebre;
		}

		public boolean isTos() {
			return tos;
		}

		public void setTos(boolean tos) {
			this.tos = tos;
		}

		public boolean isTipoTos() {
			return tipoTos;
		}

		public void setTipoTos(boolean tipoTos) {
			this.tipoTos = tipoTos;
		}

		public boolean isDificultadRespiratoria() {
			return dificultadRespiratoria;
		}

		public void setDificultadRespiratoria(boolean dificultadRespiratoria) {
			this.dificultadRespiratoria = dificultadRespiratoria;
		}

		public boolean isDolorPresionPecho() {
			return dolorPresionPecho;
		}

		public void setDolorPresionPecho(boolean dolorPresionPecho) {
			this.dolorPresionPecho = dolorPresionPecho;
		}

		
		
		
	
}
