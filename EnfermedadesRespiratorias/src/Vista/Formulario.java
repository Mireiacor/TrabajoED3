package Vista;

import java.util.Scanner;

public class Formulario {
	public void menu() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* BIENVENIDO A LA APLICACIÓN DIAGNOSTICADORA DE ENFERMEDADES RESPIRATORIAS  *");
		System.out.println("* pulse intro para continuar                                                *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	}
	
	public void menu2() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* + ¿Tienes fiebre?                                                         *");
		System.out.println("*		1.SI                                                                *");
		System.out.println("*		2.NO                                                                *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes tos?¿Qué tipo de tos?                                           *");
		System.out.println("*		3.SI, tengo tos seca                                                *");
		System.out.println("*		4.SI, tengo tos con flemas                                        	*");
		System.out.println("*		5.NO                                                                *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes dolor de cabeza?                                                *");
		System.out.println("*		6.SI                                                                *");
		System.out.println("*		7.NO                                                                *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes dificultad respiratoria?                                        *");
		System.out.println("*		8.SI                                                                *");
		System.out.println("*		9.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes escalofrios?                                                    *");
		System.out.println("*		10.SI                                                               *");
		System.out.println("*		11.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Te suena un pitido o un silvido al respirar?                           *");
		System.out.println("*		12.SI                                                               *");
		System.out.println("*		13.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes dolor o presión en el pecho?                                    *");
		System.out.println("*		14.SI                                                               *");
		System.out.println("*		15.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes vómitos?                                                        *");
		System.out.println("*		16.SI                                                               *");
		System.out.println("*		17.NO                                                               *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes diarrea?                                                        *");
		System.out.println("*		18.SI                                                               *");
		System.out.println("*		19.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes dolor de garganta?                                              *");
		System.out.println("*		20.SI                                                               *");
		System.out.println("*		21.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes congestión?                                                     *");
		System.out.println("*		22.SI                                                               *");
		System.out.println("*		23.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* + ¿Tienes estornudos?                                                     *");
		System.out.println("*		24.SI                                                               *");
		System.out.println("*		25.NO                                      	                        *");
		System.out.println("*		                                                                    *");
		System.out.println("* 0. SALIR	                                                                *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*		                                                                    *");
	}
	
	public void opcion() {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		menu2();
		System.out.print("Introduzca los numeros de los sintomas del menu que usted tenga: ");
		opcion = teclado.nextInt();
		switch (opcion) {
		

		case 0:
			System.out.println("Has salido de la aplicacion.");
			break;

		default:
			System.out.println("Elija una opcion valida");
		}
		teclado.close();
	}
	
}
