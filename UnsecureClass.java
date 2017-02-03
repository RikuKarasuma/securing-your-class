package xyz.eureka.software.tips;

// Here we have our insecure class...
public class UnsecureClass 
{
	
	// Because our class is not final any sub-class(extends) of this class will have access
	// to the methods below.
	public void vulnerableMethod1()
	{
		System.out.println("I do some processing.");
	}
	
	public void vulnerableMethod2()
	{
		System.out.println("I do some testing.");
	}
	
	public void vulnerableMethod3()
	{
		System.out.println("I do some printing.");
	}
}
