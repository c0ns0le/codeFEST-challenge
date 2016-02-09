package codeFEST.pages

import geb.Page

class ResultadosBusquedaPage extends  Page {
	
	static at = {
		title.startsWith "Resultados de la b"
	}

	static content = {
		articuloSugerido { $(".mw-search-exists").size()>0 }
		primerElemento { 
			if ( $(".mw-search-result-heading").size()>0 ) 
				$(".mw-search-result-heading", 0).text() 
			else 
				"" 
			}
	}
}

