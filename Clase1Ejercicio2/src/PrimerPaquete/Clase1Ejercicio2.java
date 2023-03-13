package PrimerPaquete;

public class Clase1Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ingresos = 489083;
		int vehiculos = 3;
		int inmuebles = 3;
		boolean economiaplena = true;
		
		if ( (ingresos < 489083) &&
		( vehiculos <3) &&
		(inmuebles <3)&& (economiaplena==false) ) {
		System.out.println("Categoría A");
		} //fin if//
		else if((ingresos < 489083)||
		(vehiculos < 3)||
		(inmuebles < 3)||(economiaplena==false) ) {
		System.out.println("Categoría B");
		}//fin else if//
		else if( (ingresos >= 489083) &&
		( vehiculos >= 3) &&
		(inmuebles >= 3)&& (economiaplena==true) ) {
		System.out.println("Categoría C");
		} //fin else if//
	}//fin main//

}
