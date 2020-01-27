
public class WorkThread extends Thread {

	public WorkThread(String name) {
		super(name);
	}
	public void run() {
		System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        try {
        	for (int i = 0; i < 10; i++) {
        		Thread.sleep(500);
        		System.out.println("-------"+this.currentThread().getName()+"-------------");
			}
            
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
	}
}
