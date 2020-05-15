
public class TextScanner 
{
	Hello obj;
	public TextScanner(Hello obj)
	{   
		this.obj=obj;
		System.out.println("TextScanner constructor");
	}
	public void scan()
	{
		System.out.println("1constructor");
		obj.Ontext("HELLO :)");
		System.out.println("2constructor");
	}

}
