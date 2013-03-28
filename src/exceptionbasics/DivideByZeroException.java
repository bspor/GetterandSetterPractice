package exceptionbasics;

/**
 * DivideByZeroException is a custom exception class that
 * inherits from ArithmeticException. It contains both a
 * default constructor and a custom constructor (one default is
 * used in DivideByZeroTest, although you can edit that class
 * to use the custom version).
 * <p>
 * What's up with the call to super? Why is this necessary?
 * Think hard about this!
 */
public class DivideByZeroException extends ArithmeticException {
             
   // no-argument constructor specifies default error message
   public DivideByZeroException() 
   {
   	  // Why are we doing this??
      super( "Attempted to divide by zero" );
   }

   // constructor to allow customized error message
   public DivideByZeroException( String message )
   {

	// Why are we doing this??
    super( message );
   }

}  // end class DivideByZeroException
