package Modelo;

public class Asma extends Enfermedad{
	//Declaramos los atributos de la clase hija
		private int pitidoSilvidoRespirar;
		
	//Constructor por defecto
		public Asma() {
			this.pitidoSilvidoRespirar = 0;

		}
		
	//Constructor por parametros
		public Asma(int fiebre, int tos, int dificultadRespiratoria, int dolorPresionPecho, int pitidoSilvidoRespirar) {
			super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho);
			this.pitidoSilvidoRespirar = pitidoSilvidoRespirar;
		}

	//Getters y setters
		public int getPitidoSilvidoRespirar() {
			return pitidoSilvidoRespirar;
		}

		public void setPitidoSilvidoRespirar(int pitidoSilvidoRespirar) {
			this.pitidoSilvidoRespirar = pitidoSilvidoRespirar;
		}
		
		
}
