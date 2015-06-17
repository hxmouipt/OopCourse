public class ThisLeaf {
	int i = 0;
	ThisLeaf(int i) { this.i = i;}
	ThisLeaf increament () {
		i++;
		return this;
	}
	void print() { System.out.println("i = " + i); }

	public static void main (String[] args) {
		ThisLeaf leaf = new ThisLeaf(100);
		leaf.increament().increament().print();
	}
}