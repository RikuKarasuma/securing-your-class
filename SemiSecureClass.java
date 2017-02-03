package xyz.eureka.software.tips;

/**
 *	Here is our semi secure class, from which we can selectively choose which methods
 *	to make safe from re-implementation.
 */
public class SemiSecureClass 
{

	// We used the final keyword on this method because we don't want it to ever be overridden.
	public final void safeMethod()
	{
		
	}
	
	// We need this method to be overridden for some reason so it is left unsafe.
	public void unsafeMethod()
	{
		
	}
}
