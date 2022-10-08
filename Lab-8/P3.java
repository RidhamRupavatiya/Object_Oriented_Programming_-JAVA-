// interface and abstraction
interface Transport{
	void deliver();
}
abstract class Animal{

}

// declaire class and implements of inter face
class Tiger extends Animal{
	void display(){
		System.out.println("tiger class");
	}
}
class Camel extends Animal implements Transport{
	public void deliver(){
		
	}
	void display(){
		System.out.println("Camel class");
	}
}
class Deer extends Animal{
	void display(){
		System.out.println("Deer class");
	}
}
class Donkey extends Animal implements Transport{
	public void deliver(){
		
	}
	void display(){
		System.out.println("Donkey class");
	}
}


// main file
class P3{
	public static void main(String[] args) {
		// Declaration of the main file is in waiting mode ----------------;
	}
}