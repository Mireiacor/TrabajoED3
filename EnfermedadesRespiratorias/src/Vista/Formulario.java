package Vista;

import java.util.Scanner;

import Modelo.Enfermedad;
import Modelo.Gripe;
import Modelo.Neumonia;

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

	public void pideDatos(Enfermedad e) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Le vamos a realizar una serie de preguntas a las cuales contestará si o no, no existe otro tipo de respuesta");
		System.out.println("¿Tienes o has tenido fiebre en las últimas 24h?");
		char respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 's' || respuesta == 'S') {
			e.setFiebre(true);
		} else if (respuesta == 'n' || respuesta == 'N') {
			e.setFiebre(false);
		}
		System.out.println("¿Nota que tose a menudo?");
		respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 's' || respuesta == 'S') {
			e.setTos(true);
		} else if (respuesta == 'n' || respuesta == 'N') {
			e.setTos(false);
		}
		if (e.isTos() == true) {
			System.out.println("¿Tiene tos seca?");
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				e.setTipoTos(true);
			} else if (respuesta == 'n' || respuesta == 'N') {
				e.setTipoTos(false);
			}
			if (e.isTipoTos() == false) {
				System.out.println("¿Tiene tos con flemas?");
				respuesta = teclado.nextLine().charAt(0);
				if (respuesta == 's' || respuesta == 'S') {
					e.setTipoTos(true);
				} else if (respuesta == 'n' || respuesta == 'N') {
					e.setTipoTos(false);
				}
			}
		} else {
			Gripe g = new Gripe();
			System.out.println("¿Tiene dolor de cabeza?");
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				g.setDolorCabeza(true);
			} else if (respuesta == 'n' || respuesta == 'N') {
				g.setDolorCabeza(false);
			}
			System.out.println("¿Tienes dificultades para respirar?");
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				g.setDificultadRespiratoria(true);
			} else if (respuesta == 'n' || respuesta == 'N') {
				g.setDificultadRespiratoria(false);
			}
			Neumonia n = new Neumonia();
			System.out.println("¿Tienes escalofríos?");
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 's' || respuesta == 'S') {
				n.setEscalofrios(true);
			} else if (respuesta == 'n' || respuesta == 'N') {
				n.setEscalofrios(false);
			}
			//tienes que seguir así con todas las preguntas. Un kiss
		}

	}
}
