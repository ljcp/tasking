class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		
		"/project/$id"(controller:"project"){
			action = [GET:"show", PUT:"update", DELETE:"delete", POST:"save"]
		}
		
		"/logbook/$id"(controller:"logbook"){
			action = [GET:"show", PUT:"update", DELETE:"delete", POST:"save"]
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
