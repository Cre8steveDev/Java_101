// Threads: A thread is a lightweight unit of execution within a process. It is the smallest sequence of programmed instructions that can be managed independently by a scheduler. Threads are used to perform concurrent operations, allowing multiple tasks to run simultaneously within a single program.

// In every thread you need to have a run method; The code that should be 
// run on the thread should be defined in the run method. The thread 
// can be activated using .start() on the instantiated thread object. 

class FirstThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("In first thread: " + i);

			// You can have a thread wait for some time using
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class SecondThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("In Second thread: " + i);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {
	public static void main(String[] args) {
		FirstThread firstAction = new FirstThread();
		SecondThread secondAction = new SecondThread();

		// You can set the priority to a thread using the setPriority method. Priorities
		// rage from 1 to 10.

		// Start the threads

		firstAction.start();
		secondAction.start();

	}
}