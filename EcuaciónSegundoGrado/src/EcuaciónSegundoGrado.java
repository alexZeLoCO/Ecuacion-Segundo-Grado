import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class EcuaciónSegundoGrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER

		System.out.println("Forma de la ecuación: ax^2+bx+c=0");		//MOSTRAR AL USUARIO LA FORMA DE LA ECUACIÓN

		System.out.print("Introduzca el valor de a: ");		//SOLICITAR VALOR DE A
		double a = teclado.nextDouble();		//ALMACENAR A EN a
		System.out.print("Introduzca el valor de b: ");		//SOLICITAR VALOR DE B
		double b = teclado.nextDouble();		//ALMACENAR B EN b
		System.out.print("Introduzca el valor de c: ");		//SOLICITAR VALOR DE C
		double c = teclado.nextDouble();		//ALMACENAR C EN c

		double root = Math.sqrt(Math.pow(b, 2)-4*a*c);		//EVALUAR RAÍZ CUADRADA

		if (Double.isNaN(root)) {		//CONDICIÓN: SI RAÍZ CUADRADA CON SOLUCIÓN NaN (Not A Number)
			System.out.print("La ecuación tiene solución imaginaria.");
			System.exit(0);		//CERRAR PROGRAMA

		} else {		//CONDICIÓN FALSA ==> RAÍZ CON SOLUCIÓN REAL
			double xM = -b + Math.sqrt(Math.pow(b, 2)-4*a*c) / 2*a;		//OBETENER VALOR REAL SUMANDO RAÍZ
			double xm = -b - Math.sqrt(Math.pow(b, 2)-4*a*c) / 2*a;		//OBTERNER VALOR REAL RESTANDO RAÍZ
			System.out.printf("La ecuación tiene dos soluciones reales: %.3f y %.3f.", xM,xm);		//DEVOLVER RESULTADOS
		}		
	}
}