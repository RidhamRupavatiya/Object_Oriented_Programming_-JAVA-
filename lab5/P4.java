class StaticDemo{
	static int count=0;
	StaticDemo(){
		count++;
	}
	void print(){
		System.out.println("TotalCount = "+count);
	}
}

class P4{
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		s1.print();
	}
}
