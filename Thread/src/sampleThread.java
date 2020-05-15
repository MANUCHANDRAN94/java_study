
public class sampleThread  implements Runnable{
	
	
	int a;
	sampleThread(int a)
	{this.a=a;
	
	}
	
	public void run() {
		
	//	super.run();
	
	for(int i=0;i<5;i++)
	{
		System.out.println("count  "+i+"  thread  "+a);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
