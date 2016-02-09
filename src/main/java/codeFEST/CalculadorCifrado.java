package codeFEST;

/**
 * RETO 1: Cifrado mediante secuencias
 * Nº de enteros menores o iguales, que generan ciclos con 89
 *
 */
public class CalculadorCifrado {

	private char[] obtenerDigitos(int numero) {
		char [] digitos=String.valueOf(numero).toCharArray();
		return digitos;
	}

	private int sumarCuadradosDigitos(char[] digitos) {
		int suma=0;
		for (int i=0; i<digitos.length; i++) {
			suma += Math.pow( Integer.parseInt(""+digitos[i]) , 2 );
		}
		return suma;
	}
	
	private int obtenerSiguienteEnSecuencia(int numero) {
		char[] digitos = obtenerDigitos(numero);
		int suma = sumarCuadradosDigitos(digitos);
		return suma;
	}

	private boolean siGeneraCicloCon89(int numero) {
		int siguiente=numero;
		while (siguiente>1 && siguiente!=89) {
			siguiente=obtenerSiguienteEnSecuencia(siguiente);
		}		
		if (siguiente==89) return true;
		else return false;
	}
	
	public int calcular(int maximo) {
		int contador=0;
		for (int i=0; i<=maximo; i++) {
			if (siGeneraCicloCon89(i)) contador++;
		}
		return contador;
	}
	
	public static void main(String [ ] args) {
		
		CalculadorCifrado calculador = new CalculadorCifrado();
		System.out.println("Resultado: "+calculador.calcular(10000));
	}

	
}
