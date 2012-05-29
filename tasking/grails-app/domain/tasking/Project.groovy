package tasking

class Project {
	static hasMany = [task:Task]
	String name
	Client client

    static constraints = {
		
    }
}
