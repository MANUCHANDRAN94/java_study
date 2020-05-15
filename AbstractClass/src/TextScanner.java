
public class TextScanner {
	Hello obj;
	
	public TextScanner(Hello obj) 
	{
		this.obj=obj;
		System.out.println("TextScanner constructor invoked");
	}
    public void scan()
    {
	 obj.OnText("THE SCANNED COPY ");
    }
	
}
