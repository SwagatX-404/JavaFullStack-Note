class Combination_VAC {
	public static void main(String[] args) {
		
		//1. storing one value and one object by creating PV and RV
		int			x	= 50;
		Example		e1	= new Example();
		
		System.out.println("x       : "+ x);		//50
		System.out.println("e1.i1   : "+ e1.i1);	//5	
		System.out.println("e1.d1   : "+ e1.d1);	//6.7	
		System.out.println("e1.ch   : "+ e1.ch);	//a
		System.out.println("e1.la[0]: "+ e1.la[0]);	//8
		System.out.println("e1.la[1]: "+ e1.la[1]);	//9
		System.out.println("e1.s1   : "+ e1.s1);	//Hari

		//2. storing mulitple values and multiple objects 
		//by creating array object by using PDT and RDT classname
		int[]		ia	= {5, 6, 7};
		Example[]	ea	= {new Example(), new Example()};

		//Reading and printing values from primitive array
		System.out.println(ia);
		System.out.println("  "+ ia[0]);
		System.out.println("  "+ ia[1]);
		System.out.println("  "+ ia[2]);
		System.out.println();
		
		//Reading and printing values from class array
		System.out.println(ea);		
		System.out.println(" "+  ea[0]);		
		System.out.println("    "+  ea[0].i1);		
		System.out.println("    "+  ea[0].d1);		
		System.out.println("    "+  ea[0].ch);		
		System.out.println("    "+  ea[0].la);		
		System.out.println("    "+  ea[0].la[0]);		
		System.out.println("    "+  ea[0].la[1]);		
		System.out.println("    "+  ea[0].s1);		
		System.out.println();		
	
		System.out.println(" "+  ea[1]);		
		System.out.println("    "+  ea[1].i1);		
		System.out.println("    "+  ea[1].d1);		
		System.out.println("    "+  ea[1].ch);		
		System.out.println("    "+  ea[1].la);		
		System.out.println("    "+  ea[1].la[0]);		
		System.out.println("    "+  ea[1].la[1]);		
		System.out.println("    "+  ea[1].s1);		

	}
}