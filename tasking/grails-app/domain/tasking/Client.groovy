package tasking

class Client {
	static hasMany = [project:Project]
	String name
	

    static constraints = {
		name(blank:false)
    }
}
