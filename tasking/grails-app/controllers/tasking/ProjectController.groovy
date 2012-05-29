package tasking

import grails.converters.*;

class ProjectController {
	//def scaffold = Project
	
	def show = {
		
		if(params.id && Project.exists(params.id.toLong())) {
			def p = Project.findByName(params.id.toLong())
			render p as JSON
		}
		else {
			def all = Project.list();
			render all as JSON
		}
		
		}
}
