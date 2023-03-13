package PrimerPaquete;

public class Clase1Eercicio1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// clase1 ejercicio 1-A//
		int numeroInicio=5, numeroFin=14;
		/*while (numeroInicio<=numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;	
		}//fin while//*/
		//ejercicio 1-B//
		
		/*while (numeroInicio<numeroFin) {
			if (numeroInicio %2 == 0) {
			   System.out.println(numeroInicio);
			   
			}  //fin if// 
			numeroInicio +=1;
		}//fin while//*/
		
		//ejercicio 1-C//
		/*boolean pares = false;
		while (numeroInicio<numeroFin) {
		  if (pares == true) { 	
			  System.out.println("Muestro los pares");
			if (numeroInicio %2 == 0) {
			   System.out.println(numeroInicio);
			}//fin if//   
			numeroInicio +=1;
		  }//fin if//
		  else {
			  System.out.println("Muestro los impares");
			  if (numeroInicio %2 != 0 ) {
				  System.out.println(numeroInicio);				  
			  }//fin if//
				numeroInicio +=1;
		  } //fin else//                       
		}//fin while//*/
		
    //ejercicio 1-D//
		
		System.out.println("Numeros en forma decreciente:");
		for (int i=numeroFin; i>=numeroInicio; i--) {
			if (numeroFin %2 == 0) {
				   System.out.println(numeroFin);
				}//fin if//   
				numeroFin-=1;
		}//fin if//	
	}//fin main//
	}

		

