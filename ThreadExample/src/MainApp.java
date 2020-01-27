
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RunOnlyThread();
		RunManyThread();
	}

	private static void RunOnlyThread() {
		System.out.println("Hello my program");

		WorkThread thread = new WorkThread("GoingToWork");
		thread.start();
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(250);
				System.out.println("||||||||||||||||||||||||||");
			}
		} catch (Exception e) {
			System.out.println("Bad work sleep.");
		}

		System.out.println("End my program");
	}
	
	private static void RunManyThread() {
		System.out.println("Hello my program");

		for (int i = 0; i < 3; i++) {
			new WorkThread("GoingToWork"+i).start();
		}
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(250);
				System.out.println("||||||||||||||||||||||||||");
			}
		} catch (Exception e) {
			System.out.println("Bad work sleep.");
		}

		System.out.println("End my program");
	}

}
