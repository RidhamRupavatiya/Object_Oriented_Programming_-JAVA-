class Ru1 extends Thread{
	public void run(){
		for(int i=0 ; i<=1000 ; i++){
			System.out.println("Good Mornig");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				//e.printStrace();
			}
		}
	}
}

class Ru2 extends Thread{
	public void run(){
		for(int i=0 ; i<=3000 ; i++){
			System.out.println("Good AfterNoon");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				//e.printStrace();
			}
		}
	}
}

public class MultiThread{
	public static void main(String[] args) {
		Ru1 r1 = new Ru1();
		Ru2 r2 = new Ru2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}