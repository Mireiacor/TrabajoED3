package Modelo;

public class Asma extends Enfermedad{
	//Declaramos los atributos de la clase hija
		private boolean pitidoSilvidoRespirar;
		
	//Constructor por defecto
		public Asma() {
			this.pitidoSilvidoRespirar = true;

		}
		
	//Constructor por parametros
		public Asma(boolean fiebre, boolean tos, boolean dificultadRespiratoria, boolean dolorPresionPecho, boolean pitidoSilvidoRespirar) {
			super(fiebre, tos, dificultadRespiratoria, dolorPresionPecho, pitidoSilvidoRespirar);
			this.pitidoSilvidoRespirar = pitidoSilvidoRespirar;
		}
	//Getters y setters

		public boolean isPitidoSilvidoRespirar() {
			return pitidoSilvidoRespirar;
		}

		public void setPitidoSilvidoRespirar(boolean pitidoSilvidoRespirar) {
			this.pitidoSilvidoRespirar = pitidoSilvidoRespirar;
		}
		
}
