package ejercicios2;
import java.util.Scanner;
/*1. Dado el texto del d�a del mes que devuelva el n�mero correspondiente a ese mes.
Mes: Febrero
Febrero es el 2.*/
public class EjerMes {

	public static void main(String[] args) {
		//Creamos el objeto Scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
		String mes;
		int numMes = 0;
		String error;
		//Pedir mes por consola
		System.out.println("Ingrese el mes que desea comprobar");
		//Ingresar mes por teclado 
		mes =teclado.nextLine();
		
		//Proceso de datos
			switch (mes){
			case "Enero": numMes=1;
				break;
			case "Febrero": numMes=2;
			break;
			case "Marzo": numMes=3;
			break;
			case "Abril": numMes=4;
			break;
			case "Mayo": numMes=5;
			break;
			case "Junio": numMes=6;
			break;
			case "Julio": numMes=7;
			break;
			case "Agosto": numMes=8;
			break;
			case "Septiembre": numMes=9;
			break;
			case "Octubre": numMes=10;
			break;
			case "Noviembre": numMes=11;
			break;
			case "Diciembre": numMes=12;
			break;
			//default: numMes=error;
			
			}//switch
			System.out.println("El mes " + mes + " est� en la posici�n " + numMes);
	}

}
