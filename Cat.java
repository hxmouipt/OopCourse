public class Cat {
	private int sid = 0;
	private String name;
	int id;
	Cat (String name) {
		this.name = name;
		id = sid ++;
	}
	public void info () {
		System.out.println(" My name is " + name + "No. " + id);
	}

	public static void main (String arg[]) {
		// sid = 100;
		Cat mimi = new Cat ("mimi ");
		Cat pipi = new Cat ("pipi ");
		mimi.info ();
		pipi.info ();
	}

}