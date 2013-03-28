package exceptionbasics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author instlogin
 */
public class MyCustomException extends Exception {
    private Logger log =
            Logger.getLogger("exceptionbasics.MyCustomException");

    // no-argument constructor specifies default error message
   public MyCustomException()
   {
      super( "Attempted to divide by zero" );
       log.log(Level.INFO, "Attempt to divide by zero.");
   	  // Why are we doing this??
   }

   // constructor to allow customized error message
   public MyCustomException( String message )
   {

	// Why are we doing this??
    super( message );
   }

   // constructor to allow customized error message
   public MyCustomException( String message, Throwable cause )
   {

	// Why are we doing this??
    super( message, cause );
   }

   // constructor to allow customized error message
   public MyCustomException( Throwable cause )
   {

	// Why are we doing this??
    super( cause );
   }

}
