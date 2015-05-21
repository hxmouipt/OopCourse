class Parent {
	private int n_private = 1;
	int n_friengdly = 2;
	protected int n_protected = 3;
	public int n_public = 4;
}

class child extends Parent {
	public void f () {
		n_private = 10;
		n_friengdly = 20;
		n_protected = 30;
		n_public = 40;
	}
}