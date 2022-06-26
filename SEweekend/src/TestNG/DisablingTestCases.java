package TestNG;

import org.testng.annotations.Test;

public class DisablingTestCases {
	

	@Test
	public void F1()
	{
		System.out.println("F1");
	}
	@Test
	public void F2()
	{
		System.out.println("F2");
	}
	@Test (enabled=false)
	public void F3()
	{
		System.out.println("F3");
	}
	@Test
	public void F4()
	{
		System.out.println("F4");
	}
	
}
