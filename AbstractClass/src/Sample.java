
public class Sample extends Hello {

	
	void OnText(String text)	
	{
		System.out.println(text);
	}
	Sample()
	{
		TextScanner t=new TextScanner(this);
		System.out.println("Sample constructor invoked");
		t.scan();
	}
		
	public static void main(String[] args) 
	{
			Sample s=new Sample();
	}	

}
