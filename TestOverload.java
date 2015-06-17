public class TestOverload {
	void max (int a , int b ) {
		System.out.println ("int=");
		System.out.println(a > b ? a : b);
	}

	void max (short a, short b) {
		System.out.println ("short=");
		System.out.println(a > b ? a : b);		
	}


	void max (float a, float b) {
		System.out.println ("float=");
		System.out.println(a > b ? a : b);		
	}

	public static void  main (String[]  arg) {
		TestOverload t = new TestOverload ();
		t.max(3 ,4);
		short a = 3;
		short b = 5;
		t.max (a, b);
	}
}