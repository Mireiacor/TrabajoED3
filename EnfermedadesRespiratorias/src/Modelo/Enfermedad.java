package Modelo;

public class Enfermedad {
	//Declaramos los atributos de la clase padre
		protected int fiebre;
		protected int tos;
		protected int dificultadRespiratoria;
		protected int dolorPresionPecho;
		
	//Constructor por defecto
		public Enfermedad() {
			this.fiebre = 0;
			this.tos = 0;
			this.dificultadRespiratoria = 0;
			this.dolorPresionPecho = 0;
		}
		
	//Constructor por parametros
		public Enfermedad(int fiebre, int tos, int dificultadRespiratoria, int dolorPresionPecho) {
			this.fiebre = fiebre;
			this.tos = tos;
			this.dificultadRespiratoria = dificultadRespiratoria;
			this.dolorPresionPecho = dolorPresionPecho;
		}

	//Setters y getters
		public int getFiebre() {
			return fiebre;
		}

		public void setFiebre(int fiebre) {
			this.fiebre = fiebre;
		}

		public int getTos() {
			return tos;
		}

		public void setTos(int tos) {
			this.tos = tos;
		}

		public int getDificultadRespiratoria() {
			return dificultadRespiratoria;
		}

		public void setDificultadRespiratoria(int dificultadRespiratoria) {
			this.dificultadRespiratoria = dificultadRespiratoria;
		}

		public int getDolorPresionPecho() {
			return dolorPresionPecho;
		}

		public void setDolorPresionPecho(int dolorPresionPecho) {
			this.dolorPresionPecho = dolorPresionPecho;
		}
	
}
