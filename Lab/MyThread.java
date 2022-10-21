//1)Create threading with getName,setName() methods.
// java program to set a thread name
// using setName() method

class MyThread implements Runnable {
	public void run() {
		int i = 0;
		
		try {
			System.out.println("Thread : " + Thread.currentThread().getId());
		} catch (Exception e) {
			
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyThread());
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		System.out.println("Thread Name: " + t1.getName());
		System.out.println("Thread Name: " + t2.getName());
		System.out.println("Thread Name: " + t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}