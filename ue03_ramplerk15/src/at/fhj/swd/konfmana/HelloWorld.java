package at.fhj.swd.konfmana;

public class HelloWorld {

	private String name=null;

	public HelloWorld(String name){
		setName(name);
	}
	
	public HelloWorld(){
		setName(null);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name!=null){
			this.name = name.trim();
		} else {
			this.name = null;
		}
	}
	
	@Override
	public String toString(){
		if (name==null||name.isEmpty()){
			return "Hello World!";
		} else {
			return "Hello World! Hello "+name+"!";
		}
		
	}
	
}
