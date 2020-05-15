
public class Sample implements Hello 
{
	public void Ontext(String text)
	{  
		System.out.println("3constructor");
		System.out.println(text);
		System.out.println("4constructor");
	}
	Sample()
	{
		TextScanner t=new TextScanner(this);
		System.out.println("Sample constructor");
		t.scan();
	}
	public static void main(String[] args) 
	{
		Sample s=new Sample();	
	}
	
}
