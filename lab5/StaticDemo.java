class StaticD{
	static int count=0;
	StaticD()
	{
		count++;
		System.out.println(count);
	}
}

class StaticDemo{
	public static void main(String[] args){
		StaticD s=new StaticD();
		StaticD s1=new StaticD();
		StaticD s2=new StaticD();
	}
}