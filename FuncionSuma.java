import java.util.Scanner;

/**
 *<h2>Programa suma, para calcular la suma de dos valores introducidos por teclado</h2>
 *@version v1.0
 *@author Miquel
 *@see <p>Para más información ver <a href="https://www.google.com">Google</a>
 */

public class FuncionSuma {

	/**
	 * Variable para guardar el primer sumando
	 */
	private static int primerSumando;
	
	/**
	 * Variable para guardar el primer sumando
	 */
	private static int segundoSumando; 
	
	/**
	 * Funcion principal del programa
	 * @param args- el parametr habitual de la funcion main
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/**
	 * Funcion que raliza la suma de los dos operandos
	 * @param sumando1 - Primer sumando de la operacion suma
	 * @param sumando2 - Segundo sumando de la operacion suma
	 * @return Devuelve el resultado de sumar los dos sumandos
	 */
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
