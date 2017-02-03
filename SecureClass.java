package xyz.eureka.software.tips;

// Here we have our secure class, because we have used the keyword final in the class
// declaration. No other class can sub-class this one instance and gain access to its methods.
public final class SecureClass 
{
	
	// These methods are now safe against re-implementations/overriding.
	public void safeMethod1()
	{
		System.out.println("I do some processing.");
	}
	
	public void safeMethod2()
	{
		System.out.println("I do some testing.");
	}
	
	public void safeMethod3()
	{
		System.out.println("I do some printing.");
	}
}
