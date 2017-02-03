package xyz.eureka.software.tips;

// Our malicious class that is already within our JVM has extended our
// vulnerable class and now has access to all methods not declared final.
public class MaliciousClass extends UnsecureClass
{
	
	public MaliciousClass() 
	{
		System.out.println("Running our malicious class\n");
	}
	
	// Here it has overridden our processing method.
	@Override
	public void vulnerableMethod1() 
	{	
		// By using super we can use the hijacked classes functionality.
		super.vulnerableMethod1();
		
		// Here we inject our own functionality.
		System.out.println("Our own injected code 1.\n");
	}
	
	// Here it has overridden our testing method.
	@Override
	public void vulnerableMethod2() 
	{
		// By using super we can use the hijacked classes functionality.
		super.vulnerableMethod2();

		// Here we inject our own functionality.
		System.out.println("Our own injected code 2.\n");
	}
	
	// Here it has overridden our printing method.
	@Override
	public void vulnerableMethod3() 
	{
		// By using super we can use the hijacked classes functionality.
		super.vulnerableMethod3();
		
		// Here we inject our own functionality.
		System.out.println("Our own injected code 3.\n");
	}
	
	/**
	 * Because we have not used the final keyword in either our class or our methods, the
	 * malicious class now has the ability to use each of these methods functionality above
	 * and inject its own functionality as well. 
	 *
	 */
	public static void main(String[] args)
	{
		MaliciousClass intruder = new MaliciousClass();
		intruder.vulnerableMethod1();
		intruder.vulnerableMethod2();
		intruder.vulnerableMethod3();
	}
}
