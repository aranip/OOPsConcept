package OOPsConcept;

public class car {

	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
//new car(); --this is the object of car class
	//new keyword is used to create the object
		//a,b,c are object reference variables
		car a = new car();
		car b = new car();
		car c = new car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		 
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after shifting the references");
		 a=b;
		 b=c;
		 c=a;
		  a.mod =10;
		  System.out.println(a.mod);//a =10
		  c.mod =20;
		  System.out.println(a.mod); //a =20
		  System.out.println(c.mod);
		  
	}

}
