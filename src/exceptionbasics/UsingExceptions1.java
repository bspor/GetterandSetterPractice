package exceptionbasics;

import javax.swing.*;

/**
 * UsingExceptions1 demonstrates that the finally block
 * (if one is present) executes even if an exception is not thrown in
 * the corresponding try block.
 * <p>
 * Also, note lines 16, 34 and 42. Do you understand the order of execution?
 * Where are these new exceptions handled?
 */
public class UsingExceptions1 {
	private int[] ints = {1,2,3,4};
	
   // execute application
   public static void main( String args[] )
   {
	   UsingExceptions1 obj = new UsingExceptions1();
	   
	   obj.getInts();

       obj.doesNotThrowException();
   }

   // demonstrate try/catch/finally
   public void getInts()
   {
      System.out.println( "getInts() method called..." );

      // try some code and handle any Exceptions that are thrown
//      try {
         // This will cause an IndexOutOfBoundsException (unchecked)
         // Processing stops at the point where the Exception is thrown
         for(int i=0; i < ints.length+1; i++) {
        	 int value = ints[i];
         }
         
         System.out.println("This line is never excecuted in getInts().");
      
      // Handler for one type of Exception
//      } catch( IndexOutOfBoundsException iobe ) {  // This is the handler block
//         System.err.println("\tException handled in method getInts" );
//         JOptionPane.showMessageDialog(null, "Sorry, your array index reference is out of bounds.",
//        		 "Gracefull Problem Recovery", JOptionPane.ERROR_MESSAGE);

      // Handler for any other type of Exception
//      } catch(Exception e) {
//    	  // do something
//      }

      // this block executes regardless of what occurs in 
      // try/catch
//      finally {
//         System.err.println("\tFinally block executed in getInts()");
//      }

      // this code MAY or MAY NOT be reached
      System.out.println("\tThis line #57 can only be reached in getInts() if the\n " + 
    		  "handler allows it by not causing the program to exit and\n " + 
    		  "not handling the exception in a way that causes another exception to be thrown.");
      System.out.println("End of method getInts()" );
   }

   // demonstrate finally when no exception occurs
   public void doesNotThrowException()
   {
      System.out.println( "\ndoesNotThrowException() method called..." );
      
      // try block does not throw an exception
      String s = null;
      try {
         s = "Code does not throw Exception";
      }

      // catch does not execute, because no exception thrown
      catch( Exception exception )
      {
         System.out.println( exception.getMessage() );
      }

      // this block executes regardless of what occurs in 
      // try/catch
      finally {
         System.out.println("\tFinally executed in doesNotThrowException" );
      }

      System.out.println("End of method doesNotThrowException()" );
   }

}  // end class UsingExceptions1
