//Test04_Visibility.java
class A {
	//private		int p = 10;
				int q = 20;
	protected	int r = 30;
	public		int s = 40;
    
}

class B extends A{
	void m1(){
		//System.out.println("p: "+ p);   //A.p is not visible
		System.out.println("q: "+ q);
		System.out.println("r: "+ r);
		System.out.println("s: "+ s);
	}
}


class Test04_Visibility{
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
	}
}
