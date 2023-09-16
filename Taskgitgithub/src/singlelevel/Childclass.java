package singlelevel;

public class Childclass extends Parentclass{

	public static void main(String[] args) {
		Childclass z=new Childclass();
		 z.tyres();
		 z.rpm();
		 z.engine();
		 z.breaks();
		 
	

	}
	public void tyres() {
		System.out.println("tyres are good");
		
	}
	public void rpm() {
		System.out.println("rpmcondition good");
	}

}
	


