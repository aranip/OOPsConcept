package OOPsConcept;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array : to store similar data type values in a array variable
		int i[] = new int[4];
		//lowest bound/index = 0
		//upper bound/index = n-1
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i.length);
		for (int j =0; j< i.length; j++){
			System.out.println(i[j]);
		}
		
		double d[] = new double[3];
		d[0]= 12.33;
		d[1] = 13.88;
		d[2] = 34.45;
		System.out.println(d[2]);
		
		char c[] =  new char[3];
		c[0] = 'e';
		c[1] = 2;
		c[2] = '#';
		System.out.println(c.length);
		
		boolean b[] = new boolean[2];
		b[0] = true;
		 b[1] = false;
		 System.out.println(b[1]);
		 
		 String s[] =  new String[2];
		s[0] =  "Ammu";
		s[1] = "Hello";
	
		System.out.println(s[0]);
		//these are single dimensional array
		
		//disadvantage is ---1.fixed size which is static array-- to overcome this problem we use collections
		//like hahtables,arraylist --use dynamic array
		//2.stores similar datatypes---to overcome this problem we use object array
	//creating object array ---object is a class
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1999";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		//2- dimensional array(rows n columns
		String x[][] = new String[3][5];
		System.out.println(x.length);  //total no. of rows--3
		System.out.println(x[0].length); //total no. of columns---5
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "c";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "c1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "c2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][2]);
		for( int row= 0; row<x.length;row++){
			for(int j = 0 ;j<x[0].length; j++){
			System.out.println(x[row][j]);	
			}
		}
		
	}

}
