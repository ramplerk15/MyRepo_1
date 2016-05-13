package at.fhj.swd.konfmana;

public class HelloWorldMain {

	public static void main(String[] args) {
		HelloWorld hw;
		if(args.length > 0){
			 hw = new HelloWorld(args[0]);
		} else {
			 hw = new HelloWorld();
		}
			
		System.out.println(hw.toString());

	}

}
