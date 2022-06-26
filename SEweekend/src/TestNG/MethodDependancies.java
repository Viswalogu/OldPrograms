package TestNG;

import org.testng.annotations.Test;

public class MethodDependancies {
	

	@Test
	public void F1()
	{
		System.out.println("F1");
	}
	@Test(dependsOnMethods= {"F4"})
	public void F2()
	{
		System.out.println("F2");
	}
	@Test 
	public void F3()
	{
		System.out.println("F3");
	}
	@Test
	public void F4()
	{
		System.out.println("F4");
	}
	@Test
	public void F5()
	{
		System.out.println("F5");
	}

}
