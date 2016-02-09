package codeFEST;

import spock.lang.*
import geb.spock.GebSpec
import codeFEST.pages.*
 
class WikipediaSpec extends GebSpec {
	
	@Unroll
	def "Cuando se busca #entrada, sugiere articulo si existe igual, y no devuelve resultados si es muy desigual."() {
		when: to BuscarPage
		then: at BuscarPage
		when:
			campoBusqueda.value(entrada)
			botonBusqueda.click()
		then:
			waitFor { at ResultadosBusquedaPage}
			articuloSugerido == salidaArticuloSugerido
			primerElemento == salidaPrimerElemento 
		where:
			entrada       | salidaArticuloSugerido | salidaPrimerElemento
			"Spock"       | true                   | "Spock"
			"Spock2"      | false                  | "Spock"
			"Spock123456" | false                  | ""
	}

}


