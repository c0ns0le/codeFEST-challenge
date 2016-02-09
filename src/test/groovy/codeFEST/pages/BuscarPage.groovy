package codeFEST.pages

import geb.Page

class BuscarPage extends Page {
		
	static url = "https://es.wikipedia.org/wiki/Especial:Buscar"

	static at = {
		title == 'Buscar - Wikipedia, la enciclopedia libre'
	}

	static content = {
		campoBusqueda { $("input", name: "search") }
		botonBusqueda { $("form#search input", type: "submit") }
	}
}

