// Using Runnable interface instead of having a class to Extend Thread. 

class Print100 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			System.out.println("Number: " + i);
		}

		System.out.println("First Thread completed.");
	}

}

class Print200 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 201; i++) {
			System.out.println("Num: " + i);
		}

		System.out.println("Second Thread completed.");
	}

}

public class MyRunnable {
	public static void main(String[] args) {

		Runnable first = new Print100();
		Runnable second = new Print200();

		// Pass the instance of the runnable to the
		// Thread constructor;
		Thread t1 = new Thread(first);
		Thread t2 = new Thread(second);

		// You can set priorities on the thread
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		// Call the start method on the threads to start it
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Something went wrong: " + e);
		}

		// Using the .join() method on the threads above makes sure that
		// Other execution of the code wait until the threads complete before
		// going on.

		System.out.println("Let's see if this comes before or after thread");

	}
}

// Alternatively, you can use the lambda functions in place of creating a new
// class in the event where the thread is used just once in the code.