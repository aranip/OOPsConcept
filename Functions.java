package OOPsConcept;

public class Functions {
//main method is starting point of execution
	public static void main(String[] args) {
		Functions obj = new Functions();  //obj is the object refernce variable and 
		                                   //new Functions is the object which is created
		//after creating the object the copy of all non-static methods will be 
		//given to this particular object
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String a = obj.qa();
		System.out.println(a);
		int c = obj.div(30, 10);
		System.out.println(c);
		//main method is void never returns a value
	}
//non static methods
	//void ---doesnot return any value
	public void test() { //no input no o/p
		System.out.println("test method");  
	}
	
	//return type int
	public int pqr() {    //no input some o/p
		System.out.println("PQR method");
		int a= 10;
		int b =20;
		int c= a+b;
		return c;
	}
	public String qa() {  //no i/p some o/p
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}
	// x and y are input parameters/arguments
	public int div(int x, int y) {
		System.out.println("division method");
		int d =x/y;
		return d;
	}
}
