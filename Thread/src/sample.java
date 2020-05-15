
public class sample {
public static void main(String[] args) {
	sampleThread s1=new sampleThread(1);
	sampleThread s2=new sampleThread(2);
	sampleThread s3=new sampleThread(3);
	Thread t=new Thread(s1);
	t.start();
	Thread t1=new Thread(s2);
	t1.start();
	Thread t2=new Thread(s3);
	t2.start();
	
}
}
