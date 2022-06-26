package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test (groups= {"odd"})
	public void F1()
	{
		System.out.println("F1");
	}
	@Test (groups= {"even"})
	public void F2()
	{
		System.out.println("F2");
	}
	@Test (groups= {"odd"})
	public void F3()
	{
		System.out.println("F3");
	}
	@Test (groups= {"even"})
	public void F4()
	{
		System.out.println("F4");
	}
	
}



