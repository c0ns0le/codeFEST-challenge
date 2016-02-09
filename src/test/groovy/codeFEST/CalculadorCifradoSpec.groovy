package codeFEST;

import spock.lang.*

/**
 * Especificación RETO 1: Cifrado mediante secuencias
 * Nº de enteros menores o iguales, que generan ciclos con 89
 *
 */
class CalculadorCifradoSpec extends Specification {
	
	def calculador = new CalculadorCifrado()
	
	def "Spock funciona"() {
		expect:
			true != false
	}
	
	def "Obtener digitos de 42 resulta '4' y '2'"() {
		expect:
			calculador.obtenerDigitos(42) == ['4','2']
	}

	@Unroll
	def "Obtener digitos con distintos juegos de datos: #entrada"() {
		expect:
			calculador.obtenerDigitos(entrada).size().toString() == salidaSize
			calculador.obtenerDigitos(entrada)[0].toString() == salidaDigito0
			if (calculador.obtenerDigitos(entrada).size()>2)
				calculador.obtenerDigitos(entrada)[2].toString() == salidaDigito2
		where:
			entrada | salidaSize | salidaDigito0 | salidaDigito2
			8       | '1'        | '8'           | ''
			678     | '3'        | '6'           | '8'
			12345   | '5'        | '1'           | '3'
	}

	@Unroll
	def "Sumar cuadrados de los digitos con distintos juegos de datos: #entrada"() {
		setup:
			char [] digitos = entrada
		expect:
			calculador.sumarCuadradosDigitos(digitos) == salida
		where:
			entrada               | salida
			['4','2']             | 20
			['8']                 | 64    
			['6','7','8']         | 149   
			['1','2','3','4','5'] | 55  
	}

	@Unroll
	def "Obtener siguiente en secuencia con distintos juegos de datos: #entrada"() {
		expect:
			calculador.obtenerSiguienteEnSecuencia(entrada) == salida
		where:
			entrada | salida
			42      | 20
			8       | 64
			678     | 149
			12345   | 55
	}
	
	@Unroll
	def "Ver si genera ciclo con 89 con distintos juegos de datos: #entrada"() {
		expect:
			calculador.siGeneraCicloCon89(entrada) == salida
		where:
			entrada | salida
			44      | false
			2       | true
	}
	
	@Unroll
	def "Calcular resultado con distintos juegos de datos: #entrada"() {
		expect:
			calculador.calcular(entrada) == salida
		where:
			entrada | salida
			2       | 1
			3       | 2
			4       | 3
			44      | 34
			85      | 70
			10000   | 8558
	}


}


