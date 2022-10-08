abstract class Vegetable{
	String color;
	abstract void displayColor(String color);
}

class  Pattota extends Vegetable{
		void displayColor(String color){
 		System.out.println("Potato is " + color);
 	}
}
class  Brinjal extends Vegetable{
		void displayColor(String color){
 		System.out.println("Brinjal is " + color);
 	}
}
class  Tomato extends Vegetable{
		void displayColor(String color){
 		System.out.println("Tomato is " + color);
 	}
}

class P1{
	public static void main(String[] args) {
		Vegetable v;
		v= new Tomato();
		v.displayColor("red");

		v= new Brinjal();
		v.displayColor("purple");

		v= new Pattota();
		v.displayColor("yellow");
	}
}




