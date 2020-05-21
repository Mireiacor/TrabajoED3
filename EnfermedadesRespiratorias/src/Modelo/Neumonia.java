package Modelo;

public class Neumonia extends Enfermedad {
	//Declaramos los atributos de la clase hija
		private int escalofrios;
		private int vomitos;
		private int diarrea;
		
	//Constructor por defecto
		public Neumonia() {
			this.escalofrios = 0;
			this.vomitos = 0;
			this.diarrea = 0;

		}
				
	//Constructor por parametros
		public Neumonia(int fiebre, int tos, int dificultadRespiratoria, int dolorPresionPecho, int escalofrios, int vomitos, int diarrea) {
			super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho);
			this.escalofrios = escalofrios;
			this.vomitos = vomitos;
			this.diarrea = diarrea;
		}

	//Getters y setters
		public int getEscalofrios() {
			return escalofrios;
		}

		public void setEscalofrios(int escalofrios) {
			this.escalofrios = escalofrios;
		}

		public int getVomitos() {
			return vomitos;
		}

		public void setVomitos(int vomitos) {
			this.vomitos = vomitos;
		}

		public int getDiarrea() {
			return diarrea;
		}

		public void setDiarrea(int diarrea) {
			this.diarrea = diarrea;
		}
		
}
