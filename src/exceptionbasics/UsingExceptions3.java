package exceptionbasics;

/**
 * UsingExceptions3 demonstrates the getMessage() and printStackTrace()
 * methods.
 * <p>
 * Method getMessage() returns the descriptive String stored
 * in an exception (if the exception class was written to provide it).
 * <p>
 * Method printStackTrace() outputs to the standard error stream
 * (normally the command line or console) an error message with the class
 * name of the exception, the descriptive String stored in the exception
 * and a list of the methods that had not completed execution when the 
 * exception was thrown (i.e., all methods currently residing on the 
 * method call stack).
 */
public class UsingExceptions3 {

   // execute application
   public static void main( String args[] ) 
   {
      // call method1 
      try {
         method1();
      }

      // catch Exceptions thrown from method1
      catch ( Exception exception ) {
          String msg = exception.getMessage();

//         System.err.println( exception.getMessage() + "\n" );
         //exception.printStackTrace();
//          System.out.println("an exception has occurred");
//          throw new Exception("Custom message");
      }
   }

   // call method2; throw exceptions back to main
   public static void method1() throws Exception
   {
      method2();
      throw new IllegalArgumentException("my message");
   }

   // call method3; throw exceptions back to method1
   public static void method2() throws Exception
   {
      method3();
   }

   // throw Exception back to method2
   public static void method3() throws Exception
   {
      throw new Exception( "Exception thrown in method3" );
   }

}  // end class Using Exceptions
